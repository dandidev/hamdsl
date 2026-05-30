package io.github.dandidev.hamdsl.units

import java.util.Locale


@JvmInline
value class Ohm(val value: Double) {
    override fun toString() =
        String.format(Locale.US, "%.4f Ω", value)
}

@JvmInline
value class KiloOhm(val value: Double) {
    override fun toString() =
        String.format(Locale.US, "%.4f kΩ", value)
}

@JvmInline
value class MegaOhm(val value: Double) {
    override fun toString() =
        String.format(Locale.US, "%.4f MΩ", value)
}

fun Ohm.toKiloOhm(): KiloOhm =
    KiloOhm(value / 1e3)

fun Ohm.toMegaOhm(): MegaOhm =
    MegaOhm(value / 1e6)

fun KiloOhm.toOhm(): Ohm =
    Ohm(value * 1e3)

fun KiloOhm.toMegaOhm(): MegaOhm =
    MegaOhm(value / 1e3)

fun MegaOhm.toOhm(): Ohm =
    Ohm(value * 1e6)

fun MegaOhm.toKiloOhm(): KiloOhm =
    KiloOhm(value * 1e3)

operator fun Ohm.times(current: Ampere): Volt =
    Volt(value * current.value)