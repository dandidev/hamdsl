package io.github.dandidev.hamdsl.dsl.si

import io.github.dandidev.hamdsl.constants.SI
import io.github.dandidev.hamdsl.units.si.Watt

val Number.TW get() = Watt(toDouble() * SI.TERA)
val Number.teraWatt get() = Watt(toDouble() * SI.TERA)
val Number.GW get() = Watt(toDouble() * SI.GIGA)
val Number.gigaWatt get() = Watt(toDouble() * SI.GIGA)
@get:JvmName("getShortFormatMegaWatt")
val Number.MW get() = Watt(toDouble() * SI.MEGA)
val Number.megaWatt get() = Watt(toDouble() * SI.MEGA)
val Number.kW get() = Watt(toDouble() * SI.KILO)
val Number.kiloWatt get() = Watt(toDouble() * SI.KILO)
val Number.W get() = Watt(toDouble())
val Number.watt get() = Watt(toDouble())
@get:JvmName("getShortFormatMilliWatt")
val Number.mW get() = Watt(toDouble() * SI.MILLI)
val Number.milliWatt get() = Watt(toDouble() * SI.MILLI)
val Number.uW get() = Watt(toDouble() * SI.MICRO)
val Number.microWatt get() = Watt(toDouble() * SI.MICRO)
val Number.nW get() = Watt(toDouble() * SI.NANO)
val Number.nanoWatt get() = Watt(toDouble() * SI.NANO)
val Number.pW get() = Watt(toDouble() * SI.PICO)
val Number.picoWatt get() = Watt(toDouble() * SI.PICO)
val Number.fW get() = Watt(toDouble() * SI.FEMTO)
val Number.femtoWatt get() = Watt(toDouble() * SI.FEMTO)