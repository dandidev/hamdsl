package io.github.dandidev.hamdsl.math

import io.github.dandidev.hamdsl.units.log.Dbm
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
 * Therefore the implemented formula is:
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
 * Converts an absolute RF power level from dBm to milliwatts.
 *
 * Mathematical background:
 *
 *     P[dBm] = 10 * log10(P[mW])
 *
 * Rearranged:
 *
 *     P[mW] = 10 ^ (P[dBm] / 10)
 *
 * Parameters:
 * - this.value: RF power level in dBm [dBm]
 *
 * Result:
 * - RF power in milliwatts [mW]
 *
 * Examples:
 *
 *     0 dBm  = 1 mW
 *     10 dBm = 10 mW
 *     30 dBm = 1000 mW
 */
fun Dbm.toMilliWatt(): Double = 10.0.pow(value / 10.0)

/**
 * Converts an absolute RF power level from dBm to watts.
 *
 * Mathematical background:
 *
 *     P[mW] = 10 ^ (P[dBm] / 10)
 *
 * Since:
 *
 *     1 W = 1000 mW
 *
 * the implemented formula is:
 *
 *     P[W] = 10 ^ (P[dBm] / 10) / 1000
 *
 * Parameters:
 * - this.value: RF power level in dBm [dBm]
 *
 * Result:
 * - RF power in watts [W]
 *
 * Example:
 *
 *     30 dBm = 1000 mW = 1 W
 */
fun Dbm.toWatt(): Double = toMilliWatt() / 1000.0

fun Volt.toWatt(
    impedance: Ohm
): Watt =
    Watt((value * value) / impedance.value)