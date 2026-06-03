# Example Run Guide

This guide describes how to run the HamDsl Kotlin Notebook examples with a minimal local Jupyter environment.

## Sources

Official documentation:

* Jupyter installation guide: https://jupyter.org/install
* Kotlin Jupyter kernel: https://github.com/Kotlin/kotlin-jupyter

JupyterLab can be installed with `pip install jupyterlab`, and started with `jupyter lab`. The Kotlin Jupyter kernel can also be installed with pip using `pip install kotlin-jupyter-kernel`.

## Requirements

Make sure the following tools are installed:

* Java 21 or newer
* Python 3
* Internet connection for resolving Maven dependencies

## Running examples in IntelliJ IDEA

The easiest way to explore the examples is to open the HamDsl project in IntelliJ IDEA.

1. Open the project.
2. Wait for Gradle synchronization to finish.
3. Open a file from:

```text
examples/notebook
```

4. Run the example directly from IntelliJ IDEA.

When running examples inside the HamDsl project, no additional dependency declarations are required because the examples use the project sources directly.

## Running examples with JupyterLab

For a lightweight setup without importing the full project into IntelliJ IDEA, the examples can also be executed through JupyterLab using the Kotlin Jupyter kernel.


## Create a Python virtual environment

```bash
python3 -m venv venv
```

## Activate the virtual environment

```bash
source venv/bin/activate
```

## Install JupyterLab

```bash
pip install jupyterlab
```

## Install the Kotlin Jupyter kernel

```bash
pip install kotlin-jupyter-kernel
```

## Start JupyterLab

```bash
jupyter lab
```

JupyterLab will open in the browser.

## Open an example notebook

Open one of the notebooks from:

```text
examples/notebook
```

Select the Kotlin kernel if Jupyter asks for a kernel.

## Using HamDsl from Maven Central

In standalone notebooks, use:

```kotlin
@file:DependsOn("io.github.dandidev:hamdsl:0.1.0-beta.1")
```

When running notebooks inside the HamDsl project, this dependency declaration is not required.

## Local development version

When testing a locally published version, use:

```kotlin
@file:Repository("*mavenLocal")
@file:DependsOn("io.github.dandidev:hamdsl:0.1.0-beta.1")
```

The local artifact can be created with:

```bash
./gradlew publishToMavenLocal
```
