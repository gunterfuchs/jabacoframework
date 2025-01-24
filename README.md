# README #

### What is this repository for? ###

This repository is for attempting to revive the Jabaco Framework, see https://sourceforge.net/projects/jabacoframework/ .
The version of the start code base is 1.5.2.

### How does the Jabaco Framework Architecture look like? ###

The Framework consists mainly of three parts, 
* a native call library nativecall-0.6.0.jar in folder nativecall-0.4.1,
* Java / VB source files with the extension jsrc in folder Framework\src\VB,
* and Java source files in folder Framework\src\VBA.

Although the Framework is open source, Jabaco.exe is not. Jabaco.exe is used to build the Framework\VB\\*.jsrc part
and to build any applications written in VB6. Therefore one cannot add or modify any VB6 keywords, for example "Declare".

I encountered several challenges building this framework which I tracked in my work log file notes.txt.

### How do I get set up? ###

* Summary of set up
    * Import the Eclipse 09/2024 project (.project) located in the root folder.
    * Modify build.xml towards your Windows folder tree.

* Configuration
	* Build with jdk-7. Ant file is <root folder>\Framework\build.xml.

* Dependencies
    * Obtain jdk7 from https://www.oracle.com/java/technologies/downloads/archive/ .
    * You have to create an account with Oracle.
    * Or download it without registration from https://jdk.java.net/java-se-ri/7 .
    * NativeCall.dll from https://johannburkard.de/software/nativecall/ .
      You don't need to rebuild this dll which resides in the nativecall-0.4.1 folder.
	  (I did not rename this folder although I named the jar file nativecall-0.6.0.jar
	  to distinguish it from the original version which was built with java version 1.4.
	  The string "0.6.0" is misleading since I ended up using Java 1.7 to build this library.)

    * Jabaco installation:
        * To install Jabaco, download it from https://www.jabaco.org/download.html.
        * During installation you are asked to enter an installation key. Just press the Later button.

* How to run tests
    * The framework does not contain test modules but you can copy the built jabaco.jar to the
	  Jabaco installation folder and compile and run (shortcut F6) the examples in the Samples folder.
    * The sub-project nativecall-0.4.1 does contain tests but I have not yet tried running the tests.

* Deployment instructions
    * The ant build generates a jabaco.jar file in the <root folder>\Framework\bin folder.
    * Copy this file into the Jabaco installation folder.

### Contribution guidelines ###

I had started this work in the hope that I can build and run a data acquisition application that I
had written in VB6 but decided to port it to Java when Microsoft dropped the ball on VB6. I had to realize that
Jabaco.exe cannot build my application because it does not understand the VB6 keyword "Declare".
But with the fixes I introduced it can build and run the applications in the Samples folder using Java 1.7.


### Who do I talk to? ###

contact gfuchs@acousticmicroscopy.com