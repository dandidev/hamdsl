package io.github.dandidev.hamdsl.units.si

import io.github.dandidev.hamdsl.constants.SI

@JvmInline
value class Hertz(val value: Double)

fun Hertz.asTeraHertz(): Double = value / SI.TERA
fun Hertz.asGigaHertz(): Double = value / SI.GIGA
fun Hertz.asMegaHertz(): Double = value / SI.MEGA
fun Hertz.asKiloHertz(): Double = value / SI.KILO
fun Hertz.asHertz(): Double = value
fun Hertz.asMilliHertz(): Double = value / SI.MILLI
fun Hertz.asMicroHertz(): Double = value / SI.MICRO
fun Hertz.asNanoHertz(): Double = value / SI.NANO
fun Hertz.asPicoHertz(): Double = value / SI.PICO
fun Hertz.asFemtoHertz(): Double = value / SI.FEMTO

operator fun Hertz.plus(frequency: Hertz): Hertz =
    Hertz(value + frequency.value)
operator fun Hertz.minus(frequency: Hertz): Hertz =
    Hertz(value - frequency.value)
operator fun Hertz.times(value: Double): Hertz =
    Hertz(this.value * value)
operator fun Hertz.div(value: Double): Hertz =
    Hertz(this.value / value)