package io.github.dandidev.hamdsl.units.si

import io.github.dandidev.hamdsl.constants.SI

@JvmInline
value class Volt(val value: Double)

fun Volt.asTeraVolt(): Double = value / SI.TERA
fun Volt.asGigaVolt(): Double = value / SI.GIGA
fun Volt.asMegaVolt(): Double = value / SI.MEGA
fun Volt.asKiloVolt(): Double = value / SI.KILO
fun Volt.asVolt(): Double = value
fun Volt.asMilliVolt(): Double = value / SI.MILLI
fun Volt.asMicroVolt(): Double = value / SI.MICRO
fun Volt.asNanoVolt(): Double = value / SI.NANO
fun Volt.asPicoVolt(): Double = value / SI.PICO
fun Volt.asFemtoVolt(): Double = value / SI.FEMTO

operator fun Volt.plus(voltage: Volt): Volt =
    Volt(value + voltage.value)
operator fun Volt.minus(voltage: Volt): Volt =
    Volt(value - voltage.value)
operator fun Volt.times(value: Double): Volt =
    Volt(this.value * value)
operator fun Volt.div(value: Double): Volt =
    Volt(this.value / value)
operator fun Volt.div(resistance: Ohm): Ampere =
    Ampere(value / resistance.value)
operator fun Volt.div(current: Ampere): Ohm =
    Ohm(value / current.value)