package io.github.dandidev.hamdsl.examples

import io.github.dandidev.hamdsl.dsl.log.dB
import io.github.dandidev.hamdsl.dsl.si.MHz
import io.github.dandidev.hamdsl.dsl.si.W
import io.github.dandidev.hamdsl.dsl.si.m
import io.github.dandidev.hamdsl.dsl.si.ohm
import io.github.dandidev.hamdsl.dsl.si.uV
import io.github.dandidev.hamdsl.format.UnitFormatter
import io.github.dandidev.hamdsl.math.fspl
import io.github.dandidev.hamdsl.math.toDbm
import io.github.dandidev.hamdsl.math.toWatt
import io.github.dandidev.hamdsl.units.log.minus
import io.github.dandidev.hamdsl.units.log.plus

fun main() {
    // Transmitter output power
    val txPower =
        1.W.toDbm()

    // Fixed attenuator chain
    val attenuatorChain =
        30.dB + 30.dB + 30.dB + 20.dB

    // RF path parameters
    val distance = 2.m
    val frequency = 443.MHz

    // Free-space path loss
    val pathLoss =
        fspl(distance, frequency)

    // Total attenuation between transmitter and receiver
    val totalAttenuation =
        attenuatorChain + pathLoss

    // Power arriving at receiver input
    val rxPower =
        txPower - totalAttenuation

    // Receiver minimum sensitivity
    val rxMinSensitivity =
        0.2.uV
            .toWatt(50.ohm)
            .toDbm()

    // Remaining margin above sensitivity threshold
    val linkMargin =
        rxPower - rxMinSensitivity

    val result = """
        TX Power                     : ${UnitFormatter.format(txPower)}
        --------------------------------------------
        Attenuator Chain             : ${UnitFormatter.format(attenuatorChain)}
        FSPL                         : ${UnitFormatter.format(pathLoss)}
        Total Attenuation            : ${UnitFormatter.format(totalAttenuation)}
        RX Power                     : ${UnitFormatter.format(rxPower)}
        --------------------------------------------
        RX Min Sensitivity           : ${UnitFormatter.format(rxMinSensitivity)}
        Link Margin                  : ${UnitFormatter.format(linkMargin)}
        """.trimIndent()

    println(result)
}