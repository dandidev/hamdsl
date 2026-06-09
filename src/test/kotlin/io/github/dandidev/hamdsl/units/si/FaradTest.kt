package io.github.dandidev.hamdsl.units.si

import io.github.dandidev.hamdsl.dsl.si.*
import io.github.dandidev.hamdsl.units.TestConstants.FEMTO_CONVERSION
import io.github.dandidev.hamdsl.units.TestConstants.MICRO_CONVERSION
import io.github.dandidev.hamdsl.units.TestConstants.MILLI_CONVERSION
import io.github.dandidev.hamdsl.units.TestConstants.NANO_CONVERSION
import io.github.dandidev.hamdsl.units.TestConstants.PICO_CONVERSION
import io.github.dandidev.hamdsl.units.TestConstants.PRECISION
import io.github.dandidev.hamdsl.units.TestConstants.relDelta
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class FaradTest {

    // DSL constructors

    @Test
    fun `1 tera farad equals 1e12 farad`() {
        assertEquals(1e12, 1.TF.value, PRECISION)
    }

    @Test
    fun `1 giga farad equals 1e9 farad`() {
        assertEquals(1e9, 1.GF.value, PRECISION)
    }

    @Test
    fun `1 mega farad equals 1e6 farad`() {
        assertEquals(1e6, 1.MF.value, PRECISION)
    }

    @Test
    fun `1 kilo farad equals 1e3 farad`() {
        assertEquals(1e3, 1.kF.value, PRECISION)
    }

    @Test
    fun `1 farad equals 1 farad`() {
        assertEquals(1.0, 1.F.value, PRECISION)
    }

    @Test
    fun `1 milli farad equals 1e-3 farad`() {
        assertEquals(1e-3, 1.mF.value, PRECISION)
    }

    @Test
    fun `1 micro farad equals 1e-6 farad`() {
        assertEquals(1e-6, 1.uF.value, PRECISION)
    }

    @Test
    fun `1 nano farad equals 1e-9 farad`() {
        assertEquals(1e-9, 1.nF.value, PRECISION)
    }

    @Test
    fun `1 pico farad equals 1e-12 farad`() {
        assertEquals(1e-12, 1.pF.value, PRECISION)
    }

    @Test
    fun `1 femto farad equals 1e-15 farad`() {
        assertEquals(1e-15, 1.fF.value, PRECISION)
    }

    // Conversion

    @Test
    fun `farad as tera farad`() {
        assertEquals(1e-12, 1.F.asTeraFarad(), PRECISION)
    }

    @Test
    fun `farad as giga farad`() {
        assertEquals(1e-9, 1.F.asGigaFarad(), PRECISION)
    }

    @Test
    fun `farad as mega farad`() {
        assertEquals(1e-6, 1.F.asMegaFarad(), PRECISION)
    }

    @Test
    fun `farad as kilo farad`() {
        assertEquals(1e-3, 1.F.asKiloFarad(), PRECISION)
    }

    @Test
    fun `farad as farad`() {
        assertEquals(1.0, 1.F.asFarad(), PRECISION)
    }

    @Test
    fun `farad as milli farad`() {
        assertEquals(1e3, 1.F.asMilliFarad(), relDelta(MILLI_CONVERSION))
    }

    @Test
    fun `farad as micro farad`() {
        assertEquals(1e6, 1.F.asMicroFarad(), relDelta(MICRO_CONVERSION))
    }

    @Test
    fun `farad as nano farad`() {
        assertEquals(1e9, 1.F.asNanoFarad(), relDelta(NANO_CONVERSION))
    }

    @Test
    fun `farad as pico farad`() {
        assertEquals(1e12, 1.F.asPicoFarad(), relDelta(PICO_CONVERSION))
    }

    @Test
    fun `farad as femto farad`() {
        assertEquals(1e15, 1.F.asFemtoFarad(), relDelta(FEMTO_CONVERSION))
    }

    // Operators

    @Test
    fun `farad plus farad returns farad`() {
        val capacitance: Farad = 1.F + 3.5.F

        assertEquals(4.5, capacitance.value, PRECISION)
    }

    @Test
    fun `farad minus farad returns farad`() {
        val capacitance: Farad = 1.8.F - 0.9.F

        assertEquals(0.9, capacitance.value, PRECISION)
    }

    @Test
    fun `farad times scalar returns farad`() {
        val capacitance: Farad = 1.5.F * 3.0

        assertEquals(4.5, capacitance.value, PRECISION)
    }

    @Test
    fun `farad divided by scalar returns farad`() {
        val capacitance: Farad = 3.5.F / 2.0

        assertEquals(1.75, capacitance.value, PRECISION)
    }
}