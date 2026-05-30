package io.github.dandidev.hamdsl.units

import io.github.dandidev.hamdsl.dsl.ScaledUnit

@JvmInline
value class Watt(val value: Double) {
    override fun toString() =
        ScaledUnit(value, "W").toString()
}