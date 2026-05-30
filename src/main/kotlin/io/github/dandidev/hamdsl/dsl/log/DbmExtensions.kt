package io.github.dandidev.hamdsl.dsl.log

import io.github.dandidev.hamdsl.units.log.Dbm

val Number.dBm get() = Dbm(toDouble())