package io.github.dandidev.hamdsl.units.si

import io.github.dandidev.hamdsl.dsl.si.Ampere
import io.github.dandidev.hamdsl.dsl.si.Ohm
import io.github.dandidev.hamdsl.dsl.si.V
import io.github.dandidev.hamdsl.units.TestConstants.PRECISION
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class VoltTest {

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
    fun `volt as giga volt`() {
        assertEquals(0.000000001, 1.V.asGigaVolt(), PRECISION)
    }

    @Test
    fun `volt as mega volt`() {
        assertEquals(0.000001, 1.V.asMegaVolt(), PRECISION)
    }

    @Test
    fun `volt as kilo volt`() {
        assertEquals(0.001, 1.V.asKiloVolt(), PRECISION)
    }

    @Test
    fun `volt as volt`() {
        assertEquals(1.0, 1.V.asVolt(), PRECISION)
    }

    @Test
    fun `volt as milli volt`() {
        assertEquals(1_000.0, 1.V.asMilliVolt(), PRECISION)
    }

    @Test
    fun `volt as micro volt`() {
        assertEquals(1_000_000.0, 1.V.asMicroVolt(), PRECISION)
    }

    @Test
    fun `volt as nano volt`() {
        assertEquals(1_000_000_000.0, 1.V.asNanoVolt(), PRECISION)
    }

    @Test
    fun `volt divided by ohm returns ampere`() {
        val current = 12.V / 6.Ohm

        assertEquals(2.0, current.value, PRECISION)
    }

    @Test
    fun `volt divided by ampere returns ohm`() {
        val resistance = 12.V / 2.Ampere

        assertEquals(6.0, resistance.value, PRECISION)
    }
}