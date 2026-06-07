package io.github.dandidev.hamdsl.units.si

import io.github.dandidev.hamdsl.constants.SI

@JvmInline
value class Meter(val value: Double)

fun Meter.asTeraMeter(): Double = value / SI.TERA
fun Meter.asGigaMeter(): Double = value / SI.GIGA
fun Meter.asMegaMeter(): Double = value / SI.MEGA
fun Meter.asKiloMeter(): Double = value / SI.KILO
fun Meter.asMeter(): Double = value
fun Meter.asDeciMeter(): Double = value / SI.DECI
fun Meter.asCentiMeter(): Double = value / SI.CENTI
fun Meter.asMilliMeter(): Double = value / SI.MILLI
fun Meter.asMicroMeter(): Double = value / SI.MICRO
fun Meter.asNanoMeter(): Double = value / SI.NANO
fun Meter.asPicoMeter(): Double = value / SI.PICO
fun Meter.asFemtoMeter(): Double = value / SI.FEMTO

operator fun Meter.plus(distance: Meter): Meter =
    Meter(value + distance.value)
operator fun Meter.minus(distance: Meter): Meter =
    Meter(value - distance.value)
operator fun Meter.times(value: Double): Meter =
    Meter(this.value * value)
operator fun Meter.div(value: Double): Meter =
    Meter(this.value / value)