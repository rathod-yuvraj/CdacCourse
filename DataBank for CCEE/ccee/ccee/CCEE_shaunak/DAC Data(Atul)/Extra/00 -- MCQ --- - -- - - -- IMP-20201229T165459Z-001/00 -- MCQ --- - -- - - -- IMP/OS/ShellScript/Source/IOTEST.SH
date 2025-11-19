#!/bin/bash

hours=0
rate=0

<<COMT
echo "Enter hours: "
read hours
echo "Enter rate: "
read rate
COMT

: ' 
echo -n "Enter hours: "
read hours
echo -n "Enter rate: "
read rate
'

read -p "Enter hours: " hours
read -p "Enter rate: " rate

income=`expr $hours \* $rate`

echo "Income = $income"

exit 0







