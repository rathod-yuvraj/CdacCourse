#!/bin/bash

len=$#

if [ $len -lt 1 ]
then
	echo "USAGE: $0 <filename>"
	exit 1
fi

filename=$1

if [ ! -e $filename ]
then
	echo "ERROR: $filename does not exist"
	exit 2
fi

permission=`ls -l $filename | cut -c2-4`
i=1

while((i <= 3))
do
	c=`echo $permission | cut -c$i`
	case $c in
	r) echo "READ";;
	w) echo "WRITE";;
	x) echo "EXECUTE";;
	esac
	((i++))
done


exit 0
















