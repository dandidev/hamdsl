package io.github.dandidev.hamdsl.dsl.si

import io.github.dandidev.hamdsl.constants.SI
import io.github.dandidev.hamdsl.units.si.Farad

val Number.F get() = Farad(toDouble())
val Number.farad get() = Farad(toDouble())
val Number.mF get() = Farad(toDouble() * SI.MILLI)
val Number.milliFarad get() = Farad(toDouble() * SI.MILLI)
val Number.uF get() = Farad(toDouble() * SI.MICRO)
val Number.microFarad get() = Farad(toDouble() * SI.MICRO)
val Number.nF get() = Farad(toDouble() * SI.NANO)
val Number.nanoFarad get() = Farad(toDouble() * SI.NANO)
val Number.pF get() = Farad(toDouble() * SI.PICO)
val Number.picoFarad get() = Farad(toDouble() * SI.PICO)