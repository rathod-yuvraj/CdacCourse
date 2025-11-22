#!/bin/bash

pwd1=lion
pwd2=0
i=0
flag=0

while((i < 3))
do
	read -p "Enter password: " pwd2
	if [ "$pwd1" == "$pwd2" ]
	then
		flag=1
		break
	else
		echo "Bad password!"
	fi
	((i++))
done


if((flag==1))
then
	echo "Access Granted."
else
	echo "Access Denied."	
fi

exit 0















