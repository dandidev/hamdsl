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