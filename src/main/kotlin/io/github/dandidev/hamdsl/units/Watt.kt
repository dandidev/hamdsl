package io.github.dandidev.hamdsl.units

import java.util.Locale

@JvmInline
value class Watt(val value: Double) {
    override fun toString() =
        String.format(Locale.US, "%.4f W", value)
}

@JvmInline
value class MilliWatt(val value: Double) {
    override fun toString() =
        String.format(Locale.US, "%.4f mW", value)
}

@JvmInline
value class MicroWatt(val value: Double) {
    override fun toString() =
        String.format(Locale.US, "%.4f µW", value)
}

fun Watt.toMilliWatt(): MilliWatt =
    MilliWatt(value * 1e3)

fun Watt.toMicroWatt(): MicroWatt =
    MicroWatt(value * 1e6)

fun MilliWatt.toWatt(): Watt =
    Watt(value / 1e3)

fun MilliWatt.toMicroWatt(): MicroWatt =
    MicroWatt(value * 1e3)

fun MicroWatt.toWatt(): Watt =
    Watt(value / 1e6)

fun MicroWatt.toMilliWatt(): MilliWatt =
    MilliWatt(value / 1e3)