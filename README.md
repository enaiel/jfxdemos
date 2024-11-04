# JFXDemos

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

A collection of demos for JavaFX. These demos showcase some of the best open source 
third-party libraries available for JavaFX
that can run on Java 11 and JavaFX 17. 
The demos can be built as a modular application, a custom moular runtime with JLink, a non-modular fat executable jar, 
or as a non-modular native application using GraalVM Native Image.

## Demos

| Demo Name               | Library                                                                         | License    | Description                                                                                       |
|-------------------------|---------------------------------------------------------------------------------|------------|---------------------------------------------------------------------------------------------------|
| animatefx-demo          | [AnimateFX](https://github.com/Typhon0/AnimateFX)                               | Apache-2.0 | A library of +70 ready-to-use animations for JavaFX                                               |
| calendarfx-demo         | [CalendarFX](https://github.com/dlsc-software-consulting-gmbh/CalendarFX/)      | Apache-2.0 | A Java framework for creating sophisticated calendar views                                        |
| charts-demo             | [Charts](https://github.com/HanSolo/charts)                                     | Apache-2.0 | A JavaFX library that contains different kind of charts                                           |
| controlsfx-demo         | [ControlsFX](https://github.com/controlsfx/controlsfx)                          | BSD | High quality UI controls to complement the core JavaFX distribution                               |
| desktoppanefx-demo      | [DesktopPaneFX](https://github.com/kordamp/desktoppanefx)                       | Apache-2.0 | MDI components for JavaFX                                                                         |
| formsfx-demo            | [FormsFX](https://github.com/dlsc-software-consulting-gmbh/FormsFX)             | Apache-2.0 | A framework for easily creating forms for a JavaFX UI                                             |
| fx-borderlessscene-demo | [FX-BorderlessScene](https://github.com/brett-smith/FX-BorderlessScene)  | Apache-2.0 | Undecorated JavaFX Scene with move, resize, minimise, maximise, and close controls                |
| gemsfx-demo             | [GemsFX](https://github.com/dlsc-software-consulting-gmbh/GemsFX)               | Apache-2.0 | A collection of JavaFX controls and utilities                                                     |
| ikonli-demo             | [Ikonli](https://github.com/kordamp/ikonli)                                     | Apache-2.0 | Icon packs for Java applications                                                                  |
| jmetro-demo             | [JMetro](https://github.com/JFXtras/jfxtras-styles)                             | Apache-2.0 | A theme / look and feel for JavaFX inspired  by Microsoft's Fluent Design                         |
| medusa-demo             | [Medusa](https://github.com/HanSolo/medusa)                                     | Apache-2.0 | A JavaFX library for Gauges                                                                       |
| miglayout-demo          | [MigLayout](https://github.com/mikaelgrev/miglayout)                            | BSD | Layout Manager for Swing, SWT and JavaFX                                                          |
| pdfviewfx-demo          | [PDFViewFX](https://github.com/dlsc-software-consulting-gmbh/PDFViewFX)         | Apache-2.0 | A PDF view for JavaFX applications                                                                |
| preferencesfx-demo      | [PreferencesFX](https://github.com/dlsc-software-consulting-gmbh/PreferencesFX) | Apache-2.0 | A framework for easily creating a UI for application settings / preferences                       |
| richtextfx-demo         | [RichTextFX](https://github.com/FXMisc/RichTextFX)                              | BSD | Rich-text area for JavaFX                                                                         |
| systemtray-demo         | [SystemTray](https://github.com/dorkbox/SystemTray)                             | Apache-2.0 | Cross-platform SystemTray                                                                         |
| tilesfx-demo            | [TilesFX](https://github.com/HanSolo/tilesfx)                                   | Apache-2.0 | A JavaFX library containing tiles that can be used for dashboards                                 |
| tiwulfx-dock-demo       | [TiwulFX-Dock](https://github.com/panemu/tiwulfx-dock)                          | MIT | TiwulFX-Dock provides enhanced JavaFX TabPane that supports tab reordering, detaching and docking |
| undofx-demo             | [UndoFX](https://github.com/FXMisc/UndoFX)                                      | BSD | Undo manager for JavaFX                                                                           |
| workbenchfx-demo        | [WorkbenchFX](https://github.com/dlsc-software-consulting-gmbh/WorkbenchFX)     | Apache-2.0 | A lightweight RCP framework for JavaFX applications                                               |

##  Prerequisites
### Java Compiler
  * [OpenJDK 11+](https://jdk.java.net/archive/)
  * [GraalVM for Java 11+ version 22+](https://github.com/graalvm/graalvm-ce-builds/releases)
    (Need set your GRAALVM_HOME and add the Graalvm 'lib' folder to your LD_LIBRARY_PATH) 
### Build Tools 
  * [Maven 3.5.0+](https://maven.apache.org/download.cgi)
  * [Gradle 6.0.0+](https://gradle.org/install/)
### Compiler Toolchain
  * Linux GCC Toolchain
~~~
sudo apt-get install build-essential libz-dev libgtk-3-dev libxtst-dev libavcodec-dev libavformat-dev libavutil-dev
~~~
  * VC++ Build Tools Workload for VS2017
~~~
choco install visualstudio2017-workload-vctools
call "C:\Program Files (x86)\Microsoft Visual Studio\2017\Community\VC\Auxiliary\Build\vcvars64.bat"
~~~
  * macOS: Xcode Command Line Tools
~~~
xcode-select --install
~~~

## Using Maven

### Build Demo as Modular JavaFX Application
```
mvn -pl <demo name> -Popenjfx clean compile package
```
### Run Demo as Modular JavaFX Application
```
mvn -pl <demo name> -Popenjfx javafx:run
```
### Build Demo as JLink JavaFX Runtime
```
mvn -pl <demo name> -Popenjfx javafx:jlink
```
### Run Demo as JLink JavaFX Runtime
```
mvn -pl <demo name> -Popenjfx exec:exec@run-jlink
OR
<demo name>/target/<demo name>/bin/<demo name>
OR
<demo name>/target/<demo name>/bin/java -m com.micronarts.jfxdemos/com.micronarts.jfxdemos.DemoLauncher
```
### Build Demo as Modular Application
```
mvn -pl <demo name> -Pjpms clean compile package
```
### Run Demo as Modular Application
```
mvn -pl <demo name> -Pjpms exec:exec@run-jpms
OR
java @<demo name>/target/modulepath -m com.micronarts.jfxdemos/com.micronarts.jfxdemos.DemoLauncher
```
### Build Demo as Executable Fat Jar
```
mvn -pl <demo name> -Pfatjar clean compile package
```
### Run Demo as Executable Fat Jar
```
mvn -pl <demo name> -Pfatjar exec:exec@run-fatjar
OR
java -jar <demo name>/target/<demo name>-1.0.0-SNAPSHOT-jar-all.jar
```
### Run Demo with Native Tracing Agent
```
mvn -pl <demo name> -Pnative -Dagent=true clean compile exec:exec@java-agent
```
### Build Demo as Native Application
```
mvn -pl <demo name> -Pnative -Dagent=true package
```
### Run Demo as Native Application
```
mvn -pl <demo name> -Pnative exec:exec@run-native
OR
<demo name>/target/<demo name>
```

## Using Gradle

### Build Demo as Modular JavaFX Application
```
./gradlew <demo name>:clean <demo name>:compileJava <demo name>:build 
```
### Run Demo as Modular JavaFX Application
```
./gradlew <demo name>:run
```
### Build Demo as JLink JavaFX Runtime
```
./gradlew <demo name>:jlink
```
### Run Demo as JLink JavaFX Runtime
```
./gradlew <demo name>:runJlink
OR
<demo name>/build/image/bin/<demo name>
OR
<demo name>/build/image/bin/java -m com.micronarts.jfxdemos/com.micronarts.jfxdemos.DemoLauncher
```
### Build Demo as Modular Application
```
./gradlew <demo name>:build 
```
### Run Demo as Modular Application
```
./gradlew <demo name>:runJPMS
```
### Build Demo as Executable Fat Jar
```
./gradlew <demo name>:shadowJar 
```
### Run Demo as Executable Fat Jar
```
./gradlew <demo name>:runFatJar
OR
java -jar <demo name>/build/libs/<demo name>-1.0.0-SNAPSHOT-all.jar
```
### Run Demo with Native Tracing Agent
```
./gradlew <demo name>:runAgent -Pagent
```
### Build Demo as Native Application
```
./gradlew <demo name>:nativeCompile -Pagent
```
### Run Demo as Native Application
```
./gradlew <demo name>:runNative
OR
<demo name>/build/native/nativeCompile/<demo name>
```