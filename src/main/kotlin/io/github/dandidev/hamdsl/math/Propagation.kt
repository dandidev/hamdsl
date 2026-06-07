package io.github.dandidev.hamdsl.math

import io.github.dandidev.hamdsl.constants.Physics.SPEED_OF_LIGHT
import io.github.dandidev.hamdsl.units.log.Db
import io.github.dandidev.hamdsl.units.si.Hertz
import io.github.dandidev.hamdsl.units.si.Meter
import kotlin.math.PI
import kotlin.math.log10

/**
 * Calculates free-space path loss between an isotropic transmitter and receiver.
 *
 * Mathematical background:
 *
 *     FSPL = 20 × log10((4π × d × f) / c)
 *
 * where:
 *
 *     FSPL = free-space path loss [dB]
 *     d    = distance between transmitter and receiver [m]
 *     f    = frequency [Hz]
 *     c    = speed of light [m/s] (≈ 299,792,458 m/s)
 *
 * The formula assumes:
 *
 * - free-space propagation (no obstacles, reflections, or atmospheric effects)
 * - isotropic antennas at both ends
 * - far-field conditions
 * - distance expressed in meters
 * - frequency expressed in hertz
 *
 * Parameters:
 * - distance.value: distance between transmitter and receiver [m]
 * - frequency.value: operating frequency [Hz]
 *
 * Result:
 * - free-space path loss in decibels [dB]
 *
 * Examples:
 *
 *     2 m at 443 MHz (UHF)
 *
 *         FSPL = 20 × log10((4π × 2 × 443 × 10⁶) / 299,792,458)
 *         FSPL ≈ 39.4 dB
 *
 *     10 km at 14.2 MHz (20m band)
 *
 *         FSPL = 20 × log10((4π × 10,000 × 14.2 × 10⁶) / 299,792,458)
 *         FSPL ≈ 65.5 dB
 *
 * Typical RF usage:
 *
 *     val pathLoss = fspl(2.m, 443.MHz)
 */
fun fspl(
    distance: Meter,
    frequency: Hertz
): Db =
    Db(
        20.0 * log10(
            (4.0 * PI * distance.value * frequency.value) / SPEED_OF_LIGHT
        )
    )

/**
 * Calculates the wavelength for a given frequency.
 *
 * Mathematical background:
 *
 *     λ = c / f
 *
 * where:
 *
 *     λ = wavelength [m]
 *     c = speed of light [m/s]
 *     f = frequency [Hz]
 *
 * Parameters:
 * - this.value: frequency [Hz]
 *
 * Result:
 * - wavelength in meters [m]
 *
 * Example:
 *
 *     f = 145 MHz
 *     λ = 299792458 / 145000000
 *     λ ≈ 2.0675 m
 */
fun Hertz.toWavelength(): Meter =
    Meter(SPEED_OF_LIGHT / value)