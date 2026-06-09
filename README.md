# HamDSL

A type-safe Kotlin DSL for amateur radio calculations.

```kotlin
// Reactance
val xc = capacitiveReactance(7.1.MHz, 100.pF)
val xl = inductiveReactance(7.1.MHz, 10.uH)

// Ohm's law
val voltage = 13.8.V
val current = 2.A
val resistance = voltage / current

// Attenuator chain
val attenuators = 30.dB + 20.dB + 10.dB

// Free-space path loss
val pathLoss = fspl(10.km, 443.MHz)
val linkMargin = 37.dBm - attenuators - pathLoss
```

## What's Included

| Topic | Calculations |
|-------|-------------|
| Power | `P = U × I`, `P = U² / R`, `P = I² × R`, `Watt ↔ dBm` |
| Ohm's Law | `U = I × R`, `I = U / R`, `R = U / I` |
| Reactance | Capacitive `XC`, Inductive `XL` |
| LC Resonance | Resonant frequency, required `L`, required `C` |
| Propagation | Free-space path loss, wavelength |

All calculations use `Double` precision floating-point arithmetic (IEEE 754), accurate to approximately 15–16 significant digits.

More calculations are added with each release.

## Dependency

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

## Build from Source

Clone the `develop` branch and build locally:

```bash
git clone -b develop https://github.com/dandidev/hamdsl.git
cd hamdsl
./gradlew build
```

On Windows:

```bash
gradlew.bat build
```

To use the locally built version in your own project:

```bash
./gradlew publishToMavenLocal
```

<details>
<summary>Prerequisites — Java, Kotlin, Gradle</summary>

### Java

Verify if Java is already installed:

```bash
java -version
```

Java 21 or newer is required. Install via SDKMAN!:

```bash
curl -s "https://get.sdkman.io" | bash
sdk install java
```

Official documentation: https://sdkman.io

### Kotlin

Verify if Kotlin is already installed:

```bash
kotlin -version
```

Install via SDKMAN!:

```bash
sdk install kotlin
```

Official documentation: https://kotlinlang.org/docs/getting-started.html

### Gradle

Verify if Gradle is already installed:

```bash
gradle -version
```

Install via SDKMAN!:

```bash
sdk install gradle
```

Official documentation: https://gradle.org/install/

</details>

## Run a Notebook Example

### Requirements

- Python 3 — https://www.python.org/downloads/
- Java 21 or newer — see Prerequisites section below

### Linux / macOS

```bash
python3 -m venv venv
source venv/bin/activate
pip install jupyterlab
pip install kotlin-jupyter-kernel
jupyter lab
```

### Windows

```bash
python3 -m venv venv
venv\Scripts\activate
pip install jupyterlab
pip install kotlin-jupyter-kernel
jupyter lab
```

JupyterLab will open in your browser. Navigate to:

```text
src/main/kotlin/io/github/dandidev/hamdsl/examples/notebook
```

Open any `.ipynb` file and select the **Kotlin** kernel when prompted.

### Using HamDSL from Maven Central in a Standalone Notebook

```kotlin
@file:DependsOn("io.github.dandidev:hamdsl:0.1.0-beta.1")
```

### Using a Local Development Version

```kotlin
@file:Repository("*mavenLocal")
@file:DependsOn("io.github.dandidev:hamdsl:0.1.0-beta.1")
```

## Using HamDSL in Kotlin

Import the DSL extensions and math functions:

```kotlin
import io.github.dandidev.hamdsl.dsl.si.*
import io.github.dandidev.hamdsl.dsl.log.*
import io.github.dandidev.hamdsl.math.*

fun main() {
    // Ohm's law
    val voltage = 13.8.V
    val current = 2.A
    val resistance = voltage / current

    // Reactance
    val xc = capacitiveReactance(7.1.MHz, 100.pF)
    val xl = inductiveReactance(7.1.MHz, 10.uH)

    // LC resonance
    val frequency = resonantFrequency(10.uH, 100.pF)

    // Power
    val power = voltage.toWatt(current)
    val level = power.toDbm()

    // Free-space path loss
    val attenuators = 30.dB + 20.dB + 10.dB
    val pathLoss = fspl(10.km, 443.MHz)
    val linkMargin = 37.dBm - attenuators - pathLoss

    println(UnitFormatter.format(resistance))
    println(UnitFormatter.format(xc))
    println(UnitFormatter.format(level))
    println(UnitFormatter.format(linkMargin))
}
```

More examples are available in:

- `src/main/kotlin/io/github/dandidev/hamdsl/examples` — Kotlin examples
- `src/main/kotlin/io/github/dandidev/hamdsl/examples/notebook` — Kotlin Notebook examples