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

class OhmTest {

    // DSL constructors

    @Test
    fun `1 tera ohm equals 1e12 ohm`() {
        assertEquals(1e12, 1.TOhm.value, PRECISION)
    }

    @Test
    fun `1 giga ohm equals 1e9 ohm`() {
        assertEquals(1e9, 1.GOhm.value, PRECISION)
    }

    @Test
    fun `1 mega ohm equals 1e6 ohm`() {
        assertEquals(1e6, 1.MOhm.value, PRECISION)
    }

    @Test
    fun `1 kilo ohm equals 1e3 ohm`() {
        assertEquals(1e3, 1.kOhm.value, PRECISION)
    }

    @Test
    fun `1 ohm equals 1 ohm`() {
        assertEquals(1.0, 1.ohm.value, PRECISION)
    }

    @Test
    fun `1 milli ohm equals 1e-3 ohm`() {
        assertEquals(1e-3, 1.mOhm.value, PRECISION)
    }

    @Test
    fun `1 micro ohm equals 1e-6 ohm`() {
        assertEquals(1e-6, 1.uOhm.value, PRECISION)
    }

    @Test
    fun `1 nano ohm equals 1e-9 ohm`() {
        assertEquals(1e-9, 1.nOhm.value, PRECISION)
    }

    @Test
    fun `1 pico ohm equals 1e-12 ohm`() {
        assertEquals(1e-12, 1.pOhm.value, PRECISION)
    }

    @Test
    fun `1 femto ohm equals 1e-15 ohm`() {
        assertEquals(1e-15, 1.fOhm.value, PRECISION)
    }

    // Conversion

    @Test
    fun `ohm as tera ohm`() {
        assertEquals(1e-12, 1.ohm.asTeraOhm(), PRECISION)
    }

    @Test
    fun `ohm as giga ohm`() {
        assertEquals(1e-9, 1.ohm.asGigaOhm(), PRECISION)
    }

    @Test
    fun `ohm as mega ohm`() {
        assertEquals(1e-6, 1.ohm.asMegaOhm(), PRECISION)
    }

    @Test
    fun `ohm as kilo ohm`() {
        assertEquals(1e-3, 1.ohm.asKiloOhm(), PRECISION)
    }

    @Test
    fun `ohm as ohm`() {
        assertEquals(1.0, 1.ohm.asOhm(), PRECISION)
    }

    @Test
    fun `ohm as milli ohm`() {
        assertEquals(1e3, 1.ohm.asMilliOhm(), relDelta(MILLI_CONVERSION))
    }

    @Test
    fun `ohm as micro ohm`() {
        assertEquals(1e6, 1.ohm.asMicroOhm(), relDelta(MICRO_CONVERSION))
    }

    @Test
    fun `ohm as nano ohm`() {
        assertEquals(1e9, 1.ohm.asNanoOhm(), relDelta(NANO_CONVERSION))
    }

    @Test
    fun `ohm as pico ohm`() {
        assertEquals(1e12, 1.ohm.asPicoOhm(), relDelta(PICO_CONVERSION))
    }

    @Test
    fun `ohm as femto ohm`() {
        assertEquals(1e15, 1.ohm.asFemtoOhm(), relDelta(FEMTO_CONVERSION))
    }

    // Operators

    @Test
    fun `ohm plus ohm returns ohm`() {
        val resistance: Ohm = 1.ohm + 3.5.ohm

        assertEquals(4.5, resistance.value, PRECISION)
    }

    @Test
    fun `ohm minus ohm returns ohm`() {
        val resistance: Ohm = 1.8.ohm - 0.9.ohm

        assertEquals(0.9, resistance.value, PRECISION)
    }

    @Test
    fun `ohm times scalar returns ohm`() {
        val resistance: Ohm = 1.5.ohm * 3.0

        assertEquals(4.5, resistance.value, PRECISION)
    }

    @Test
    fun `ohm divided by scalar returns ohm`() {
        val resistance: Ohm = 3.5.ohm / 2.0

        assertEquals(1.75, resistance.value, PRECISION)
    }

    @Test
    fun `ohm times ampere returns volt`() {
        val result: Volt = 3.ohm * 2.A

        assertEquals(6.0, result.value, PRECISION)
    }
}