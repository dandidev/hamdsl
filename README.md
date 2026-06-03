# HamDsl

Type-safe Kotlin library for amateur radio calculations.

HamDsl started as a personal learning project focused on amateur radio and electronics calculations.

The library provides strongly typed units and reusable formulas while gradually expanding with new calculations and engineering concepts.

## Getting Started

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

### First calculation

```kotlin
val voltage = 13.8.V
val current = 2.A

val power = voltage * current

println(power)
```

Examples are available in:

- `examples` – Kotlin examples
- `examples/notebook` – Kotlin Notebook examples

Examples can be executed directly from IntelliJ IDEA or any environment that supports Kotlin Notebook.

For detailed setup and execution instructions, see:

- [Example Run Guide](docs/ExampleRunGuide.md)

## Features

* SI units
* dB and dBm calculations
* Power, voltage, current and resistance calculations
* Free-space path loss (FSPL)
* Wavelength calculations
* Type-safe operators
* Example calculations

## Project Status

HamDsl is under active development.

The library currently focuses on physical units and engineering calculations used in amateur radio. Additional calculations and utilities will be added over time.

## License

GNU General Public License v3.0 (GPL-3.0)

## Documentation
- 🇬🇧 English: README.md
- 🇭🇺 Magyar: [README.hu.md](README.hu.md)
