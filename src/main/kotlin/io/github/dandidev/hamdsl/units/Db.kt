package io.github.dandidev.hamdsl.units

@JvmInline
value class Db(val value: Double) {
    override fun toString(): String =
        "%.4f dB".format(value)
}
