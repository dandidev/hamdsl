package io.github.dandidev.hamdsl.units.si

import io.github.dandidev.hamdsl.constants.SI

@JvmInline
value class Henry(val value: Double)

fun Henry.asTeraHenry(): Double = value / SI.TERA
fun Henry.asGigaHenry(): Double = value / SI.GIGA
fun Henry.asMegaHenry(): Double = value / SI.MEGA
fun Henry.asKiloHenry(): Double = value / SI.KILO
fun Henry.asHenry(): Double = value
fun Henry.asMilliHenry(): Double = value / SI.MILLI
fun Henry.asMicroHenry(): Double = value / SI.MICRO
fun Henry.asNanoHenry(): Double = value / SI.NANO
fun Henry.asPicoHenry(): Double = value / SI.PICO
fun Henry.asFemtoHenry(): Double = value / SI.FEMTO

operator fun Henry.plus(inductance: Henry): Henry =
    Henry(value + inductance.value)
operator fun Henry.minus(inductance: Henry): Henry =
    Henry(value - inductance.value)
operator fun Henry.times(value: Double): Henry =
    Henry(this.value * value)
operator fun Henry.div(value: Double): Henry =
    Henry(this.value / value)