package io.github.dandidev.hamdsl.examples

import io.github.dandidev.hamdsl.dsl.si.MHz
import io.github.dandidev.hamdsl.dsl.si.pF
import io.github.dandidev.hamdsl.dsl.si.uH
import io.github.dandidev.hamdsl.format.UnitFormatter
import io.github.dandidev.hamdsl.math.capacitanceForResonance
import io.github.dandidev.hamdsl.math.inductanceForResonance
import io.github.dandidev.hamdsl.math.resonantFrequency

fun main() {
    // Component values
    val inductance = 10.uH
    val capacitance = 100.pF

    // Resonant frequency from known L and C
    val frequency = resonantFrequency(inductance, capacitance)

    // Target frequencies for component calculation
    val frequency40m = 7.1.MHz
    val frequency20m = 14.2.MHz

    // Required capacitance for target frequencies (fixed inductance)
    val capacitanceFor40m = capacitanceForResonance(frequency40m, inductance)
    val capacitanceFor20m = capacitanceForResonance(frequency20m, inductance)

    // Required inductance for target frequencies (fixed capacitance)
    val inductanceFor40m = inductanceForResonance(frequency40m, capacitance)
    val inductanceFor20m = inductanceForResonance(frequency20m, capacitance)

    val result = """
        Known Components
        --------------------------------------------
        Inductance                   : ${UnitFormatter.format(inductance)}
        Capacitance                  : ${UnitFormatter.format(capacitance)}
        Resonant Frequency           : ${UnitFormatter.format(frequency)}
        
        Required Capacitance (fixed L = ${UnitFormatter.format(inductance)})
        --------------------------------------------
        Target Frequency (40m)       : ${UnitFormatter.format(frequency40m)}
        Required Capacitance         : ${UnitFormatter.format(capacitanceFor40m)}
        Target Frequency (20m)       : ${UnitFormatter.format(frequency20m)}
        Required Capacitance         : ${UnitFormatter.format(capacitanceFor20m)}
        
        Required Inductance (fixed C = ${UnitFormatter.format(capacitance)})
        --------------------------------------------
        Target Frequency (40m)       : ${UnitFormatter.format(frequency40m)}
        Required Inductance          : ${UnitFormatter.format(inductanceFor40m)}
        Target Frequency (20m)       : ${UnitFormatter.format(frequency20m)}
        Required Inductance          : ${UnitFormatter.format(inductanceFor20m)}
        """.trimIndent()

    println(result)
}