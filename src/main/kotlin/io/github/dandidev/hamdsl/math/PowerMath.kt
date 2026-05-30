package io.github.dandidev.hamdsl.math

import io.github.dandidev.hamdsl.units.log.Dbm
import io.github.dandidev.hamdsl.units.si.Ohm
import io.github.dandidev.hamdsl.units.si.Volt
import io.github.dandidev.hamdsl.units.si.Watt
import kotlin.math.log10

/**
 * Converts RF power from watts to dBm.
 *
 * Mathematical background:
 *
 *     P[dBm] = 10 * log10(P[mW])
 *
 * Since the input value is given in watts:
 *
 *     P[mW] = P[W] * 1000
 *
 * Therefore, the implemented formula is:
 *
 *     P[dBm] = 10 * log10(P[W] * 1000)
 *
 * Parameters:
 * - this.value: RF power in watts [W]
 *
 * Result:
 * - RF power level in dBm [dBm]
 *
 * Example:
 *
 *     5 W = 5000 mW
 *     P[dBm] = 10 * log10(5000)
 *     P[dBm] = 36.9897 dBm
 */
fun Watt.toDbm(): Dbm = Dbm(10.0 * log10(value * 1000.0))

/**
 * Calculates RF power in watts from an RMS voltage and load impedance.
 *
 * Mathematical background:
 *
 *     P = U² / R
 *
 * where:
 *
 *     P = power [W]
 *     U = RMS voltage [V]
 *     R = load impedance [Ω]
 *
 * The formula assumes:
 *
 * - RMS voltage
 * - purely resistive load
 * - impedance expressed in ohms
 *
 * Parameters:
 * - this.value: RMS voltage [V]
 * - impedance.value: load impedance [Ω]
 *
 * Result:
 * - RF power in watts [W]
 *
 * Examples:
 *
 *     1 V across 50 Ω
 *
 *         P = 1² / 50
 *         P = 0.02 W
 *
 *     0.2 µV across 50 Ω
 *
 *         P = (0.2 × 10⁻⁶)² / 50
 *         P ≈ 8 × 10⁻¹⁶ W
 *
 * Typical RF usage:
 *
 *     val power =
 *         0.2.uV
 *             .toWatt(50.Ohm)
 *
 *     val level =
 *         power.toDbm()
 */
fun Volt.toWatt(
    impedance: Ohm
): Watt =
    Watt((value * value) / impedance.value)