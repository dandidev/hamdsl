# Példák futtatási útmutató

Ez az útmutató bemutatja, hogyan futtathatók a HamDsl Kotlin Notebook példák egy minimális helyi Jupyter környezetben.

## Források

Hivatalos dokumentációk:

* Jupyter telepítési útmutató: https://jupyter.org/install
* Kotlin Jupyter kernel: https://github.com/Kotlin/kotlin-jupyter

A JupyterLab telepíthető a `pip install jupyterlab` paranccsal, majd a `jupyter lab` paranccsal indítható el. A Kotlin Jupyter kernel a `pip install kotlin-jupyter-kernel` paranccsal telepíthető.

## Követelmények

Győződj meg róla, hogy az alábbi eszközök telepítve vannak:

* Java 21 vagy újabb
* Python 3
* Internetkapcsolat a Maven függőségek letöltéséhez

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

## Python virtuális környezet létrehozása

```bash
python3 -m venv venv
```

## A virtuális környezet aktiválása

```bash
source venv/bin/activate
```

## JupyterLab telepítése

```bash
pip install jupyterlab
```

## A Kotlin Jupyter kernel telepítése

```bash
pip install kotlin-jupyter-kernel
```

## JupyterLab indítása

```bash
jupyter lab
```

A JupyterLab ezt követően megnyílik a böngészőben.

## Notebook példa megnyitása

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
