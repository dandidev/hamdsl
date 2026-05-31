package io.github.dandidev.hamdsl.units.si

import io.github.dandidev.hamdsl.dsl.si.W
import io.github.dandidev.hamdsl.units.TestConstants.PRECISION
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class WattTest {

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
    fun `watt as giga watt`() {
        assertEquals(0.000000001, 1.W.asGigaWatt(), PRECISION)
    }

    @Test
    fun `watt as mega watt`() {
        assertEquals(0.000001, 1.W.asMegaWatt(), PRECISION)
    }

    @Test
    fun `watt as kilo watt`() {
        assertEquals(0.001, 1.W.asKiloWatt(), PRECISION)
    }

    @Test
    fun `watt as watt`() {
        assertEquals(1.0, 1.W.asWatt(), PRECISION)
    }

    @Test
    fun `watt as milli watt`() {
        assertEquals(1_000.0, 1.W.asMilliWatt(), PRECISION)
    }

    @Test
    fun `watt as micro watt`() {
        assertEquals(1_000_000.0, 1.W.asMicroWatt(), PRECISION)
    }

    @Test
    fun `watt as nano watt`() {
        assertEquals(1_000_000_000.0, 1.W.asNanoWatt(), PRECISION)
    }
}