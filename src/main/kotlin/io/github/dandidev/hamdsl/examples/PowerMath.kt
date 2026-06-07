package io.github.dandidev.hamdsl.examples

import io.github.dandidev.hamdsl.dsl.si.A
import io.github.dandidev.hamdsl.dsl.si.V
import io.github.dandidev.hamdsl.dsl.si.ohm
import io.github.dandidev.hamdsl.format.UnitFormatter
import io.github.dandidev.hamdsl.math.toDbm
import io.github.dandidev.hamdsl.math.toWatt

fun main() {
    // Transmitter supply
    val voltage = 13.8.V
    val current = 10.A

    // Power from voltage and current
    val powerFromVI = voltage.toWatt(current)

    // Power from current and resistance
    val impedance = 50.ohm
    val powerFromIR = current.toWatt(impedance)

    // Convert to dBm
    val powerFromVIDbm = powerFromVI.toDbm()
    val powerFromIRDbm = powerFromIR.toDbm()

    // dBm back to watts
    val powerFromDbm = powerFromVIDbm.toWatt()

    val result = """
        Supply Voltage               : ${UnitFormatter.format(voltage)}
        Supply Current               : ${UnitFormatter.format(current)}
        Load Impedance               : ${UnitFormatter.format(impedance)}
        --------------------------------------------
        Power (U × I)                : ${UnitFormatter.format(powerFromVI)}
        Power (U × I) in dBm         : ${UnitFormatter.format(powerFromVIDbm)}
        --------------------------------------------
        Power (I² × R)               : ${UnitFormatter.format(powerFromIR)}
        Power (I² × R) in dBm        : ${UnitFormatter.format(powerFromIRDbm)}
        --------------------------------------------
        dBm back to Watts            : ${UnitFormatter.format(powerFromDbm)}
        """.trimIndent()

    println(result)
}