package io.github.dandidev.hamdsl.units.si

import io.github.dandidev.hamdsl.dsl.si.Ohm
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
        assertEquals(0.000000001, 1.Ohm.asGigaOhm(), PRECISION)
    }

    @Test
    fun `ohm as mega ohm`() {
        assertEquals(0.000001, 1.Ohm.asMegaOhm(), PRECISION)
    }

    @Test
    fun `ohm as kilo ohm`() {
        assertEquals(0.001, 1.Ohm.asKiloOhm(), PRECISION)
    }

    @Test
    fun `ohm as ohm`() {
        assertEquals(1.0, 1.Ohm.asOhm(), PRECISION)
    }

    @Test
    fun `ohm as milli ohm`() {
        assertEquals(1_000.0, 1.Ohm.asMilliOhm(), PRECISION)
    }

    @Test
    fun `ohm as micro ohm`() {
        assertEquals(1_000_000.0, 1.Ohm.asMicroOhm(), PRECISION)
    }

    @Test
    fun `ohm as nano ohm`() {
        assertEquals(1_000_000_000.0, 1.Ohm.asNanoOhm(), PRECISION)
    }
}