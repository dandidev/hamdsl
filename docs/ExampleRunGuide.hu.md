# Példák futtatási útmutató

Ez az útmutató bemutatja a HamDsl használatának két leggyakoribb módját:

1. A HamDsl könyvtár használata saját projektben Maven vagy Gradle segítségével.
2. A mellékelt Kotlin Notebook példák futtatása IntelliJ IDEA vagy JupyterLab használatával.

## HamDsl használata saját projektben

### Követelmények

Győződj meg róla, hogy az alábbi eszközök telepítve vannak:

* Java 21 vagy újabb
* Internetkapcsolat a Maven függőségek letöltéséhez

### Követelmények telepítése

#### Java / JDK

Az aktuálisan telepített verzió ellenőrzése:

```bash
java -version
```

A telepítési útmutató megtalálható az SDKMAN! dokumentációjában:

https://sdkman.io

#### Kotlin

Amennyiben a Kotlin fordítót parancssorból is használni szeretnéd, a telepítési útmutató megtalálható az SDKMAN! dokumentációjában:

https://sdkman.io

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

További példák az alábbi könyvtárakban találhatók:

* `examples` – Kotlin példák
* `examples/notebook` – Kotlin Notebook példák

## Notebook példák futtatása

A HamDsl projekt Kotlin Notebook példákat is tartalmaz, amelyek futtathatók IntelliJ IDEA-ból vagy JupyterLab segítségével.

### Források

Hivatalos dokumentációk:

* Jupyter telepítési útmutató: https://jupyter.org/install
* Kotlin Jupyter kernel: https://github.com/Kotlin/kotlin-jupyter
* IntelliJ IDEA: https://www.jetbrains.com/idea/

### Követelmények

Győződj meg róla, hogy az alábbi eszközök telepítve vannak:

* Java 21 vagy újabb
* Python 3
* Notebook futtatókörnyezet (IntelliJ IDEA vagy JupyterLab)
* Internetkapcsolat a Maven függőségek letöltéséhez

### Követelmények telepítése

#### Java / JDK

Az aktuálisan telepített verzió ellenőrzése:

```bash
java -version
```

A telepítési útmutató megtalálható az SDKMAN! dokumentációjában:

https://sdkman.io

#### Python

Az aktuálisan telepített verzió ellenőrzése:

```bash
python3 --version
```

A Python telepítési útmutatója:

https://www.python.org

#### Notebook futtatókörnyezet

A HamDsl notebook példái az alábbi környezetek egyikében futtathatók:

* IntelliJ IDEA Kotlin Notebook támogatással
* JupyterLab Kotlin Jupyter kernellel

A szükséges eszközök dokumentációja:

* IntelliJ IDEA: https://www.jetbrains.com/idea/
* Jupyter: https://jupyter.org/install
* Kotlin Jupyter: https://github.com/Kotlin/kotlin-jupyter

#### Kotlin

A notebook példák futtatásához külön Kotlin telepítés általában nem szükséges.

A Kotlin Jupyter kernel biztosítja a Kotlin támogatást JupyterLab alatt, az IntelliJ IDEA pedig közvetlenül képes Kotlin notebookok futtatására.

## Példák futtatása IntelliJ IDEA segítségével

A példák kipróbálásának legegyszerűbb módja a HamDsl projekt megnyitása IntelliJ IDEA-ban.

1. Nyisd meg a projektet.
2. Várd meg, amíg a Gradle szinkronizáció befejeződik.
3. Nyiss meg egy fájlt az alábbi könyvtárból:

```text
examples/notebook
```

4. Futtasd a példát közvetlenül az IntelliJ IDEA-ból.

Amennyiben a példákat a HamDsl projekten belül futtatod, nincs szükség további függőség deklarációkra, mivel a példák közvetlenül a projekt forráskódját használják.

## Példák futtatása JupyterLab segítségével

Ha nem szeretnéd a teljes projektet IntelliJ IDEA-ba importálni, a példák JupyterLab és a Kotlin Jupyter kernel segítségével is futtathatók.

### Python virtuális környezet létrehozása

```bash
python3 -m venv venv
```

### A virtuális környezet aktiválása

```bash
source venv/bin/activate
```

### JupyterLab telepítése

```bash
pip install jupyterlab
```

### A Kotlin Jupyter kernel telepítése

```bash
pip install kotlin-jupyter-kernel
```

### JupyterLab indítása

```bash
jupyter lab
```

A JupyterLab ezt követően megnyílik a böngészőben.

### Notebook példa megnyitása

Nyisd meg valamelyik notebookot az alábbi könyvtárból:

```text
examples/notebook
```

Ha a Jupyter rákérdez, válaszd a Kotlin kernelt.

## HamDsl használata Maven Centralból

Önálló notebook esetén használd a következő deklarációt:

```kotlin
@file:DependsOn("io.github.dandidev:hamdsl:0.1.0-beta.1")
```

Ha a notebookot a HamDsl projekten belül futtatod, erre a deklarációra nincs szükség.

## Helyi fejlesztői verzió használata

Ha egy lokálisan publikált verziót szeretnél tesztelni, használd a következő deklarációkat:

```kotlin
@file:Repository("*mavenLocal")
@file:DependsOn("io.github.dandidev:hamdsl:0.1.0-beta.1")
```

A helyi Maven tárolóba történő publikálás az alábbi paranccsal végezhető el:

```bash
./gradlew publishToMavenLocal
```
