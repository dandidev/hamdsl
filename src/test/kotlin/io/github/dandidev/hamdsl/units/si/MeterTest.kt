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

class MeterTest {

    // DSL constructors

    @Test
    fun `1 tera meter equals 1e12 meter`() {
        assertEquals(1e12, 1.Tm.value, PRECISION)
    }

    @Test
    fun `1 giga meter equals 1e9 meter`() {
        assertEquals(1e9, 1.Gm.value, PRECISION)
    }

    @Test
    fun `1 mega meter equals 1e6 meter`() {
        assertEquals(1e6, 1.Mm.value, PRECISION)
    }

    @Test
    fun `1 kilo meter equals 1e3 meter`() {
        assertEquals(1e3, 1.km.value, PRECISION)
    }

    @Test
    fun `1 meter equals 1 meter`() {
        assertEquals(1.0, 1.m.value, PRECISION)
    }

    @Test
    fun `1 deci meter equals 1e-1 meter`() {
        assertEquals(1e-1, 1.dm.value, PRECISION)
    }

    @Test
    fun `1 centi meter equals 1e-2 meter`() {
        assertEquals(1e-2, 1.cm.value, PRECISION)
    }

    @Test
    fun `1 milli meter equals 1e-3 meter`() {
        assertEquals(1e-3, 1.mm.value, PRECISION)
    }

    @Test
    fun `1 micro meter equals 1e-6 meter`() {
        assertEquals(1e-6, 1.um.value, PRECISION)
    }

    @Test
    fun `1 nano meter equals 1e-9 meter`() {
        assertEquals(1e-9, 1.nm.value, PRECISION)
    }

    @Test
    fun `1 pico meter equals 1e-12 meter`() {
        assertEquals(1e-12, 1.pm.value, PRECISION)
    }

    @Test
    fun `1 femto meter equals 1e-15 meter`() {
        assertEquals(1e-15, 1.fm.value, PRECISION)
    }

    // Conversion

    @Test
    fun `meter as tera meter`() {
        assertEquals(1e-12, 1.m.asTeraMeter(), PRECISION)
    }

    @Test
    fun `meter as giga meter`() {
        assertEquals(1e-9, 1.m.asGigaMeter(), PRECISION)
    }

    @Test
    fun `meter as mega meter`() {
        assertEquals(1e-6, 1.m.asMegaMeter(), PRECISION)
    }

    @Test
    fun `meter as kilo meter`() {
        assertEquals(1e-3, 1.m.asKiloMeter(), PRECISION)
    }

    @Test
    fun `meter as meter`() {
        assertEquals(1.0, 1.m.asMeter(), PRECISION)
    }

    @Test
    fun `meter as deci meter`() {
        assertEquals(10.0, 1.m.asDeciMeter(), PRECISION)
    }

    @Test
    fun `meter as centi meter`() {
        assertEquals(100.0, 1.m.asCentiMeter(), PRECISION)
    }

    @Test
    fun `meter as milli meter`() {
        assertEquals(1e3, 1.m.asMilliMeter(), relDelta(MILLI_CONVERSION))
    }

    @Test
    fun `meter as micro meter`() {
        assertEquals(1e6, 1.m.asMicroMeter(), relDelta(MICRO_CONVERSION))
    }

    @Test
    fun `meter as nano meter`() {
        assertEquals(1e9, 1.m.asNanoMeter(), relDelta(NANO_CONVERSION))
    }

    @Test
    fun `meter as pico meter`() {
        assertEquals(1e12, 1.m.asPicoMeter(), relDelta(PICO_CONVERSION))
    }

    @Test
    fun `meter as femto meter`() {
        assertEquals(1e15, 1.m.asFemtoMeter(), relDelta(FEMTO_CONVERSION))
    }

    // Operators

    @Test
    fun `meter plus meter returns meter`() {
        val distance: Meter = 1.m + 3.5.m

        assertEquals(4.5, distance.value, PRECISION)
    }

    @Test
    fun `meter minus meter returns meter`() {
        val distance: Meter = 1.8.m - 0.9.m

        assertEquals(0.9, distance.value, PRECISION)
    }

    @Test
    fun `meter times scalar returns meter`() {
        val distance: Meter = 1.5.m * 3.0

        assertEquals(4.5, distance.value, PRECISION)
    }

    @Test
    fun `meter divided by scalar returns meter`() {
        val distance: Meter = 3.5.m / 2.0

        assertEquals(1.75, distance.value, PRECISION)
    }
}