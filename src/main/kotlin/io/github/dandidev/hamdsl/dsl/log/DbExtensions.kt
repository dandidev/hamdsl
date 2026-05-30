package io.github.dandidev.hamdsl.dsl.log

import io.github.dandidev.hamdsl.units.log.Db

val Number.dB get() = Db(toDouble())