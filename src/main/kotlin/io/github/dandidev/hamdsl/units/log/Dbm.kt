package io.github.dandidev.hamdsl.units.log

@JvmInline
value class Dbm(val value: Double)

operator fun Dbm.minus(other: Dbm): Db =
    Db(value - other.value)

operator fun Dbm.plus(gain: Db): Dbm =
    Dbm(value + gain.value)

operator fun Dbm.minus(gain: Db): Dbm =
    Dbm(value - gain.value)
