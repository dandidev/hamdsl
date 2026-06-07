package io.github.dandidev.hamdsl.examples

import io.github.dandidev.hamdsl.dsl.log.dB
import io.github.dandidev.hamdsl.dsl.si.W
import io.github.dandidev.hamdsl.dsl.si.ohm
import io.github.dandidev.hamdsl.dsl.si.uV
import io.github.dandidev.hamdsl.format.UnitFormatter
import io.github.dandidev.hamdsl.math.toDbm
import io.github.dandidev.hamdsl.math.toWatt
import io.github.dandidev.hamdsl.units.log.minus
import io.github.dandidev.hamdsl.units.log.plus

fun main() {
    // Transmitter output power
    val txPower =
        5.W.toDbm()

    // Fixed attenuator chain
    val attenuatorChain =
        20.dB + 20.dB + 20.dB + 20.dB + 20.dB

    // Power arriving at receiver input
    val rxPower = txPower - attenuatorChain

    // Receiver minimum sensitivity
    val rxMinSensitivity =
        0.2.uV
            .toWatt(50.ohm)
            .toDbm()

    // Total attenuation required to reach sensitivity limit
    val requiredTotalAttenuation =
        txPower - rxMinSensitivity

    // Remaining attenuation margin
    val attenuationMargin =
        requiredTotalAttenuation - attenuatorChain

    val result =
        """
            TX Power                     : ${UnitFormatter.format(txPower)}
            --------------------------------------------
            Attenuator Chain             : ${UnitFormatter.format(attenuatorChain)}
            RX Power                     : ${UnitFormatter.format(rxPower)}
            --------------------------------------------
            RX Min Sensitivity           : ${UnitFormatter.format(rxMinSensitivity)}
            Required Total Attenuation   : ${UnitFormatter.format(requiredTotalAttenuation)}
            Attenuation Margin           : ${UnitFormatter.format(attenuationMargin)}
            """.trimIndent()

    println(result)
}