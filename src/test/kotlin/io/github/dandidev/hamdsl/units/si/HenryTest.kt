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

class HenryTest {

    // DSL constructors

    @Test
    fun `1 tera henry equals 1e12 henry`() {
        assertEquals(1e12, 1.TH.value, PRECISION)
    }

    @Test
    fun `1 giga henry equals 1e9 henry`() {
        assertEquals(1e9, 1.GH.value, PRECISION)
    }

    @Test
    fun `1 mega henry equals 1e6 henry`() {
        assertEquals(1e6, 1.MH.value, PRECISION)
    }

    @Test
    fun `1 kilo henry equals 1e3 henry`() {
        assertEquals(1e3, 1.kH.value, PRECISION)
    }

    @Test
    fun `1 henry equals 1 henry`() {
        assertEquals(1.0, 1.H.value, PRECISION)
    }

    @Test
    fun `1 milli henry equals 1e-3 henry`() {
        assertEquals(1e-3, 1.mH.value, PRECISION)
    }

    @Test
    fun `1 micro henry equals 1e-6 henry`() {
        assertEquals(1e-6, 1.uH.value, PRECISION)
    }

    @Test
    fun `1 nano henry equals 1e-9 henry`() {
        assertEquals(1e-9, 1.nH.value, PRECISION)
    }

    @Test
    fun `1 pico henry equals 1e-12 henry`() {
        assertEquals(1e-12, 1.pH.value, PRECISION)
    }

    @Test
    fun `1 femto henry equals 1e-15 henry`() {
        assertEquals(1e-15, 1.fH.value, PRECISION)
    }

    // Conversion

    @Test
    fun `henry as tera henry`() {
        assertEquals(1e-12, 1.H.asTeraHenry(), PRECISION)
    }

    @Test
    fun `henry as giga henry`() {
        assertEquals(1e-9, 1.H.asGigaHenry(), PRECISION)
    }

    @Test
    fun `henry as mega henry`() {
        assertEquals(1e-6, 1.H.asMegaHenry(), PRECISION)
    }

    @Test
    fun `henry as kilo henry`() {
        assertEquals(1e-3, 1.H.asKiloHenry(), PRECISION)
    }

    @Test
    fun `henry as henry`() {
        assertEquals(1.0, 1.H.asHenry(), PRECISION)
    }

    @Test
    fun `henry as milli henry`() {
        assertEquals(1e3, 1.H.asMilliHenry(), relDelta(MILLI_CONVERSION))
    }

    @Test
    fun `henry as micro henry`() {
        assertEquals(1e6, 1.H.asMicroHenry(), relDelta(MICRO_CONVERSION))
    }

    @Test
    fun `henry as nano henry`() {
        assertEquals(1e9, 1.H.asNanoHenry(), relDelta(NANO_CONVERSION))
    }

    @Test
    fun `henry as pico henry`() {
        assertEquals(1e12, 1.H.asPicoHenry(), relDelta(PICO_CONVERSION))
    }

    @Test
    fun `henry as femto henry`() {
        assertEquals(1e15, 1.H.asFemtoHenry(), relDelta(FEMTO_CONVERSION))
    }

    // Operators

    @Test
    fun `henry plus henry returns henry`() {
        val inductance: Henry = 1.H + 3.5.H

        assertEquals(4.5, inductance.value, PRECISION)
    }

    @Test
    fun `henry minus henry returns henry`() {
        val inductance: Henry = 1.8.H - 0.9.H

        assertEquals(0.9, inductance.value, PRECISION)
    }

    @Test
    fun `henry times scalar returns henry`() {
        val inductance: Henry = 1.5.H * 3.0

        assertEquals(4.5, inductance.value, PRECISION)
    }

    @Test
    fun `henry divided by scalar returns henry`() {
        val inductance: Henry = 3.5.H / 2.0

        assertEquals(1.75, inductance.value, PRECISION)
    }
}