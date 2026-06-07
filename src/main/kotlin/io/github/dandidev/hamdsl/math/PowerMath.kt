package io.github.dandidev.hamdsl.math

import io.github.dandidev.hamdsl.units.log.Dbm
import io.github.dandidev.hamdsl.units.si.Ampere
import io.github.dandidev.hamdsl.units.si.Ohm
import io.github.dandidev.hamdsl.units.si.Volt
import io.github.dandidev.hamdsl.units.si.Watt
import kotlin.math.log10
import kotlin.math.pow

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
 * Converts RF power level from dBm to watts.
 *
 * Mathematical background:
 *
 *     P[W] = 10^(P[dBm] / 10) / 1000
 *
 * Parameters:
 * - this.value: RF power level in dBm [dBm]
 *
 * Result:
 * - RF power in watts [W]
 *
 * Examples:
 *
 *     37 dBm
 *
 *         P[W] = 10^(37 / 10) / 1000
 *         P[W] ≈ 5.01 W
 *
 *     0 dBm
 *
 *         P[W] = 10^(0 / 10) / 1000
 *         P[W] = 0.001 W = 1 mW
 *
 * Typical RF usage:
 *
 *     val power = 37.dBm.toWatt()
 */
fun Dbm.toWatt(): Watt = Watt(10.0.pow(value / 10.0) / 1000.0)

/**
 * Calculates RF power in watts from voltage and current.
 *
 * Mathematical background:
 *
 *     P = U × I
 *
 * where:
 *
 *     P = power [W]
 *     U = voltage [V]
 *     I = current [A]
 *
 * Parameters:
 * - this.value: voltage [V]
 * - current.value: current [A]
 *
 * Result:
 * - power in watts [W]
 *
 * Examples:
 *
 *     12 V and 2 A
 *
 *         P = 12 × 2
 *         P = 24 W
 *
 *     13.8 V and 10 A
 *
 *         P = 13.8 × 10
 *         P = 138 W
 *
 * Typical RF usage:
 *
 *     val power = 13.8.V.toWatt(10.A)
 */
fun Volt.toWatt(current: Ampere): Watt =
    Watt(value * current.value)

/**
 * Calculates RF power in watts from current and resistance.
 *
 * Mathematical background:
 *
 *     P = I² × R
 *
 * where:
 *
 *     P = power [W]
 *     I = current [A]
 *     R = resistance [Ω]
 *
 * Parameters:
 * - this.value: current [A]
 * - resistance.value: resistance [Ω]
 *
 * Result:
 * - power in watts [W]
 *
 * Examples:
 *
 *     2 A across 50 Ω
 *
 *         P = 2² × 50
 *         P = 200 W
 *
 *     0.5 A across 8 Ω
 *
 *         P = 0.5² × 8
 *         P = 2 W
 *
 * Typical RF usage:
 *
 *     val power = 2.A.toWatt(50.Ohm)
 */
fun Ampere.toWatt(resistance: Ohm): Watt =
    Watt(value * value * resistance.value)

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