#!/bin/bash

pwd1=lion
pwd2=0
flag=0

for((i=0;i<3;i++))
do
	read -p "Enter password: " pwd2
	if [ "$pwd1" == "$pwd2" ]
	then
		flag=1
		break
	else
		echo "Bad password!"
	fi
done


if((flag==1))
then
	echo "Access Granted."
else
	echo "Access Denied."	
fi

exit 0















