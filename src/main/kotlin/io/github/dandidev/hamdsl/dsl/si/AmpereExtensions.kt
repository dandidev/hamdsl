package io.github.dandidev.hamdsl.dsl.si

import io.github.dandidev.hamdsl.SI
import io.github.dandidev.hamdsl.units.si.Ampere

val Number.GA get() = Ampere(toDouble() * SI.GIGA)
val Number.gigaAmpere get() = Ampere(toDouble() * SI.GIGA)
@get:JvmName("getMegaA")
val Number.MA get() = Ampere(toDouble() * SI.MEGA)
val Number.megaAmpere get() = Ampere(toDouble() * SI.MEGA)
val Number.kA get() = Ampere(toDouble() * SI.KILO)
val Number.kiloAmpere get() = Ampere(toDouble() * SI.KILO)
val Number.A get() = Ampere(toDouble())
val Number.Ampere get() = Ampere(toDouble())
@get:JvmName("getMilliA")
val Number.mA get() = Ampere(toDouble() * SI.MILLI)
val Number.milliAmpere get() = Ampere(toDouble() * SI.MILLI)
val Number.uA get() = Ampere(toDouble() * SI.MICRO)
val Number.microAmpere get() = Ampere(toDouble() * SI.MICRO)
val Number.nA get() = Ampere(toDouble() * SI.NANO)
val Number.nanoAmpere get() = Ampere(toDouble() * SI.NANO)