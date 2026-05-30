package io.github.dandidev.hamdsl.units.si

@JvmInline
value class Ampere(val value: Double)

operator fun Ampere.times(resistance: Ohm): Volt =
    Volt(value * resistance.value)