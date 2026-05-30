import io.github.dandidev.hamdsl.dsl.A
import io.github.dandidev.hamdsl.dsl.W
import io.github.dandidev.hamdsl.dsl.dB
import io.github.dandidev.hamdsl.dsl.Ohm
import io.github.dandidev.hamdsl.dsl.uV
import io.github.dandidev.hamdsl.math.minus
import io.github.dandidev.hamdsl.math.plus
import io.github.dandidev.hamdsl.math.toDbm
import io.github.dandidev.hamdsl.math.toWatt
import io.github.dandidev.hamdsl.units.times
import io.github.dandidev.hamdsl.units.toMilliVolt
import io.github.dandidev.hamdsl.units.toVolt


fun main() {


    val voltage = 2.A * 3.Ohm
    voltage.toMilliVolt()

// Transmitter power
    val tx = 5.W.toDbm()

// Attenuator chain
    val attenuation =
        20.dB +
                20.dB +
                20.dB +
                20.dB +
                20.dB


// Received power
    val rx = tx - attenuation


// Baofeng sensitivity
    val minSensitivity =
        0.2.uV
            .toVolt()
            .toWatt(50.Ohm)
            .toDbm()


    val requiredAttenuation =
        tx.value - minSensitivity.value

    println("Tx dBm: $tx")
    println("Attenuator chain: $attenuation")
    println("Rx power: $rx")
    println("Min radio sensitivity: $minSensitivity")
    println("Required attenuation: $requiredAttenuation dB")
}