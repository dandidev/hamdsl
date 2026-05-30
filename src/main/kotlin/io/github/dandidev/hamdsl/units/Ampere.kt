package io.github.dandidev.hamdsl.units

import io.github.dandidev.hamdsl.dsl.ScaledUnit

@JvmInline
value class Ampere(val value: Double) {
    override fun toString() =
        ScaledUnit(value, "A").toString()
}

operator fun Ampere.times(resistance: Ohm): Volt =
    Volt(value * resistance.value)