package io.github.dandidev.hamdsl.math

import io.github.dandidev.hamdsl.constants.Physics.SPEED_OF_LIGHT
import io.github.dandidev.hamdsl.units.log.Db
import io.github.dandidev.hamdsl.units.si.Hertz
import io.github.dandidev.hamdsl.units.si.Meter
import kotlin.math.PI
import kotlin.math.log10

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