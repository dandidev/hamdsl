package io.github.dandidev.hamdsl.units.si

@JvmInline
value class Ohm(val value: Double)

operator fun Ohm.times(current: Ampere): Volt =
    Volt(value * current.value)