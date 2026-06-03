# Example Run Guide

This guide describes the two most common ways to use HamDsl:

1. Using the HamDsl library in your own project with Maven or Gradle.
2. Running the included Kotlin Notebook examples using IntelliJ IDEA or JupyterLab.

## Using HamDsl in Your Own Project

### Requirements

Make sure the following tools are installed:

* Java 21 or newer
* Internet connection for resolving Maven dependencies

### Installing Requirements

#### Java / JDK

Verify the installed version:

```bash
java -version
```

Installation instructions are available in the SDKMAN! documentation:

https://sdkman.io

#### Kotlin

If you want to use Kotlin from the command line, installation instructions are available in the SDKMAN! documentation:

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

### First Calculation

```kotlin
val voltage = 13.8.V
val current = 2.A

val power = voltage * current

println(power)
```

Additional examples are available in:

* `examples` – Kotlin examples
* `examples/notebook` – Kotlin Notebook examples

## Running Notebook Examples

The HamDsl project also includes Kotlin Notebook examples that can be executed using IntelliJ IDEA or JupyterLab.

### Sources

Official documentation:

* Jupyter installation guide: https://jupyter.org/install
* Kotlin Jupyter kernel: https://github.com/Kotlin/kotlin-jupyter
* IntelliJ IDEA: https://www.jetbrains.com/idea/

### Requirements

Make sure the following tools are installed:

* Java 21 or newer
* Python 3
* Notebook runtime environment (IntelliJ IDEA or JupyterLab)
* Internet connection for resolving Maven dependencies

### Installing Requirements

#### Java / JDK

Verify the installed version:

```bash
java -version
```

Installation instructions are available in the SDKMAN! documentation:

https://sdkman.io

#### Python

Verify the installed version:

```bash
python3 --version
```

Python installation instructions are available at:

https://www.python.org

#### Notebook Runtime Environment

HamDsl notebook examples can be executed using one of the following environments:

* IntelliJ IDEA with Kotlin Notebook support
* JupyterLab with the Kotlin Jupyter kernel

Documentation for the required tools:

* IntelliJ IDEA: https://www.jetbrains.com/idea/
* Jupyter: https://jupyter.org/install
* Kotlin Jupyter: https://github.com/Kotlin/kotlin-jupyter

#### Kotlin

A separate Kotlin installation is usually not required for running notebook examples.

The Kotlin Jupyter kernel provides Kotlin support inside JupyterLab, and IntelliJ IDEA can execute Kotlin notebooks directly.

## Running Examples with IntelliJ IDEA

The easiest way to explore the examples is to open the HamDsl project in IntelliJ IDEA.

1. Open the project.
2. Wait for Gradle synchronization to finish.
3. Open a file from the following directory:

```text
examples/notebook
```

4. Run the example directly from IntelliJ IDEA.

When running examples inside the HamDsl project, no additional dependency declarations are required because the examples use the project sources directly.

## Running Examples with JupyterLab

If you do not want to import the entire project into IntelliJ IDEA, the examples can also be executed using JupyterLab and the Kotlin Jupyter kernel.

### Create a Python Virtual Environment

```bash
python3 -m venv venv
```

### Activate the Virtual Environment

```bash
source venv/bin/activate
```

### Install JupyterLab

```bash
pip install jupyterlab
```

### Install the Kotlin Jupyter Kernel

```bash
pip install kotlin-jupyter-kernel
```

### Start JupyterLab

```bash
jupyter lab
```

JupyterLab will open in your browser.

### Open a Notebook Example

Open one of the notebooks from the following directory:

```text
examples/notebook
```

If Jupyter asks for a kernel, select the Kotlin kernel.

## Using HamDsl from Maven Central

For standalone notebooks, use the following declaration:

```kotlin
@file:DependsOn("io.github.dandidev:hamdsl:0.1.0-beta.1")
```

When running notebooks inside the HamDsl project, this declaration is not required.

## Using a Local Development Version

If you want to test a locally published version, use the following declarations:

```kotlin
@file:Repository("*mavenLocal")
@file:DependsOn("io.github.dandidev:hamdsl:0.1.0-beta.1")
```

The local artifact can be published to Maven Local using:

```bash
./gradlew publishToMavenLocal
```
