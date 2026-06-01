package io.github.dandidev.hamdsl.dsl.si

import io.github.dandidev.hamdsl.constants.SI
import io.github.dandidev.hamdsl.units.si.Meter

val Number.Gm get() = Meter(toDouble() * SI.GIGA)
val Number.gigaMeter get() = Meter(toDouble() * SI.GIGA)
@get:JvmName("getMegaM")
val Number.Mm get() = Meter(toDouble() * SI.MEGA)
val Number.megaMeter get() = Meter(toDouble() * SI.MEGA)
val Number.km get() = Meter(toDouble() * SI.KILO)
val Number.kiloMeter get() = Meter(toDouble() * SI.KILO)
val Number.m get() = Meter(toDouble())
val Number.cm get() = Meter(toDouble() * SI.CENTI)
val Number.Meter get() = Meter(toDouble())
@get:JvmName("getMilliM")
val Number.mm get() = Meter(toDouble() * SI.MILLI)
val Number.milliMeter get() = Meter(toDouble() * SI.MILLI)
val Number.um get() = Meter(toDouble() * SI.MICRO)
val Number.microMeter get() = Meter(toDouble() * SI.MICRO)
val Number.nm get() = Meter(toDouble() * SI.NANO)
val Number.nanoMeter get() = Meter(toDouble() * SI.NANO)