package io.github.dandidev.hamdsl.dsl

import io.github.dandidev.hamdsl.SI
import io.github.dandidev.hamdsl.units.log.Db
import io.github.dandidev.hamdsl.units.log.Dbm
import io.github.dandidev.hamdsl.units.si.Ampere
import io.github.dandidev.hamdsl.units.si.Ohm
import io.github.dandidev.hamdsl.units.si.Volt
import io.github.dandidev.hamdsl.units.si.Watt

//Watt
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

// Volt
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

//Ohm
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

//Ampere
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

//dB
val Number.dB get() = Db(toDouble())
val Number.dBm get() = Dbm(toDouble())