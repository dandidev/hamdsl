import io.github.dandidev.hamdsl.dsl.A
import io.github.dandidev.hamdsl.dsl.Ohm
import io.github.dandidev.hamdsl.dsl.V
import io.github.dandidev.hamdsl.dsl.dB
import io.github.dandidev.hamdsl.dsl.dBm
import io.github.dandidev.hamdsl.dsl.mA
import io.github.dandidev.hamdsl.format.UnitFormatter
import io.github.dandidev.hamdsl.units.*
import io.github.dandidev.hamdsl.units.si.asGigaVolt
import io.github.dandidev.hamdsl.units.si.asKiloVolt
import io.github.dandidev.hamdsl.units.si.asMegaVolt
import io.github.dandidev.hamdsl.units.si.asMicroVolt
import io.github.dandidev.hamdsl.units.si.asMilliVolt
import io.github.dandidev.hamdsl.units.si.asNanoVolt
import io.github.dandidev.hamdsl.units.si.asVolt
import io.github.dandidev.hamdsl.units.si.times


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

    val current = 2300.A
    val voltage2 = 0.0003.V
    val resistance = 3.Ohm
    val db = 200.dB
    val dbm = 10.dBm

    println("Current : $current")
    println("Current auto format : ${UnitFormatter.format(current)}")
    println("Voltage : $voltage2")
    println("Voltage auto format : ${UnitFormatter.format(voltage2)}")
    println("Resistance : $resistance")
    println("Resistance auto format : ${UnitFormatter.format(resistance)}")
    println("Db : $db")
    println("Db auto format : ${UnitFormatter.format(db)}")
    println("Dbm : $dbm")
    println("Dbm auto format : ${UnitFormatter.format(dbm)}")

}