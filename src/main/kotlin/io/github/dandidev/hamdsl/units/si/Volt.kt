package io.github.dandidev.hamdsl.units.si

import io.github.dandidev.hamdsl.constants.SI

@JvmInline
value class Volt(val value: Double)

fun Volt.asGigaVolt(): Double = value / SI.GIGA
fun Volt.asMegaVolt(): Double = value / SI.MEGA
fun Volt.asKiloVolt(): Double = value / SI.KILO
fun Volt.asVolt(): Double = value
fun Volt.asMilliVolt(): Double = value / SI.MILLI
fun Volt.asMicroVolt(): Double = value / SI.MICRO
fun Volt.asNanoVolt(): Double = value / SI.NANO

operator fun Volt.div(resistance: Ohm): Ampere =
    Ampere(value / resistance.value)

operator fun Volt.div(current: Ampere): Ohm =
    Ohm(value / current.value)