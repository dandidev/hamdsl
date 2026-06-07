package io.github.dandidev.hamdsl.dsl.si

import io.github.dandidev.hamdsl.constants.SI
import io.github.dandidev.hamdsl.units.si.Hertz

val Number.THz get() = Hertz(toDouble() * SI.TERA)
val Number.teraHertz get() = Hertz(toDouble() * SI.TERA)
val Number.GHz get() = Hertz(toDouble() * SI.GIGA)
val Number.gigaHertz get() = Hertz(toDouble() * SI.GIGA)
@get:JvmName("getShortFormatMegaHertz")
val Number.MHz get() = Hertz(toDouble() * SI.MEGA)
val Number.megaHertz get() = Hertz(toDouble() * SI.MEGA)
val Number.kHz get() = Hertz(toDouble() * SI.KILO)
val Number.kiloHertz get() = Hertz(toDouble() * SI.KILO)
val Number.Hz get() = Hertz(toDouble())
val Number.hertz get() = Hertz(toDouble())
@get:JvmName("getShortFormatMilliHertz")
val Number.mHz get() = Hertz(toDouble() * SI.MILLI)
val Number.milliHertz get() = Hertz(toDouble() * SI.MILLI)
val Number.uHz get() = Hertz(toDouble() * SI.MICRO)
val Number.microHertz get() = Hertz(toDouble() * SI.MICRO)
val Number.nHz get() = Hertz(toDouble() * SI.NANO)
val Number.nanoHertz get() = Hertz(toDouble() * SI.NANO)
val Number.pHz get() = Hertz(toDouble() * SI.PICO)
val Number.picoHertz get() = Hertz(toDouble() * SI.PICO)
val Number.fHz get() = Hertz(toDouble() * SI.FEMTO)
val Number.femtoHertz get() = Hertz(toDouble() * SI.FEMTO)