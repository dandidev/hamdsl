package io.github.dandidev.hamdsl.units.si

import io.github.dandidev.hamdsl.constants.SI

@JvmInline
value class Ampere(val value: Double)

fun Ampere.asTeraAmpere(): Double = value / SI.TERA
fun Ampere.asGigaAmpere(): Double = value / SI.GIGA
fun Ampere.asMegaAmpere(): Double = value / SI.MEGA
fun Ampere.asKiloAmpere(): Double = value / SI.KILO
fun Ampere.asAmpere(): Double = value
fun Ampere.asMilliAmpere(): Double = value / SI.MILLI
fun Ampere.asMicroAmpere(): Double = value / SI.MICRO
fun Ampere.asNanoAmpere(): Double = value / SI.NANO
fun Ampere.asPicoAmpere(): Double = value / SI.PICO
fun Ampere.asFemtoAmpere(): Double = value / SI.FEMTO

operator fun Ampere.plus(current: Ampere): Ampere =
    Ampere(value + current.value)
operator fun Ampere.minus(current: Ampere): Ampere =
    Ampere(value - current.value)
operator fun Ampere.times(value: Double): Ampere =
    Ampere(this.value * value)
operator fun Ampere.div(value: Double): Ampere =
    Ampere(this.value / value)
operator fun Ampere.times(resistance: Ohm): Volt =
    Volt(value * resistance.value)