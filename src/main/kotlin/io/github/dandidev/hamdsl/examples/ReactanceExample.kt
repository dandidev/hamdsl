package io.github.dandidev.hamdsl.examples

import io.github.dandidev.hamdsl.dsl.si.MHz
import io.github.dandidev.hamdsl.dsl.si.pF
import io.github.dandidev.hamdsl.format.UnitFormatter
import io.github.dandidev.hamdsl.math.capacitiveReactance

fun main() {
    // Capacitor value
    val capacitance = 100.pF

    // Operating frequency (40m amateur band)
    val frequency = 7.1.MHz

    // Capacitive reactance at operating frequency
    val xc = capacitiveReactance(frequency, capacitance)

    // Reference frequency (20m amateur band)
    val frequencyDouble = 14.2.MHz

    // Capacitive reactance at double the frequency
    val xcDouble = capacitiveReactance(frequencyDouble, capacitance)

    val result = """
        Capacitance                  : ${UnitFormatter.format(capacitance)}
        --------------------------------------------
        Frequency (40m)              : ${UnitFormatter.format(frequency)}
        Capacitive Reactance         : ${UnitFormatter.format(xc)}
        --------------------------------------------
        Frequency (20m)              : ${UnitFormatter.format(frequencyDouble)}
        Capacitive Reactance         : ${UnitFormatter.format(xcDouble)}
        """.trimIndent()

    println(result)
}