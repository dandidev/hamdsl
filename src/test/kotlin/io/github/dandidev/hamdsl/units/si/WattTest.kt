package io.github.dandidev.hamdsl.units.si

import io.github.dandidev.hamdsl.dsl.si.*
import io.github.dandidev.hamdsl.units.TestConstants.FEMTO_CONVERSION
import io.github.dandidev.hamdsl.units.TestConstants.MICRO_CONVERSION
import io.github.dandidev.hamdsl.units.TestConstants.MILLI_CONVERSION
import io.github.dandidev.hamdsl.units.TestConstants.NANO_CONVERSION
import io.github.dandidev.hamdsl.units.TestConstants.PRECISION
import io.github.dandidev.hamdsl.units.TestConstants.relDelta
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class WattTest {

    // DSL constructors

    @Test
    fun `1 tera watt equals 1e12 watt`() {
        assertEquals(1e12, 1.TW.value, PRECISION)
    }

    @Test
    fun `1 giga watt equals 1e9 watt`() {
        assertEquals(1e9, 1.GW.value, PRECISION)
    }

    @Test
    fun `1 mega watt equals 1e6 watt`() {
        assertEquals(1e6, 1.MW.value, PRECISION)
    }

    @Test
    fun `1 kilo watt equals 1e3 watt`() {
        assertEquals(1e3, 1.kW.value, PRECISION)
    }

    @Test
    fun `1 watt equals 1 watt`() {
        assertEquals(1.0, 1.W.value, PRECISION)
    }

    @Test
    fun `1 milli watt equals 1e-3 watt`() {
        assertEquals(1e-3, 1.mW.value, PRECISION)
    }

    @Test
    fun `1 micro watt equals 1e-6 watt`() {
        assertEquals(1e-6, 1.uW.value, PRECISION)
    }

    @Test
    fun `1 nano watt equals 1e-9 watt`() {
        assertEquals(1e-9, 1.nW.value, PRECISION)
    }

    @Test
    fun `1 pico watt equals 1e-12 watt`() {
        assertEquals(1e-12, 1.pW.value, PRECISION)
    }

    @Test
    fun `1 femto watt equals 1e-15 watt`() {
        assertEquals(1e-15, 1.fW.value, PRECISION)
    }

    // Conversion

    @Test
    fun `watt as tera watt`() {
        assertEquals(1e-12, 1.W.asTeraWatt(), PRECISION)
    }

    @Test
    fun `watt as giga watt`() {
        assertEquals(1e-9, 1.W.asGigaWatt(), PRECISION)
    }

    @Test
    fun `watt as mega watt`() {
        assertEquals(1e-6, 1.W.asMegaWatt(), PRECISION)
    }

    @Test
    fun `watt as kilo watt`() {
        assertEquals(1e-3, 1.W.asKiloWatt(), PRECISION)
    }

    @Test
    fun `watt as watt`() {
        assertEquals(1.0, 1.W.asWatt(), PRECISION)
    }

    @Test
    fun `watt as milli watt`() {
        assertEquals(1e3, 1.W.asMilliWatt(), relDelta(MILLI_CONVERSION))
    }

    @Test
    fun `watt as micro watt`() {
        assertEquals(1e6, 1.W.asMicroWatt(), relDelta(MICRO_CONVERSION))
    }

    @Test
    fun `watt as nano watt`() {
        assertEquals(1e9, 1.W.asNanoWatt(), relDelta(NANO_CONVERSION))
    }

    @Test
    fun `watt as pico watt`() {
        assertEquals(1e12, 1.W.asPicoWatt(), relDelta(FEMTO_CONVERSION))
    }

    @Test
    fun `watt as femto watt`() {
        assertEquals(1e15, 1.W.asFemtoWatt(), relDelta(FEMTO_CONVERSION))
    }

    // Operators

    @Test
    fun `watt plus watt returns watt`() {
        val power: Watt = 1.W + 3.5.W

        assertEquals(4.5, power.value, PRECISION)
    }

    @Test
    fun `watt minus watt returns watt`() {
        val power: Watt = 1.8.W - 0.9.W

        assertEquals(0.9, power.value, PRECISION)
    }

    @Test
    fun `watt times scalar returns watt`() {
        val power: Watt = 1.5.W * 3.0

        assertEquals(4.5, power.value, PRECISION)
    }

    @Test
    fun `watt divided by scalar returns watt`() {
        val power: Watt = 3.5.W / 2.0

        assertEquals(1.75, power.value, PRECISION)
    }
}