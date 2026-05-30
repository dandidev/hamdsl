package io.github.dandidev.hamdsl.dsl.si

import io.github.dandidev.hamdsl.SI
import io.github.dandidev.hamdsl.units.si.Watt

val Number.GW get() = Watt(toDouble() * SI.GIGA)
val Number.gigaWatt get() = Watt(toDouble() * SI.GIGA)
@get:JvmName("getMegaW")
val Number.MW get() = Watt(toDouble() * SI.MEGA)
val Number.megaWatt get() = Watt(toDouble() * SI.MEGA)
val Number.kW get() = Watt(toDouble() * SI.KILO)
val Number.kiloWatt get() = Watt(toDouble() * SI.KILO)
val Number.W get() = Watt(toDouble())
val Number.Watt get() = Watt(toDouble())
@get:JvmName("getMilliW")
val Number.mW get() = Watt(toDouble() * SI.MILLI)
val Number.milliWatt get() = Watt(toDouble() * SI.MILLI)
val Number.uWatt get() = Watt(toDouble() * SI.MICRO)
val Number.microWatt get() = Watt(toDouble() * SI.MICRO)
val Number.nW get() = Watt(toDouble() * SI.NANO)
val Number.nanoWatt get() = Watt(toDouble() * SI.NANO)