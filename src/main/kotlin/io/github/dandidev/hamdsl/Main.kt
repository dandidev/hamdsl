import io.github.dandidev.hamdsl.dsl.A
import io.github.dandidev.hamdsl.dsl.Ohm
import io.github.dandidev.hamdsl.dsl.mA
import io.github.dandidev.hamdsl.units.*


fun main() {

    //val voltage = 2.A * 3.4.Ohm
    val voltage = 2.mA * 3.4.Ohm

    println("Auto format: $voltage")

    println("GV :${voltage.asGigaVolt()}")
    println("MV :${voltage.asMegaVolt()}")
    println("kV :${voltage.asKiloVolt()}")
    println("V  :${voltage.asVolt()}")
    println("mV :${voltage.asMilliVolt()}")
    println("uV :${voltage.asMicroVolt()}")
    println("nV :${voltage.asNanoVolt()}")

}