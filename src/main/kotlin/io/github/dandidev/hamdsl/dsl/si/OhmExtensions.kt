package io.github.dandidev.hamdsl.dsl.si

import io.github.dandidev.hamdsl.constants.SI
import io.github.dandidev.hamdsl.units.si.Ohm

val Number.GOhm get() = Ohm(toDouble() * SI.GIGA)
val Number.gigaOhm get() = Ohm(toDouble() * SI.GIGA)
@get:JvmName("getMegaO")
val Number.MOhm get() = Ohm(toDouble() * SI.MEGA)
val Number.megaOhm get() = Ohm(toDouble() * SI.MEGA)
val Number.kOhm get() = Ohm(toDouble() * SI.KILO)
val Number.kiloOhm get() = Ohm(toDouble() * SI.KILO)
val Number.Ohm get() = Ohm(toDouble())
@get:JvmName("getMilliO")
val Number.mOhm get() = Ohm(toDouble() * SI.MILLI)
val Number.milliOhm get() = Ohm(toDouble() * SI.MILLI)
val Number.uOhm get() = Ohm(toDouble() * SI.MICRO)
val Number.microOhm get() = Ohm(toDouble() * SI.MICRO)
val Number.nOhm get() = Ohm(toDouble() * SI.NANO)
val Number.nanoOhm get() = Ohm(toDouble() * SI.NANO)