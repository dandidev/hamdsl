package io.github.dandidev.hamdsl.units.si

import io.github.dandidev.hamdsl.constants.SI

@JvmInline
value class Hertz(val value: Double)

fun Hertz.asGigaHertz(): Double = value / SI.GIGA
fun Hertz.asMegaHertz(): Double = value / SI.MEGA
fun Hertz.asKiloHertz(): Double = value / SI.KILO
fun Hertz.asHertz(): Double = value
fun Hertz.asMilliHertz(): Double = value * SI.MILLI
fun Hertz.asMicroHertz(): Double = value * SI.MICRO
fun Hertz.asNanoHertz(): Double = value * SI.NANO