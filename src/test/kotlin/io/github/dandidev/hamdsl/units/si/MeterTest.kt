package io.github.dandidev.hamdsl.units.si

import io.github.dandidev.hamdsl.dsl.si.m
import io.github.dandidev.hamdsl.units.TestConstants.PRECISION
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class MeterTest {

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
    fun `meter as giga meter`() {
        assertEquals(0.000000001, 1.m.asGigaMeter(), PRECISION)
    }

    @Test
    fun `meter as mega meter`() {
        assertEquals(0.000001, 1.m.asMegaMeter(), PRECISION)
    }

    @Test
    fun `meter as kilo meter`() {
        assertEquals(0.001, 1.m.asKiloMeter(), PRECISION)
    }

    @Test
    fun `meter as meter`() {
        assertEquals(1.0, 1.m.asMeter(), PRECISION)
    }

    @Test
    fun `meter as milli meter`() {
        assertEquals(1_000.0, 1.m.asMilliMeter(), PRECISION)
    }

    @Test
    fun `meter as micro meter`() {
        assertEquals(1_000_000.0, 1.m.asMicroMeter(), PRECISION)
    }

    @Test
    fun `meter as nano meter`() {
        assertEquals(1_000_000_000.0, 1.m.asNanoMeter(), PRECISION)
    }
}