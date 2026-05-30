package io.github.dandidev.hamdsl.math

import io.github.dandidev.hamdsl.units.log.Db
import io.github.dandidev.hamdsl.units.si.Hertz
import io.github.dandidev.hamdsl.units.si.Meter
import kotlin.math.PI
import kotlin.math.log10

private const val SPEED_OF_LIGHT = 299_792_458.0 // m/s

fun fspl(
    distance: Meter,
    frequency: Hertz
): Db =
    Db(
        20.0 * log10(
            (4.0 * PI * distance.value * frequency.value) / SPEED_OF_LIGHT
        )
    )