package io.github.dandidev.hamdsl.math

import io.github.dandidev.hamdsl.dsl.si.MHz
import io.github.dandidev.hamdsl.dsl.si.pF
import io.github.dandidev.hamdsl.dsl.si.uH
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class ReactanceMathTest {

    @Test
    fun `capacitive reactance at 7_1 MHz and 100 pF`() {
        val xc = capacitiveReactance(7.1.MHz, 100.pF)

        assertEquals(224.162, xc.value, 0.001)
    }

    @Test
    fun `capacitive reactance doubles when frequency halves`() {
        val xc1 = capacitiveReactance(14.2.MHz, 100.pF)
        val xc2 = capacitiveReactance(7.1.MHz, 100.pF)

        assertEquals(xc2.value, xc1.value * 2.0, 0.001)
    }

    @Test
    fun `inductive reactance at 7_1 MHz and 10 uH`() {
        val xl = inductiveReactance(7.1.MHz, 10.uH)

        assertEquals(446.106, xl.value, 0.001)
    }

    @Test
    fun `inductive reactance doubles when frequency doubles`() {
        val xl1 = inductiveReactance(7.1.MHz, 10.uH)
        val xl2 = inductiveReactance(14.2.MHz, 10.uH)

        assertEquals(xl1.value * 2.0, xl2.value, 0.001)
    }

    @Test
    fun `capacitive reactance result is ohm`() {
        val xc = capacitiveReactance(7.1.MHz, 100.pF)

        assertEquals(224.162, xc.value, 0.001)
    }

    @Test
    fun `inductive reactance result is ohm`() {
        val xl = inductiveReactance(7.1.MHz, 10.uH)

        assertEquals(446.106, xl.value, 0.001)
    }
}