package io.github.dandidev.hamdsl.units.si

import io.github.dandidev.hamdsl.SI

@JvmInline
value class Meter(val value: Double)

fun Meter.asGigaMeter(): Double = value / SI.GIGA
fun Meter.asMegaMeter(): Double = value / SI.MEGA
fun Meter.asKiloMeter(): Double = value / SI.KILO
fun Meter.asMeter(): Double = value
fun Meter.asMilliMeter(): Double = value * SI.MILLI
fun Meter.asMicroMeter(): Double = value * SI.MICRO
fun Meter.asNanoMeter(): Double = value * SI.NANO