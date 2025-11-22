#!/bin/bash

ls -l | grep ^- | tr -s " " "|" | cut -d"|" -f9 > temp

for first in `cat temp`
do
	for second in `cat temp`
	do
		if [ $first != $second ]
		then
			cmp -s $first $second
			if [ $? -eq 0 ]
			then
				echo "$first is identical to $second" 
			fi
		fi
	done
	grep -v $first temp > newtemp
	mv newtemp temp
done

exit 0






