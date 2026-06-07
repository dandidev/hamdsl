package io.github.dandidev.hamdsl.dsl.si

import io.github.dandidev.hamdsl.constants.SI
import io.github.dandidev.hamdsl.units.si.Henry

val Number.H get() = Henry(toDouble())
val Number.henry get() = Henry(toDouble())
val Number.mH get() = Henry(toDouble() * SI.MILLI)
val Number.milliHenry get() = Henry(toDouble() * SI.MILLI)
val Number.uH get() = Henry(toDouble() * SI.MICRO)
val Number.microHenry get() = Henry(toDouble() * SI.MICRO)
val Number.nH get() = Henry(toDouble() * SI.NANO)
val Number.nanoHenry get() = Henry(toDouble() * SI.NANO)