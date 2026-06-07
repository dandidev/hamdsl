package io.github.dandidev.hamdsl.math

import io.github.dandidev.hamdsl.units.si.Farad
import io.github.dandidev.hamdsl.units.si.Henry
import io.github.dandidev.hamdsl.units.si.Hertz
import io.github.dandidev.hamdsl.units.si.Ohm
import kotlin.math.PI

/**
 * Calculates capacitive reactance from a frequency and capacitance.
 *
 * Mathematical background:
 *
 *     XC = 1 / (2π × f × C)
 *
 * where:
 *
 *     XC = capacitive reactance [Ω]
 *     f  = frequency [Hz]
 *     C  = capacitance [F]
 *
 * The formula assumes:
 *
 * - ideal capacitor (no parasitic resistance or inductance)
 * - sinusoidal signal
 * - frequency expressed in hertz
 * - capacitance expressed in farads
 *
 * Parameters:
 * - frequency.value: frequency [Hz]
 * - capacitance.value: capacitance [F]
 *
 * Result:
 * - capacitive reactance in ohms [Ω]
 *
 * Examples:
 *
 *     100 pF at 7.1 MHz
 *
 *         XC = 1 / (2π × 7.1 × 10⁶ × 100 × 10⁻¹²)
 *         XC ≈ 224 Ω
 *
 *     10 nF at 14 MHz
 *
 *         XC = 1 / (2π × 14 × 10⁶ × 10 × 10⁻⁹)
 *         XC ≈ 1.14 Ω
 *
 * Typical RF usage:
 *
 *     val xc = capacitiveReactance(7.1.MHz, 100.pF)
 */
fun capacitiveReactance(frequency: Hertz, capacitance: Farad): Ohm =
    Ohm(1.0 / (2.0 * PI * frequency.value * capacitance.value))

/**
 * Calculates inductive reactance from a frequency and inductance.
 *
 * Mathematical background:
 *
 *     XL = 2π × f × L
 *
 * where:
 *
 *     XL = inductive reactance [Ω]
 *     f  = frequency [Hz]
 *     L  = inductance [H]
 *
 * The formula assumes:
 *
 * - ideal inductor (no parasitic resistance or capacitance)
 * - sinusoidal signal
 * - frequency expressed in hertz
 * - inductance expressed in henry
 *
 * Parameters:
 * - frequency.value: frequency [Hz]
 * - inductance.value: inductance [H]
 *
 * Result:
 * - inductive reactance in ohms [Ω]
 *
 * Examples:
 *
 *     10 µH at 7.1 MHz
 *
 *         XL = 2π × 7.1 × 10⁶ × 10 × 10⁻⁶
 *         XL ≈ 446 Ω
 *
 *     1 mH at 14 MHz
 *
 *         XL = 2π × 14 × 10⁶ × 1 × 10⁻³
 *         XL ≈ 87965 Ω
 *
 * Typical RF usage:
 *
 *     val xl = inductiveReactance(7.1.MHz, 10.uH)
 */
fun inductiveReactance(frequency: Hertz, inductance: Henry): Ohm =
    Ohm(2.0 * PI * frequency.value * inductance.value)