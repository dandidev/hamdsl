package io.github.dandidev.hamdsl.units.si

import io.github.dandidev.hamdsl.constants.SI

@JvmInline
value class Ohm(val value: Double)

fun Ohm.asGigaOhm(): Double = value / SI.GIGA
fun Ohm.asMegaOhm(): Double = value / SI.MEGA
fun Ohm.asKiloOhm(): Double = value / SI.KILO
fun Ohm.asOhm(): Double = value
fun Ohm.asMilliOhm(): Double = value / SI.MILLI
fun Ohm.asMicroOhm(): Double = value / SI.MICRO
fun Ohm.asNanoOhm(): Double = value / SI.NANO

operator fun Ohm.plus(resistance: Ohm): Ohm =
    Ohm(value + resistance.value)

operator fun Ohm.minus(resistance: Ohm): Ohm =
    Ohm(value - resistance.value)

operator fun Ohm.times(value: Double): Ohm =
    Ohm(this.value * value)

operator fun Ohm.div(value: Double): Ohm =
    Ohm(this.value / value)

operator fun Ohm.times(current: Ampere): Volt =
    Volt(value * current.value)