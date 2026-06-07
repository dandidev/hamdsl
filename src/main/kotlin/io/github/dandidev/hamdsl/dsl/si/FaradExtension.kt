package io.github.dandidev.hamdsl.dsl.si

import io.github.dandidev.hamdsl.constants.SI
import io.github.dandidev.hamdsl.units.si.Farad

val Number.TF get() = Farad(toDouble() * SI.TERA)
val Number.teraFarad get() = Farad(toDouble() * SI.TERA)
val Number.GF get() = Farad(toDouble() * SI.GIGA)
val Number.gigaFarad get() = Farad(toDouble() * SI.GIGA)
@get:JvmName("getShortFormatMegaFarad")
val Number.MF get() = Farad(toDouble() * SI.MEGA)
val Number.megaFarad get() = Farad(toDouble() * SI.MEGA)
val Number.kF get() = Farad(toDouble() * SI.KILO)
val Number.kiloFarad get() = Farad(toDouble() * SI.KILO)
val Number.F get() = Farad(toDouble())
val Number.farad get() = Farad(toDouble())
@get:JvmName("getShortFormatMilliFarad")
val Number.mF get() = Farad(toDouble() * SI.MILLI)
val Number.milliFarad get() = Farad(toDouble() * SI.MILLI)
val Number.uF get() = Farad(toDouble() * SI.MICRO)
val Number.microFarad get() = Farad(toDouble() * SI.MICRO)
val Number.nF get() = Farad(toDouble() * SI.NANO)
val Number.nanoFarad get() = Farad(toDouble() * SI.NANO)
val Number.pF get() = Farad(toDouble() * SI.PICO)
val Number.picoFarad get() = Farad(toDouble() * SI.PICO)
val Number.fF get() = Farad(toDouble() * SI.FEMTO)
val Number.femtoFarad get() = Farad(toDouble() * SI.FEMTO)