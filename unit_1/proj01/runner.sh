#!/bin/bash

clear

rm -f *.class

javac -cp .: Proj01.java
java -cp .: Proj01

read -p "Press [Enter] to continue"

rm -f *.class
