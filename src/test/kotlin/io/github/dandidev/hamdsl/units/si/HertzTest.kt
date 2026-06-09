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

class HertzTest {

    // DSL constructors

    @Test
    fun `1 tera hertz equals 1e12 hertz`() {
        assertEquals(1e12, 1.THz.value, PRECISION)
    }

    @Test
    fun `1 giga hertz equals 1e9 hertz`() {
        assertEquals(1e9, 1.GHz.value, PRECISION)
    }

    @Test
    fun `1 mega hertz equals 1e6 hertz`() {
        assertEquals(1e6, 1.MHz.value, PRECISION)
    }

    @Test
    fun `1 kilo hertz equals 1e3 hertz`() {
        assertEquals(1e3, 1.kHz.value, PRECISION)
    }

    @Test
    fun `1 hertz equals 1 hertz`() {
        assertEquals(1.0, 1.Hz.value, PRECISION)
    }

    @Test
    fun `1 milli hertz equals 1e-3 hertz`() {
        assertEquals(1e-3, 1.mHz.value, PRECISION)
    }

    @Test
    fun `1 micro hertz equals 1e-6 hertz`() {
        assertEquals(1e-6, 1.uHz.value, PRECISION)
    }

    @Test
    fun `1 nano hertz equals 1e-9 hertz`() {
        assertEquals(1e-9, 1.nHz.value, PRECISION)
    }

    @Test
    fun `1 pico hertz equals 1e-12 hertz`() {
        assertEquals(1e-12, 1.pHz.value, PRECISION)
    }

    @Test
    fun `1 femto hertz equals 1e-15 hertz`() {
        assertEquals(1e-15, 1.fHz.value, PRECISION)
    }

    // Conversion

    @Test
    fun `hertz as tera hertz`() {
        assertEquals(1e-12, 1.Hz.asTeraHertz(), PRECISION)
    }

    @Test
    fun `hertz as giga hertz`() {
        assertEquals(1e-9, 1.Hz.asGigaHertz(), PRECISION)
    }

    @Test
    fun `hertz as mega hertz`() {
        assertEquals(1e-6, 1.Hz.asMegaHertz(), PRECISION)
    }

    @Test
    fun `hertz as kilo hertz`() {
        assertEquals(1e-3, 1.Hz.asKiloHertz(), PRECISION)
    }

    @Test
    fun `hertz as hertz`() {
        assertEquals(1.0, 1.Hz.asHertz(), PRECISION)
    }

    @Test
    fun `hertz as milli hertz`() {
        assertEquals(1e3, 1.Hz.asMilliHertz(), relDelta(MILLI_CONVERSION))
    }

    @Test
    fun `hertz as micro hertz`() {
        assertEquals(1e6, 1.Hz.asMicroHertz(), relDelta(MICRO_CONVERSION))
    }

    @Test
    fun `hertz as nano hertz`() {
        assertEquals(1e9, 1.Hz.asNanoHertz(), relDelta(NANO_CONVERSION))
    }

    @Test
    fun `hertz as pico hertz`() {
        assertEquals(1e12, 1.Hz.asPicoHertz(), relDelta(PICO_CONVERSION))
    }

    @Test
    fun `hertz as femto hertz`() {
        assertEquals(1e15, 1.Hz.asFemtoHertz(), relDelta(FEMTO_CONVERSION))
    }

    // Operators

    @Test
    fun `hertz plus hertz returns hertz`() {
        val frequency: Hertz = 1.Hz + 3.5.Hz

        assertEquals(4.5, frequency.value, PRECISION)
    }

    @Test
    fun `hertz minus hertz returns hertz`() {
        val frequency: Hertz = 1.8.Hz - 0.9.Hz

        assertEquals(0.9, frequency.value, PRECISION)
    }

    @Test
    fun `hertz times scalar returns hertz`() {
        val frequency: Hertz = 1.5.Hz * 3.0

        assertEquals(4.5, frequency.value, PRECISION)
    }

    @Test
    fun `hertz divided by scalar returns hertz`() {
        val frequency: Hertz = 3.5.Hz / 2.0

        assertEquals(1.75, frequency.value, PRECISION)
    }
}