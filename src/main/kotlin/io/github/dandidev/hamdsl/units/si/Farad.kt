package io.github.dandidev.hamdsl.units.si

import io.github.dandidev.hamdsl.constants.SI

@JvmInline
value class Farad(val value: Double)

fun Farad.asTeraFarad(): Double = value / SI.TERA
fun Farad.asGigaFarad(): Double = value / SI.GIGA
fun Farad.asMegaFarad(): Double = value / SI.MEGA
fun Farad.asKiloFarad(): Double = value / SI.KILO
fun Farad.asFarad(): Double = value
fun Farad.asMilliFarad(): Double = value / SI.MILLI
fun Farad.asMicroFarad(): Double = value / SI.MICRO
fun Farad.asNanoFarad(): Double = value / SI.NANO
fun Farad.asPicoFarad(): Double = value / SI.PICO
fun Farad.asFemtoFarad(): Double = value / SI.FEMTO

operator fun Farad.plus(capacitance: Farad): Farad =
    Farad(value + capacitance.value)
operator fun Farad.minus(capacitance: Farad): Farad =
    Farad(value - capacitance.value)
operator fun Farad.times(value: Double): Farad =
    Farad(this.value * value)
operator fun Farad.div(value: Double): Farad =
    Farad(this.value / value)