package io.github.dandidev.hamdsl.units

@JvmInline
value class Dbm(val value: Double) {
    override fun toString(): String =
        "%.4f dBm".format(value)
}
