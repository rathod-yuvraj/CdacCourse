#include <stdio.h>

int main(void)
{
	long number, digits;
	long a, b;
	register int c;

	printf("Enter a positive integer: ");
	scanf("%ld", &number);

	a = 1;
	b = number;
	c = 0;

	while(a <= b)
	{
		c += 1;
		a *= 10;
	}

	digits = c;

	printf("Number of digits = %ld\n", digits);
}

