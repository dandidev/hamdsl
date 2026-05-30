package io.github.dandidev.hamdsl.units

import java.util.Locale

@JvmInline
value class Ampere(val value: Double) {
    override fun toString() =
        String.format(Locale.US, "%.4f A", value)
}

@JvmInline
value class MilliAmpere(val value: Double) {
    override fun toString() =
        String.format(Locale.US, "%.4f mA", value)
}

@JvmInline
value class MicroAmpere(val value: Double) {
    override fun toString() =
        String.format(Locale.US, "%.4f µA", value)
}

@JvmInline
value class KiloAmpere(val value: Double) {
    override fun toString() =
        String.format(Locale.US, "%.4f kA", value)
}

fun Ampere.toMilliAmpere(): MilliAmpere =
    MilliAmpere(value * 1e3)

fun Ampere.toMicroAmpere(): MicroAmpere =
    MicroAmpere(value * 1e6)

fun Ampere.toKiloAmpere(): KiloAmpere =
    KiloAmpere(value / 1e3)

fun MilliAmpere.toAmpere(): Ampere =
    Ampere(value / 1e3)

fun MilliAmpere.toMicroAmpere(): MicroAmpere =
    MicroAmpere(value * 1e3)

fun MilliAmpere.toKiloAmpere(): KiloAmpere =
    KiloAmpere(value / 1e6)

fun MicroAmpere.toAmpere(): Ampere =
    Ampere(value / 1e6)

fun MicroAmpere.toMilliAmpere(): MilliAmpere =
    MilliAmpere(value / 1e3)

fun MicroAmpere.toKiloAmpere(): KiloAmpere =
    KiloAmpere(value / 1e9)

fun KiloAmpere.toAmpere(): Ampere =
    Ampere(value * 1e3)

fun KiloAmpere.toMilliAmpere(): MilliAmpere =
    MilliAmpere(value * 1e6)

fun KiloAmpere.toMicroAmpere(): MicroAmpere =
    MicroAmpere(value * 1e9)

operator fun Ampere.times(resistance: Ohm): Volt =
    Volt(value * resistance.value)