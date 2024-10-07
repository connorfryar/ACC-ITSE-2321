#!/bin/bash
# clearing the screen
clear
# removing all former classes
rm *.class

# compile and run
javac $1.java
java $1 $2

