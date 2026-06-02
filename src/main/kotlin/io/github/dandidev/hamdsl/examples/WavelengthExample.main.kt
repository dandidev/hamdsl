package io.github.dandidev.hamdsl.examples

import io.github.dandidev.hamdsl.dsl.si.MHz
import io.github.dandidev.hamdsl.format.UnitFormatter
import io.github.dandidev.hamdsl.math.toWavelength

fun main() {
    val band80m = 3.5.MHz
    val band40m = 7.0.MHz
    val band20m = 14.0.MHz
    val band10m = 28.0.MHz
    val band2m = 145.0.MHz
    val band70cm = 433.0.MHz

    val result = """
        80m Band (3.5 MHz)
        Wavelength : ${UnitFormatter.format(band80m.toWavelength())}
        
        40m Band (7 MHz)
        Wavelength : ${UnitFormatter.format(band40m.toWavelength())}
        
        20m Band (14 MHz)
        Wavelength : ${UnitFormatter.format(band20m.toWavelength())}
        
        10m Band (28 MHz)
        Wavelength : ${UnitFormatter.format(band10m.toWavelength())}
        
        2m Band (145 MHz)
        Wavelength : ${UnitFormatter.format(band2m.toWavelength())}
        
        70cm Band (433 MHz)
        Wavelength : ${UnitFormatter.format(band70cm.toWavelength())}
        """.trimIndent()

    println(result)
}