package io.github.dandidev.hamdsl.units

object TestConstants {
    const val PRECISION = 1e-6

    const val MILLI_CONVERSION = 1e3
    const val MICRO_CONVERSION = 1e6
    const val NANO_CONVERSION = 1e9
    const val PICO_CONVERSION = 1e12
    const val FEMTO_CONVERSION = 1e15

    fun relDelta(expected: Double, factor: Double = 1e-9): Double = expected * factor
}