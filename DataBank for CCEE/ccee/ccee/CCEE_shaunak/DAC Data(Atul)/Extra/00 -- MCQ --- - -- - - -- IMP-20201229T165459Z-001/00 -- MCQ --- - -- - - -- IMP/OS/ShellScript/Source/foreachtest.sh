#!/bin/bash

for var in $@
do
	echo $var 
done

echo "------------"

for var #in *
do
	echo "($var)"
done

echo "------------"

for var in `cat names.txt`
do
	echo $var 
done

exit 0










