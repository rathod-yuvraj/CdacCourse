#include "power.h"
#include <stdio.h>

int main(void)
{
	float value, square, cube;

	printf("Enter value: ");
	scanf("%f", &value);

	square = SQUARE(value);
	cube = CUBE(value);

	printf("Square of %f is %f and its cube is %f\n", value, square, cube);
}

