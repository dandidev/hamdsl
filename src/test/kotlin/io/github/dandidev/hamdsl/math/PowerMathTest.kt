package io.github.dandidev.hamdsl.math

import io.github.dandidev.hamdsl.dsl.si.*
import io.github.dandidev.hamdsl.dsl.log.*
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class PowerMathTest {

    @Test
    fun `1 watt equals 30 dBm`() {
        assertEquals(30.0, 1.W.toDbm().value, 0.0001)
    }

    @Test
    fun `30 dBm equals 1 watt`() {
        assertEquals(1.0, 30.dBm.toWatt().value, 0.0001)
    }

    @Test
    fun `watt to dbm and back returns original value`() {
        val power = 5.W
        val result = power.toDbm().toWatt()

        assertEquals(power.value, result.value, 0.0001)
    }

    @Test
    fun `power from voltage and current`() {
        val power = 13.8.V.toWatt(2.A)

        assertEquals(27.6, power.value, 0.0001)
    }

    @Test
    fun `power from voltage and resistance`() {
        val power = 10.V.toWatt(50.ohm)

        assertEquals(2.0, power.value, 0.0001)
    }

    @Test
    fun `power from current and resistance`() {
        val power = 2.A.toWatt(50.ohm)

        assertEquals(200.0, power.value, 0.0001)
    }
}