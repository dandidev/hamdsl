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

class VoltTest {

    // DSL constructors

    @Test
    fun `1 tera volt equals 1e12 volt`() {
        assertEquals(1e12, 1.TV.value, PRECISION)
    }

    @Test
    fun `1 giga volt equals 1e9 volt`() {
        assertEquals(1e9, 1.GV.value, PRECISION)
    }

    @Test
    fun `1 mega volt equals 1e6 volt`() {
        assertEquals(1e6, 1.MV.value, PRECISION)
    }

    @Test
    fun `1 kilo volt equals 1e3 volt`() {
        assertEquals(1e3, 1.kV.value, PRECISION)
    }

    @Test
    fun `1 volt equals 1 volt`() {
        assertEquals(1.0, 1.V.value, PRECISION)
    }

    @Test
    fun `1 milli volt equals 1e-3 volt`() {
        assertEquals(1e-3, 1.mV.value, PRECISION)
    }

    @Test
    fun `1 micro volt equals 1e-6 volt`() {
        assertEquals(1e-6, 1.uV.value, PRECISION)
    }

    @Test
    fun `1 nano volt equals 1e-9 volt`() {
        assertEquals(1e-9, 1.nV.value, PRECISION)
    }

    @Test
    fun `1 pico volt equals 1e-12 volt`() {
        assertEquals(1e-12, 1.pV.value, PRECISION)
    }

    @Test
    fun `1 femto volt equals 1e-15 volt`() {
        assertEquals(1e-15, 1.fV.value, PRECISION)
    }

    // Conversion

    @Test
    fun `volt as tera volt`() {
        assertEquals(1e-12, 1.V.asTeraVolt(), PRECISION)
    }

    @Test
    fun `volt as giga volt`() {
        assertEquals(1e-9, 1.V.asGigaVolt(), PRECISION)
    }

    @Test
    fun `volt as mega volt`() {
        assertEquals(1e-6, 1.V.asMegaVolt(), PRECISION)
    }

    @Test
    fun `volt as kilo volt`() {
        assertEquals(1e-3, 1.V.asKiloVolt(), PRECISION)
    }

    @Test
    fun `volt as volt`() {
        assertEquals(1.0, 1.V.asVolt(), PRECISION)
    }

    @Test
    fun `volt as milli volt`() {
        assertEquals(1e3, 1.V.asMilliVolt(), relDelta(MILLI_CONVERSION))
    }

    @Test
    fun `volt as micro volt`() {
        assertEquals(1e6, 1.V.asMicroVolt(), relDelta(MICRO_CONVERSION))
    }

    @Test
    fun `volt as nano volt`() {
        assertEquals(1e9, 1.V.asNanoVolt(), relDelta(NANO_CONVERSION))
    }

    @Test
    fun `volt as pico volt`() {
        assertEquals(1e12, 1.V.asPicoVolt(), relDelta(PICO_CONVERSION))
    }

    @Test
    fun `volt as femto volt`() {
        assertEquals(1e15, 1.V.asFemtoVolt(), relDelta(FEMTO_CONVERSION))
    }

    // Operators

    @Test
    fun `volt plus volt returns volt`() {
        val voltage: Volt = 1.V + 3.5.V

        assertEquals(4.5, voltage.value, PRECISION)
    }

    @Test
    fun `volt minus volt returns volt`() {
        val voltage: Volt = 1.8.V - 0.9.V

        assertEquals(0.9, voltage.value, PRECISION)
    }

    @Test
    fun `volt times scalar returns volt`() {
        val voltage: Volt = 1.5.V * 3.0

        assertEquals(4.5, voltage.value, PRECISION)
    }

    @Test
    fun `volt divided by scalar returns volt`() {
        val voltage: Volt = 3.5.V / 2.0

        assertEquals(1.75, voltage.value, PRECISION)
    }

    @Test
    fun `volt divided by ohm returns ampere`() {
        val result: Ampere = 6.V / 3.ohm

        assertEquals(2.0, result.value, PRECISION)
    }

    @Test
    fun `volt divided by ampere returns ohm`() {
        val result: Ohm = 6.V / 2.A

        assertEquals(3.0, result.value, PRECISION)
    }
}