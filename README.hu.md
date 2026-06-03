# HamDsl

Típusbiztos Kotlin könyvtár rádióamatőr számításokhoz.

A HamDsl eredetileg egy személyes tanulási projektként indult, amely rádióamatőr és elektronikai számításokra fókuszál.

A könyvtár erősen típusos mértékegységeket és újrafelhasználható képleteket biztosít, miközben fokozatosan bővül új számításokkal és mérnöki fogalmakkal.

## Első lépések

### Gradle

```kotlin
dependencies {
    implementation("io.github.dandidev:hamdsl:0.1.0-beta.1")
}
```

### Maven

```xml
<dependency>
    <groupId>io.github.dandidev</groupId>
    <artifactId>hamdsl</artifactId>
    <version>0.1.0-beta.1</version>
</dependency>
```

### Első számítás

```kotlin
val voltage = 13.8.V
val current = 2.A

val power = voltage * current

println(power)
```

Példák az alábbi könyvtárakban találhatók:

* `examples` – Kotlin példák
* `examples/notebook` – Kotlin Notebook példák

A példák közvetlenül futtathatók IntelliJ IDEA-ból vagy bármely olyan környezetből, amely támogatja a Kotlin Notebookot.

A részletes telepítési és futtatási útmutató itt található:

* [Példák futtatási útmutató](docs/ExampleRunGuide.hu.md)

## Funkciók

* SI mértékegységek
* dB és dBm számítások
* Teljesítmény-, feszültség-, áram- és ellenállás-számítások
* Szabadtéri terjedési csillapítás (FSPL)
* Hullámhossz-számítások
* Típusbiztos operátorok
* Példaszámítások

## Projekt állapota

A HamDsl aktív fejlesztés alatt áll.

A könyvtár jelenleg a rádióamatőr tevékenységben használt fizikai mértékegységekre és mérnöki számításokra összpontosít. Idővel további számításokkal és segédeszközökkel fog bővülni.

## Licenc

GNU General Public License v3.0 (GPL-3.0)

## Dokumentáció

* 🇬🇧 English: [README.md](README.md)
* 🇭🇺 Magyar: README.hu.md
