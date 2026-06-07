package io.github.dandidev.hamdsl.units.si

import io.github.dandidev.hamdsl.constants.SI

@JvmInline
value class Farad(val value: Double)

fun Farad.asFarad(): Double = value
fun Farad.asMilliFarad(): Double = value / SI.MILLI
fun Farad.asMicroFarad(): Double = value / SI.MICRO
fun Farad.asNanoFarad(): Double = value / SI.NANO
fun Farad.asPicoFarad(): Double = value / SI.PICO

operator fun Farad.plus(capacitance: Farad): Farad =
    Farad(value + capacitance.value)
operator fun Farad.minus(capacitance: Farad): Farad =
    Farad(value - capacitance.value)
operator fun Farad.times(value: Double): Farad =
    Farad(this.value * value)
operator fun Farad.div(value: Double): Farad =
    Farad(this.value / value)