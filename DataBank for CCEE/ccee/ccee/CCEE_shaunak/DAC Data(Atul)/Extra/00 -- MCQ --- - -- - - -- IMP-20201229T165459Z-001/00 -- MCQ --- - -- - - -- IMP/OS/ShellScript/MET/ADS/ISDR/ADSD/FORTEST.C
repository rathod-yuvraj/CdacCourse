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

	for(c = 0; a <= b; ++c)
	{
		a *= 10;
	}

	digits = c + (c == 0);

	printf("Number of digits = %ld\n", digits);
}

