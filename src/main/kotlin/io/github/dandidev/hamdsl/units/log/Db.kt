package io.github.dandidev.hamdsl.units.log

@JvmInline
value class Db(val value: Double)

operator fun Db.plus(db: Db): Db =
    Db(value + db.value)

operator fun Db.minus(db: Db): Db =
    Db(value - db.value)

operator fun Db.plus(power: Dbm): Dbm =
    Dbm(value + power.value)

operator fun Db.minus(power: Dbm): Dbm =
    Dbm(value - power.value)
