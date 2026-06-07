package io.github.dandidev.hamdsl.format

import io.github.dandidev.hamdsl.constants.SI
import io.github.dandidev.hamdsl.units.log.Db
import io.github.dandidev.hamdsl.units.log.Dbm
import io.github.dandidev.hamdsl.units.si.*
import java.util.*
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

    fun format(frequency: Hertz): String =
        autoSi(frequency.value, "Hz")

    fun format(capacitance: Farad): String =
        autoSi(capacitance.value, "F")

    fun format(inductance: Henry): String =
        autoSi(inductance.value, "H")

    fun format(distance: Meter): String =
        autoSi(distance.value, "m", true)

    private fun autoSi(
        value: Double,
        unit: String,
        useCenti: Boolean = false
    ): String {
        val absValue = abs(value)

        val scaled: Double
        val symbol: String

        when {
            absValue >= SI.TERA -> {
                scaled = value / SI.TERA
                symbol = "T$unit"
            }

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

            useCenti && absValue >= SI.CENTI -> {
                scaled = value / SI.CENTI
                symbol = "c$unit"
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

            absValue >= SI.PICO -> {
                scaled = value / SI.PICO
                symbol = "p$unit"
            }

            absValue >= SI.FEMTO -> {
                scaled = value / SI.FEMTO
                symbol = "f$unit"
            }

            else -> {
                scaled = value
                symbol = unit
            }
        }

        return String.format(Locale.US, "%.4f %s", scaled, symbol)
    }
}