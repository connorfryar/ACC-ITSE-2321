#!/bin/bash
clear 
echo clearing screen
echo
javac $FILENAME.java
java $FILENAME
rm *.class
echo done
