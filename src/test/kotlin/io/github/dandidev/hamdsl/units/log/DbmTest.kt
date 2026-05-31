package io.github.dandidev.hamdsl.units.log

import io.github.dandidev.hamdsl.dsl.log.dB
import io.github.dandidev.hamdsl.dsl.log.dBm
import io.github.dandidev.hamdsl.units.TestConstants.PRECISION
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class DbmTest {

    @Test
    fun `dBm minus dBm returns dB difference`() {
        val result: Db = 30.dBm - (-120).dBm

        assertEquals(150.0, result.value, PRECISION)
    }

    @Test
    fun `dBm minus dB returns reduced dBm`() {
        val result: Dbm = 30.dBm - 20.dB

        assertEquals(10.0, result.value, PRECISION)
    }

    @Test
    fun `dBm plus dB returns increased dBm`() {
        val result: Dbm = 30.dBm + 6.dB

        assertEquals(36.0, result.value, PRECISION)
    }
}