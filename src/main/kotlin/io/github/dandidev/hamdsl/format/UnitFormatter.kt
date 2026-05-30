package io.github.dandidev.hamdsl.format

import io.github.dandidev.hamdsl.SI
import io.github.dandidev.hamdsl.units.log.Db
import io.github.dandidev.hamdsl.units.log.Dbm
import io.github.dandidev.hamdsl.units.si.Ampere
import io.github.dandidev.hamdsl.units.si.Ohm
import io.github.dandidev.hamdsl.units.si.Volt
import io.github.dandidev.hamdsl.units.si.Watt
import java.util.Locale
import kotlin.math.abs

object UnitFormatter {

    fun format(db: Db): String =
        String.format(Locale.US, "%.4f dB", db.value)

    fun format(dbm: Dbm): String =
        String.format(Locale.US, "%.4f dBm", dbm.value)

    fun format(voltage: Volt): String =
        autoSi(voltage.value, "V")

    fun format(current: Ampere): String =
        autoSi(current.value, "A")

    fun format(power: Watt): String =
        autoSi(power.value, "W")

    fun format(resistance: Ohm): String =
        autoSi(resistance.value, "Ω")

    private fun autoSi(value: Double, unit: String): String {
        val absValue = abs(value)

        val scaled: Double
        val symbol: String

        when {
            absValue >= SI.GIGA -> {
                scaled = value / SI.GIGA
                symbol = "G$unit"
            }

            absValue >= SI.MEGA -> {
                scaled = value / SI.MEGA
                symbol = "M$unit"
            }

            absValue >= SI.KILO -> {
                scaled = value / SI.KILO
                symbol = "k$unit"
            }

            absValue >= 1.0 -> {
                scaled = value
                symbol = unit
            }

            absValue >= SI.MILLI -> {
                scaled = value / SI.MILLI
                symbol = "m$unit"
            }

            absValue >= SI.MICRO -> {
                scaled = value / SI.MICRO
                symbol = "µ$unit"
            }

            absValue >= SI.NANO -> {
                scaled = value / SI.NANO
                symbol = "n$unit"
            }

            else -> {
                scaled = value
                symbol = unit
            }
        }

        return String.format(Locale.US, "%.4f %s", scaled, symbol)
    }
}