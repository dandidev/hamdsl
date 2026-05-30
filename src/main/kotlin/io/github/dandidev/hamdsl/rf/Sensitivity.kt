package io.github.dandidev.hamdsl.rf

import io.github.dandidev.hamdsl.units.Dbm
import io.github.dandidev.hamdsl.units.Volt
import kotlin.math.log10

/**
 * Converts receiver sensitivity from microvolts to dBm.
 *
 * This is useful because handheld radio datasheets often specify receiver
 * sensitivity as an RF voltage, for example:
 *
 *     0.2 uV @ 12 dB SINAD
 *
 * RF calculations are often easier in dBm, so this method converts the
 * voltage sensitivity into an equivalent RF power level.
 *
 * Mathematical background:
 *
 * Step 1: Convert microvolts to volts.
 *
 *     V[V] = V[uV] * 10^-6
 *
 * Step 2: Convert voltage to power using the RF system impedance.
 *
 *     P[W] = V[V]^2 / R[ohm]
 *
 * Step 3: Convert watts to milliwatts.
 *
 *     P[mW] = P[W] * 1000
 *
 * Step 4: Convert milliwatts to dBm.
 *
 *     P[dBm] = 10 * log10(P[mW])
 *
 * Parameters:
 * - this.value: receiver sensitivity voltage [uV]
 * - impedanceOhm: RF system impedance [ohm], usually 50 ohm
 *
 * Result:
 * - equivalent receiver sensitivity power level [dBm]
 *
 * Example:
 *
 *     V = 0.2 uV
 *     R = 50 ohm
 *
 *     V[V] = 0.2 * 10^-6 = 2.0e-7 V
 *     P[W] = (2.0e-7)^2 / 50
 *     P[W] = 8.0000e-16 W
 *     P[mW] = 8.0000e-13 mW
 *     P[dBm] = 10 * log10(8.0000e-13)
 *     P[dBm] = -120.9691 dBm
 */
fun Volt.toDbm(impedanceOhm: Double = 50.0): Dbm {
    val watt = (value * value) / impedanceOhm
    return Dbm(10.0 * log10(watt * 1000.0))
}
