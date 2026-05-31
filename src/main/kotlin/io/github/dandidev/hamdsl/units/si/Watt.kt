package io.github.dandidev.hamdsl.units.si

import io.github.dandidev.hamdsl.constants.SI

@JvmInline
value class Watt(val value: Double)

fun Watt.asGigaWatt(): Double = value / SI.GIGA
fun Watt.asMegaWatt(): Double = value / SI.MEGA
fun Watt.asKiloWatt(): Double = value / SI.KILO
fun Watt.asWatt(): Double = value
fun Watt.asMilliWatt(): Double = value / SI.MILLI
fun Watt.asMicroWatt(): Double = value / SI.MICRO
fun Watt.asNanoWatt(): Double = value / SI.NANO

operator fun Watt.plus(power: Watt): Watt =
    Watt(value + power.value)

operator fun Watt.minus(power: Watt): Watt =
    Watt(value - power.value)

operator fun Watt.times(value: Double): Watt =
    Watt(this.value * value)

operator fun Watt.div(value: Double): Watt =
    Watt(this.value / value)