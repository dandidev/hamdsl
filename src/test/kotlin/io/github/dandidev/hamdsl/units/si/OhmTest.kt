package io.github.dandidev.hamdsl.units.si

import io.github.dandidev.hamdsl.dsl.si.A
import io.github.dandidev.hamdsl.dsl.si.ohm
import io.github.dandidev.hamdsl.units.TestConstants.PRECISION
import kotlin.test.Test
import kotlin.test.assertEquals

class OhmTest {

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
    fun `ohm as giga ohm`() {
        assertEquals(0.000000001, 1.ohm.asGigaOhm(), PRECISION)
    }

    @Test
    fun `ohm as mega ohm`() {
        assertEquals(0.000001, 1.ohm.asMegaOhm(), PRECISION)
    }

    @Test
    fun `ohm as kilo ohm`() {
        assertEquals(0.001, 1.ohm.asKiloOhm(), PRECISION)
    }

    @Test
    fun `ohm as ohm`() {
        assertEquals(1.0, 1.ohm.asOhm(), PRECISION)
    }

    @Test
    fun `ohm as milli ohm`() {
        assertEquals(1_000.0, 1.ohm.asMilliOhm(), PRECISION)
    }

    @Test
    fun `ohm as micro ohm`() {
        assertEquals(1_000_000.0, 1.ohm.asMicroOhm(), PRECISION)
    }

    @Test
    fun `ohm as nano ohm`() {
        assertEquals(1_000_000_000.0, 1.ohm.asNanoOhm(), PRECISION)
    }

    @Test
    fun `ohm plus ohm returns ohm`() {
        val current: Ohm = 1.ohm + 3.5.ohm

        assertEquals(4.5, current.value, PRECISION)
    }

    @Test
    fun `ohm minus ohm returns ohm`() {
        val current: Ohm = 1.8.ohm - 0.9.ohm

        assertEquals(0.9, current.value, PRECISION)
    }

    @Test
    fun `ohm times scalar returns ohm`() {
        val current: Ohm = 1.5.ohm * 3.0

        assertEquals(4.5, current.value, PRECISION)
    }

    @Test
    fun `ohm divided by scalar returns ohm`() {
        val current: Ohm = 3.5.ohm / 2.0

        assertEquals(1.75, current.value, PRECISION)
    }

    @Test
    fun `ohm times ampere returns volt`() {
        val result: Volt = 2.ohm * 3.A

        assertEquals(6.0, result.value, PRECISION)
    }
}