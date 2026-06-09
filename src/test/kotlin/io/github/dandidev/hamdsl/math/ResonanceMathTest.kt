package io.github.dandidev.hamdsl.math

import io.github.dandidev.hamdsl.dsl.si.MHz
import io.github.dandidev.hamdsl.dsl.si.pF
import io.github.dandidev.hamdsl.dsl.si.uH
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class ResonanceMathTest {

    @Test
    fun `resonant frequency of 10 uH and 100 pF`() {
        val frequency = resonantFrequency(10.uH, 100.pF)

        assertEquals(5_032_921.0, frequency.value, 1.0)
    }

    @Test
    fun `capacitance for resonance at 7_1 MHz with 10 uH`() {
        val capacitance = capacitanceForResonance(7.1.MHz, 10.uH)

        assertEquals(5.02e-11, capacitance.value, 1e-13)
    }

    @Test
    fun `inductance for resonance at 7_1 MHz with 100 pF`() {
        val inductance = inductanceForResonance(7.1.MHz, 100.pF)

        assertEquals(5.02e-6, inductance.value, 1e-8)
    }

    @Test
    fun `capacitance and inductance for resonance are consistent`() {
        val frequency = 7.1.MHz
        val inductance = 10.uH

        val capacitance = capacitanceForResonance(frequency, inductance)
        val result = resonantFrequency(inductance, capacitance)

        assertEquals(frequency.value, result.value, 1.0)
    }

    @Test
    fun `xc equals xl at resonant frequency`() {
        val inductance = 10.uH
        val capacitance = 100.pF
        val frequency = resonantFrequency(inductance, capacitance)

        val xc = capacitiveReactance(frequency, capacitance)
        val xl = inductiveReactance(frequency, inductance)

        assertEquals(xc.value, xl.value, 0.001)
    }
}