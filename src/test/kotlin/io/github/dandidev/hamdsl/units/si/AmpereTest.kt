package io.github.dandidev.hamdsl.units.si

import io.github.dandidev.hamdsl.dsl.si.A
import io.github.dandidev.hamdsl.dsl.si.Ohm
import io.github.dandidev.hamdsl.units.TestConstants.PRECISION
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class AmpereTest {

    // TODO
    // Verify DSL constructors:
    // - nano
    // - micro
    // - milli
    // - kilo
    // - mega
    // - giga
    //
    // Examples:
    // 1.nV == 1e-9 V
    // 1.mV == 1e-3 V
    // 1.kV == 1000 V
    // 1.MV == 1_000_000 V

    @Test
    fun `ampere as giga ampere`() {
        assertEquals(0.000000001, 1.A.asGigaAmpere(), PRECISION)
    }

    @Test
    fun `ampere as mega ampere`() {
        assertEquals(0.000001, 1.A.asMegaAmpere(), PRECISION)
    }

    @Test
    fun `ampere as kilo ampere`() {
        assertEquals(0.001, 1.A.asKiloAmpere(), PRECISION)
    }

    @Test
    fun `ampere as ampere`() {
        assertEquals(1.0, 1.A.asAmpere(), PRECISION)
    }

    @Test
    fun `ampere as milli ampere`() {
        assertEquals(1_000.0, 1.A.asMilliAmpere(), PRECISION)
    }

    @Test
    fun `ampere as micro ampere`() {
        assertEquals(1_000_000.0, 1.A.asMicroAmpere(), PRECISION)
    }

    @Test
    fun `ampere as nano ampere`() {
        assertEquals(1_000_000_000.0, 1.A.asNanoAmpere(), PRECISION)
    }

    @Test
    fun `ampere plus ampere returns ampere`() {
        val current = 1.A + 3.5.A

        assertEquals(4.5, current.value, PRECISION)
    }

    @Test
    fun `ampere minus ampere returns ampere`() {
        val current = 1.8.A - 0.9.A

        assertEquals(0.9, current.value, PRECISION)
    }

    @Test
    fun `ampere times scalar returns ampere`() {
        val current = 1.5.A * 3.0

        assertEquals(4.5, current.value, PRECISION)
    }

    @Test
    fun `ampere divided by scalar returns ampere`() {
        val current = 3.5.A / 2.0

        assertEquals(1.75, current.value, PRECISION)
    }

    @Test
    fun `ampere times ohm returns volt`() {
        val result = 2.A * 3.Ohm

        assertEquals(6.0, result.value, PRECISION)
    }
}