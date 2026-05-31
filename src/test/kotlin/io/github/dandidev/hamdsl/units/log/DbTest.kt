package io.github.dandidev.hamdsl.units.log

import io.github.dandidev.hamdsl.dsl.log.dB
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class DbTest {
    @Test
    fun `dB plus dB returns summed dB`() {
        val result = 20.dB + 10.dB

        assertEquals(30.0, result.value, 1e-9)
    }

    @Test
    fun `dB minus dB returns difference in dB`() {
        val result = 20.dB - 3.dB

        assertEquals(17.0, result.value, 1e-9)
    }
}