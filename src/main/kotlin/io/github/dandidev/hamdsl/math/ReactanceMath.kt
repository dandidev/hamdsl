package io.github.dandidev.hamdsl.math

import io.github.dandidev.hamdsl.units.si.Farad
import io.github.dandidev.hamdsl.units.si.Henry
import io.github.dandidev.hamdsl.units.si.Hertz
import io.github.dandidev.hamdsl.units.si.Ohm
import kotlin.math.PI
import kotlin.math.sqrt

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

/**
 * Calculates the resonant frequency of an LC circuit.
 *
 * Mathematical background:
 *
 *     f = 1 / (2π × √(L × C))
 *
 * where:
 *
 *     f = resonant frequency [Hz]
 *     L = inductance [H]
 *     C = capacitance [F]
 *
 * The formula assumes:
 *
 * - ideal inductor and capacitor (no parasitic resistance)
 * - sinusoidal signal
 * - inductance expressed in henry
 * - capacitance expressed in farads
 *
 * Parameters:
 * - inductance.value: inductance [H]
 * - capacitance.value: capacitance [F]
 *
 * Result:
 * - resonant frequency in hertz [Hz]
 *
 * Examples:
 *
 *     10 µH and 100 pF
 *
 *         f = 1 / (2π × √(10 × 10⁻⁶ × 100 × 10⁻¹²))
 *         f ≈ 5.03 MHz
 *
 *     1 mH and 470 pF
 *
 *         f = 1 / (2π × √(1 × 10⁻³ × 470 × 10⁻¹²))
 *         f ≈ 7.34 MHz
 *
 * Typical RF usage:
 *
 *     val f = resonantFrequency(10.uH, 100.pF)
 */
fun resonantFrequency(inductance: Henry, capacitance: Farad): Hertz =
    Hertz(1.0 / (2.0 * PI * sqrt(inductance.value * capacitance.value)))

/**
 * Calculates the required capacitance for a target resonant frequency
 * given a fixed inductance.
 *
 * Mathematical background:
 *
 *     C = 1 / (4π² × f² × L)
 *
 * where:
 *
 *     C = capacitance [F]
 *     f = resonant frequency [Hz]
 *     L = inductance [H]
 *
 * The formula assumes:
 *
 * - ideal inductor and capacitor (no parasitic resistance)
 * - sinusoidal signal
 * - frequency expressed in hertz
 * - inductance expressed in henry
 *
 * Parameters:
 * - frequency.value: target resonant frequency [Hz]
 * - inductance.value: fixed inductance [H]
 *
 * Result:
 * - required capacitance in farads [F]
 *
 * Examples:
 *
 *     10 µH, target 7.1 MHz (40m band)
 *
 *         C = 1 / (4π² × (7.1 × 10⁶)² × 10 × 10⁻⁶)
 *         C ≈ 50.2 pF
 *
 *     10 µH, target 14.2 MHz (20m band)
 *
 *         C = 1 / (4π² × (14.2 × 10⁶)² × 10 × 10⁻⁶)
 *         C ≈ 12.6 pF
 *
 * Typical RF usage:
 *
 *     val c = capacitanceForResonance(7.1.MHz, 10.uH)
 */
fun capacitanceForResonance(frequency: Hertz, inductance: Henry): Farad =
    Farad(1.0 / (4.0 * PI * PI * frequency.value * frequency.value * inductance.value))

/**
 * Calculates the required inductance for a target resonant frequency
 * given a fixed capacitance.
 *
 * Mathematical background:
 *
 *     L = 1 / (4π² × f² × C)
 *
 * where:
 *
 *     L = inductance [H]
 *     f = resonant frequency [Hz]
 *     C = capacitance [F]
 *
 * The formula assumes:
 *
 * - ideal inductor and capacitor (no parasitic resistance)
 * - sinusoidal signal
 * - frequency expressed in hertz
 * - capacitance expressed in farads
 *
 * Parameters:
 * - frequency.value: target resonant frequency [Hz]
 * - capacitance.value: fixed capacitance [F]
 *
 * Result:
 * - required inductance in henry [H]
 *
 * Examples:
 *
 *     100 pF, target 7.1 MHz (40m band)
 *
 *         L = 1 / (4π² × (7.1 × 10⁶)² × 100 × 10⁻¹²)
 *         L ≈ 5.03 µH
 *
 *     100 pF, target 14.2 MHz (20m band)
 *
 *         L = 1 / (4π² × (14.2 × 10⁶)² × 100 × 10⁻¹²)
 *         L ≈ 1.26 µH
 *
 * Typical RF usage:
 *
 *     val l = inductanceForResonance(7.1.MHz, 100.pF)
 */
fun inductanceForResonance(frequency: Hertz, capacitance: Farad): Henry =
    Henry(1.0 / (4.0 * PI * PI * frequency.value * frequency.value * capacitance.value))