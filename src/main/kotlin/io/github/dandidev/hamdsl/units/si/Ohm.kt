package io.github.dandidev.hamdsl.units.si

import io.github.dandidev.hamdsl.constants.SI

@JvmInline
value class Ohm(val value: Double)

fun Ohm.asGigaOhm(): Double = value / SI.GIGA
fun Ohm.asMegaOhm(): Double = value / SI.MEGA
fun Ohm.asKiloOhm(): Double = value / SI.KILO
fun Ohm.asOhm(): Double = value
fun Ohm.asMillisOhm(): Double = value / SI.MILLI
fun Ohm.asMicroMicroOhm(): Double = value / SI.MICRO
fun Ohm.asNanoMicroOhm(): Double = value / SI.NANO

operator fun Ohm.times(current: Ampere): Volt =
    Volt(value * current.value)