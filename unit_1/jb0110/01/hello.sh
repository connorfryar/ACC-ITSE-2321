#!/bin/bash

# clear the terminal
clear

rm -f *.class

javac -cp .: helloworld.java
java -cp .: hello 5


read -p "Press [enter] to continue"


