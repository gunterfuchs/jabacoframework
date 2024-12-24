# README #

This README would normally document whatever steps are necessary to get your application up and running.

### What is this repository for? ###

This repository is for attempting to revive the Jabaco Framework, see https://sourceforge.net/projects/jabacoframework/ .
The version of the start code base is 1.5.2.


### How do I get set up? ###

* Summary of set up
	* Import the Eclipse 12/2023 project (.project) located in the root folder.

* Configuration
	* Build with jdk-6. Ant file is <root folder>\Framework\build.xml.

* Dependencies
	* Obtain jdk6 from https://www.oracle.com/java/technologies/downloads/archive/.
	* You have to create an account with Oracle.

	* Jabaco installation:
		* To install Jabaco, download it from https://www.jabaco.org/download.html.
		* During installation you are asked to enter an installation key. Just press the Later button.

* How to run tests
	* The framework does not contain test modules.
	* The sub-project nativecall-0.4.1 does contain tests but I have not yet tried running the tests.

* Deployment instructions
	* The ant build generates a jabaco.jar file in the <root folder>\Framework\bin folder.
	* Copy this file into the Jabaco installation folder.

### Contribution guidelines ###
Fix the error message(s) when building and running the Jabaco projects (*.jba) 
located in the <root folder>\Samples folder
(which is a copy from the Jabaco installation folder) from the Jabaco IDE (shortcut key F6).
For more info refer to <root folder>\notes.txt.


### Who do I talk to? ###

* contact
gfuchs@acousticmicroscopy.com