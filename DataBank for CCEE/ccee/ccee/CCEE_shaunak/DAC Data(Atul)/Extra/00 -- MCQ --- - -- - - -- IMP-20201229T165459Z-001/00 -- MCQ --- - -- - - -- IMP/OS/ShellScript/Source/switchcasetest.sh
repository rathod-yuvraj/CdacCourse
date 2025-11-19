#!/bin/bash

result=0

echo "1. Addition (Aa)
2. Subtraction (Ss)
3. Division (Dd)
4. Multiplication (Mm)
5. Quit (Qq)"

read -p "Enter two integers: " first second
read -p "Enter option: " option

case $option in
[Aa]|1) result=$[first + second];;
[Ss]|2) result=$[first - second];;
[Dd]|3) result=$[first / second];;
[Mm]|4) result=$[first * second];;
[Qq]|5) exit 1;;
*) echo "Invalid option";
   exit 2;;
esac

echo "Result = $result"

exit 0













