package io.github.dandidev.hamdsl.units.si

import io.github.dandidev.hamdsl.dsl.si.Hz
import io.github.dandidev.hamdsl.units.TestConstants.PRECISION
import kotlin.test.Test
import kotlin.test.assertEquals

class HertzTest {

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
    fun `hertz as giga hertz`() {
        assertEquals(0.000000001, 1.Hz.asGigaHertz(), PRECISION)
    }

    @Test
    fun `hertz as mega hertz`() {
        assertEquals(0.000001, 1.Hz.asMegaHertz(), PRECISION)
    }

    @Test
    fun `hertz as kilo hertz`() {
        assertEquals(0.001, 1.Hz.asKiloHertz(), PRECISION)
    }

    @Test
    fun `hertz as hertz`() {
        assertEquals(1.0, 1.Hz.asHertz(), PRECISION)
    }

    @Test
    fun `hertz as milli hertz`() {
        assertEquals(1_000.0, 1.Hz.asMilliHertz(), PRECISION)
    }

    @Test
    fun `hertz as micro hertz`() {
        assertEquals(1_000_000.0, 1.Hz.asMicroHertz(), PRECISION)
    }

    @Test
    fun `hertz as nano hertz`() {
        assertEquals(1_000_000_000.0, 1.Hz.asNanoHertz(), PRECISION)
    }
}