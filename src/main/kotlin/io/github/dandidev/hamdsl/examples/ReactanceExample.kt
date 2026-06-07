package io.github.dandidev.hamdsl.examples

import io.github.dandidev.hamdsl.dsl.si.MHz
import io.github.dandidev.hamdsl.dsl.si.pF
import io.github.dandidev.hamdsl.dsl.si.uH
import io.github.dandidev.hamdsl.format.UnitFormatter
import io.github.dandidev.hamdsl.math.capacitiveReactance
import io.github.dandidev.hamdsl.math.inductiveReactance

fun main() {
    // Component values
    val capacitance = 100.pF
    val inductance = 10.uH

    // Operating frequency (40m amateur band)
    val frequency = 7.1.MHz

    // Reactance at operating frequency
    val xc = capacitiveReactance(frequency, capacitance)
    val xl = inductiveReactance(frequency, inductance)

    // Reference frequency (20m amateur band)
    val frequencyDouble = 14.2.MHz

    // Reactance at double the frequency
    val xcDouble = capacitiveReactance(frequencyDouble, capacitance)
    val xlDouble = inductiveReactance(frequencyDouble, inductance)

    val result = """
        Capacitance                  : ${UnitFormatter.format(capacitance)}
        Inductance                   : ${UnitFormatter.format(inductance)}
        --------------------------------------------
        Frequency (40m)              : ${UnitFormatter.format(frequency)}
        Capacitive Reactance         : ${UnitFormatter.format(xc)}
        Inductive Reactance          : ${UnitFormatter.format(xl)}
        --------------------------------------------
        Frequency (20m)              : ${UnitFormatter.format(frequencyDouble)}
        Capacitive Reactance         : ${UnitFormatter.format(xcDouble)}
        Inductive Reactance          : ${UnitFormatter.format(xlDouble)}
        """.trimIndent()

    println(result)
}