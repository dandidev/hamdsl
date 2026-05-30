package io.github.dandidev.hamdsl.units.si

import io.github.dandidev.hamdsl.SI
import io.github.dandidev.hamdsl.dsl.ScaledUnit

@JvmInline
value class Volt(val value: Double)

fun Volt.asGigaVolt(): ScaledUnit =
    ScaledUnit(value / SI.GIGA, "GV")

fun Volt.asMegaVolt(): ScaledUnit =
    ScaledUnit(value / SI.MEGA, "MV")

fun Volt.asKiloVolt(): ScaledUnit =
    ScaledUnit(value / SI.KILO, "kV")

fun Volt.asVolt(): ScaledUnit =
    ScaledUnit(value, "V")

fun Volt.asMilliVolt(): ScaledUnit =
    ScaledUnit(value / SI.MILLI, "mV")

fun Volt.asMicroVolt(): ScaledUnit =
    ScaledUnit(value / SI.MICRO, "µV")

fun Volt.asNanoVolt(): ScaledUnit =
    ScaledUnit(value / SI.NANO, "nV")

operator fun Volt.div(resistance: Ohm): Ampere =
    Ampere(value / resistance.value)

operator fun Volt.div(current: Ampere): Ohm =
    Ohm(value / current.value)