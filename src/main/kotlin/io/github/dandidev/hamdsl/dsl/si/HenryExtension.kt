package io.github.dandidev.hamdsl.dsl.si

import io.github.dandidev.hamdsl.constants.SI
import io.github.dandidev.hamdsl.units.si.Henry

val Number.TH get() = Henry(toDouble() * SI.TERA)
val Number.teraHenry get() = Henry(toDouble() * SI.TERA)
val Number.GH get() = Henry(toDouble() * SI.GIGA)
val Number.gigaHenry get() = Henry(toDouble() * SI.GIGA)
@get:JvmName("getShortFormatMegaHenry")
val Number.MH get() = Henry(toDouble() * SI.MEGA)
val Number.megaHenry get() = Henry(toDouble() * SI.MEGA)
val Number.kH get() = Henry(toDouble() * SI.KILO)
val Number.kiloHenry get() = Henry(toDouble() * SI.KILO)
val Number.H get() = Henry(toDouble())
val Number.henry get() = Henry(toDouble())
@get:JvmName("getShortFormatMilliHenry")
val Number.mH get() = Henry(toDouble() * SI.MILLI)
val Number.milliHenry get() = Henry(toDouble() * SI.MILLI)
val Number.uH get() = Henry(toDouble() * SI.MICRO)
val Number.microHenry get() = Henry(toDouble() * SI.MICRO)
val Number.nH get() = Henry(toDouble() * SI.NANO)
val Number.nanoHenry get() = Henry(toDouble() * SI.NANO)
val Number.pH get() = Henry(toDouble() * SI.PICO)
val Number.picoHenry get() = Henry(toDouble() * SI.PICO)
val Number.fH get() = Henry(toDouble() * SI.FEMTO)
val Number.femtoHenry get() = Henry(toDouble() * SI.FEMTO)