package io.github.dandidev.hamdsl.units

import java.util.Locale

@JvmInline
value class Volt(val value: Double) {
    override fun toString() =
        String.format(Locale.US, "%.4f V", value)
}

@JvmInline
value class MilliVolt(val value: Double) {
    override fun toString() =
        String.format(Locale.US, "%.4f mV", value)
}

@JvmInline
value class MicroVolt(val value: Double) {
    override fun toString() =
        String.format(Locale.US, "%.4f µV", value)
}

@JvmInline
value class NanoVolt(val value: Double) {
    override fun toString() =
        String.format(Locale.US, "%.4f nV", value)
}

fun Volt.toMilliVolt(): MilliVolt =
    MilliVolt(value * 1e3)

fun Volt.toMicroVolt(): MicroVolt =
    MicroVolt(value * 1e6)

fun Volt.toNanoVolt(): NanoVolt =
    NanoVolt(value * 1e9)

fun MilliVolt.toVolt(): Volt =
    Volt(value / 1e3)

fun MilliVolt.toMicroVolt(): MicroVolt =
    MicroVolt(value * 1e3)

fun MilliVolt.toNanoVolt(): NanoVolt =
    NanoVolt(value * 1e6)

fun MicroVolt.toVolt(): Volt =
    Volt(value / 1e6)

fun MicroVolt.toMilliVolt(): MilliVolt =
    MilliVolt(value / 1e3)

fun MicroVolt.toNanoVolt(): NanoVolt =
    NanoVolt(value * 1e3)

fun NanoVolt.toVolt(): Volt =
    Volt(value / 1e9)

fun NanoVolt.toMilliVolt(): MilliVolt =
    MilliVolt(value / 1e6)

fun NanoVolt.toMicroVolt(): MicroVolt =
    MicroVolt(value / 1e3)

operator fun Volt.div(resistance: Ohm): Ampere =
    Ampere(value / resistance.value)