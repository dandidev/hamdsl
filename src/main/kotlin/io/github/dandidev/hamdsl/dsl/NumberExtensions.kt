package io.github.dandidev.hamdsl.dsl

import io.github.dandidev.hamdsl.units.Ampere
import io.github.dandidev.hamdsl.units.Db
import io.github.dandidev.hamdsl.units.Dbm
import io.github.dandidev.hamdsl.units.KiloAmpere
import io.github.dandidev.hamdsl.units.KiloOhm
import io.github.dandidev.hamdsl.units.MegaOhm
import io.github.dandidev.hamdsl.units.MicroAmpere
import io.github.dandidev.hamdsl.units.MicroVolt
import io.github.dandidev.hamdsl.units.MicroWatt
import io.github.dandidev.hamdsl.units.MilliAmpere
import io.github.dandidev.hamdsl.units.MilliVolt
import io.github.dandidev.hamdsl.units.MilliWatt
import io.github.dandidev.hamdsl.units.NanoVolt
import io.github.dandidev.hamdsl.units.Ohm
import io.github.dandidev.hamdsl.units.Volt
import io.github.dandidev.hamdsl.units.Watt

//Watt
val Number.W get() = Watt(toDouble())
val Number.Watt get() = Watt(toDouble())
val Number.mW get() = MilliWatt(toDouble())
val Number.milliWatt get() = MilliWatt(toDouble())
val Number.uW get() = MicroWatt(toDouble())
val Number.microWatt get() = MicroWatt(toDouble())

// Volt
val Number.V get() = Volt(toDouble())
val Number.Volt get() = Volt(toDouble())

val Number.mV get() = MilliVolt(toDouble())
val Number.milliVolt get() = MilliVolt(toDouble())

val Number.uV get() = MicroVolt(toDouble())
val Number.microVolt get() = MicroVolt(toDouble())

val Number.nV get() = NanoVolt(toDouble())
val Number.nanoVolt get() = NanoVolt(toDouble())

//Ohm
val Number.Ohm: Ohm
    get() = Ohm(toDouble())

val Number.kOhm: KiloOhm
    get() = KiloOhm(toDouble())

val Number.kiloOhm: KiloOhm
    get() = KiloOhm(toDouble())

val Number.MOhm: MegaOhm
    get() = MegaOhm(toDouble())

val Number.megaOhm: MegaOhm
    get() = MegaOhm(toDouble())

//Ampere
val Number.A get() = Ampere(toDouble())
val Number.ampere get() = Ampere(toDouble())

val Number.mA get() = MilliAmpere(toDouble())
val Number.milliAmpere get() = MilliAmpere(toDouble())

val Number.uA get() = MicroAmpere(toDouble())
val Number.microAmpere get() = MicroAmpere(toDouble())

val Number.kA get() = KiloAmpere(toDouble())
val Number.kiloAmpere get() = KiloAmpere(toDouble())

//dB
val Number.dB get() = Db(toDouble())
val Number.dBm get() = Dbm(toDouble())
