package io.github.dandidev.hamdsl.dsl.si

import io.github.dandidev.hamdsl.SI
import io.github.dandidev.hamdsl.units.si.Volt

val Number.GV get() = Volt(toDouble() * SI.GIGA)
val Number.gigaVolt get() = Volt(toDouble() * SI.GIGA)
@get:JvmName("getMegaV")
val Number.MV get() = Volt(toDouble() * SI.MEGA)
val Number.megaVolt get() = Volt(toDouble() * SI.MEGA)
val Number.kV get() = Volt(toDouble() * SI.KILO)
val Number.kiloVolt get() = Volt(toDouble() * SI.KILO)
val Number.V get() = Volt(toDouble())
val Number.Volt get() = Volt(toDouble())
@get:JvmName("getMilliV")
val Number.mV get() = Volt(toDouble() * SI.MILLI)
val Number.milliVolt get() = Volt(toDouble() * SI.MILLI)
val Number.uV get() = Volt(toDouble() * SI.MICRO)
val Number.microVolt get() = Volt(toDouble() * SI.MICRO)
val Number.nV get() = Volt(toDouble() * SI.NANO)
val Number.nanoVolt get() = Volt(toDouble() * SI.NANO)