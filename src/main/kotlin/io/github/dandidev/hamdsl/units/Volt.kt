package io.github.dandidev.hamdsl.units

import io.github.dandidev.hamdsl.SI
import io.github.dandidev.hamdsl.dsl.ScaledUnit
import kotlin.math.abs

@JvmInline
value class Volt(val value: Double) {
    override fun toString() =
        when {
            abs(value) >= SI.GIGA -> asGigaVolt().toString()
            abs(value) >= SI.MEGA -> asMegaVolt().toString()
            abs(value) >= SI.KILO -> asKiloVolt().toString()
            abs(value) >= 1.0 -> asVolt().toString()
            abs(value) >= SI.MILLI -> asMilliVolt().toString()
            abs(value) >= SI.MICRO -> asMicroVolt().toString()
            else -> asNanoVolt().toString()
        }
}

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