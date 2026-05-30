package io.github.dandidev.hamdsl.units.si

import io.github.dandidev.hamdsl.SI

@JvmInline
value class Ampere(val value: Double)

fun Ampere.asGigaAmpere(): Double = value / SI.GIGA
fun Ampere.asMegaAmpere(): Double = value / SI.MEGA
fun Ampere.asKiloAmpere(): Double = value / SI.KILO
fun Ampere.asAmpere(): Double = value
fun Ampere.asMilliAmpere(): Double = value * SI.MILLI
fun Ampere.asMicroAmpere(): Double = value * SI.MICRO
fun Ampere.asNanoAmpere(): Double = value * SI.NANO

operator fun Ampere.times(resistance: Ohm): Volt =
    Volt(value * resistance.value)