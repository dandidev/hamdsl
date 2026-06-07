package io.github.dandidev.hamdsl.units.si

import io.github.dandidev.hamdsl.constants.SI

@JvmInline
value class Henry(val value: Double)

fun Henry.asHenry(): Double = value
fun Henry.asMilliHenry(): Double = value / SI.MILLI
fun Henry.asMicroHenry(): Double = value / SI.MICRO
fun Henry.asNanoHenry(): Double = value / SI.NANO

operator fun Henry.plus(inductance: Henry): Henry =
    Henry(value + inductance.value)
operator fun Henry.minus(inductance: Henry): Henry =
    Henry(value - inductance.value)
operator fun Henry.times(value: Double): Henry =
    Henry(this.value * value)
operator fun Henry.div(value: Double): Henry =
    Henry(this.value / value)