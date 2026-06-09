package io.github.dandidev.hamdsl.units.si

import io.github.dandidev.hamdsl.dsl.si.*
import io.github.dandidev.hamdsl.units.TestConstants
import io.github.dandidev.hamdsl.units.TestConstants.FEMTO_CONVERSION
import io.github.dandidev.hamdsl.units.TestConstants.MICRO_CONVERSION
import io.github.dandidev.hamdsl.units.TestConstants.MILLI_CONVERSION
import io.github.dandidev.hamdsl.units.TestConstants.NANO_CONVERSION
import io.github.dandidev.hamdsl.units.TestConstants.PICO_CONVERSION
import io.github.dandidev.hamdsl.units.TestConstants.PRECISION
import io.github.dandidev.hamdsl.units.TestConstants.relDelta
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class AmpereTest {

    // DSL constructors

    @Test
    fun `1 tera ampere equals 1e12 ampere`() {
        assertEquals(1e12, 1.TA.value, PRECISION)
    }

    @Test
    fun `1 giga ampere equals 1e9 ampere`() {
        assertEquals(1e9, 1.GA.value, PRECISION)
    }

    @Test
    fun `1 mega ampere equals 1e6 ampere`() {
        assertEquals(1e6, 1.MA.value, PRECISION)
    }

    @Test
    fun `1 kilo ampere equals 1e3 ampere`() {
        assertEquals(1e3, 1.kA.value, PRECISION)
    }

    @Test
    fun `1 ampere equals 1 ampere`() {
        assertEquals(1.0, 1.A.value, PRECISION)
    }

    @Test
    fun `1 milli ampere equals 1e-3 ampere`() {
        assertEquals(1e-3, 1.mA.value, PRECISION)
    }

    @Test
    fun `1 micro ampere equals 1e-6 ampere`() {
        assertEquals(1e-6, 1.uA.value, PRECISION)
    }

    @Test
    fun `1 nano ampere equals 1e-9 ampere`() {
        assertEquals(1e-9, 1.nA.value, PRECISION)
    }

    @Test
    fun `1 pico ampere equals 1e-12 ampere`() {
        assertEquals(1e-12, 1.pA.value, PRECISION)
    }

    @Test
    fun `1 femto ampere equals 1e-15 ampere`() {
        assertEquals(1e-15, 1.fA.value, PRECISION)
    }

    // Conversion

    @Test
    fun `ampere as tera ampere`() {
        assertEquals(1e-12, 1.A.asTeraAmpere(), PRECISION)
    }

    @Test
    fun `ampere as giga ampere`() {
        assertEquals(1e-9, 1.A.asGigaAmpere(), PRECISION)
    }

    @Test
    fun `ampere as mega ampere`() {
        assertEquals(1e-6, 1.A.asMegaAmpere(), PRECISION)
    }

    @Test
    fun `ampere as kilo ampere`() {
        assertEquals(1e-3, 1.A.asKiloAmpere(), PRECISION)
    }

    @Test
    fun `ampere as ampere`() {
        assertEquals(1.0, 1.A.asAmpere(), PRECISION)
    }

    @Test
    fun `ampere as milli ampere`() {
        assertEquals(1e3, 1.A.asMilliAmpere(), relDelta(MILLI_CONVERSION))
    }

    @Test
    fun `ampere as micro ampere`() {
        assertEquals(1e6, 1.A.asMicroAmpere(), relDelta(MICRO_CONVERSION))
    }

    @Test
    fun `ampere as nano ampere`() {
        assertEquals(1e9, 1.A.asNanoAmpere(), relDelta(NANO_CONVERSION))
    }

    @Test
    fun `ampere as pico ampere`() {
        assertEquals(1e12, 1.A.asPicoAmpere(), relDelta(PICO_CONVERSION))
    }

    @Test
    fun `ampere as femto ampere`() {
        assertEquals(1e15, 1.A.asFemtoAmpere(), relDelta(FEMTO_CONVERSION))
    }

    // Operators

    @Test
    fun `ampere plus ampere returns ampere`() {
        val current: Ampere = 1.A + 3.5.A

        assertEquals(4.5, current.value, PRECISION)
    }

    @Test
    fun `ampere minus ampere returns ampere`() {
        val current: Ampere = 1.8.A - 0.9.A

        assertEquals(0.9, current.value, PRECISION)
    }

    @Test
    fun `ampere times scalar returns ampere`() {
        val current: Ampere = 1.5.A * 3.0

        assertEquals(4.5, current.value, PRECISION)
    }

    @Test
    fun `ampere divided by scalar returns ampere`() {
        val current: Ampere = 3.5.A / 2.0

        assertEquals(1.75, current.value, PRECISION)
    }

    @Test
    fun `ampere times ohm returns volt`() {
        val result: Volt = 2.A * 3.ohm

        assertEquals(6.0, result.value, PRECISION)
    }
}