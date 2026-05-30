package io.github.dandidev.hamdsl.units

import io.github.dandidev.hamdsl.dsl.ScaledUnit

@JvmInline
value class Ohm(val value: Double) {
    override fun toString() =
        ScaledUnit(value, "Ω").toString()
}

operator fun Ohm.times(current: Ampere): Volt =
    Volt(value * current.value)