#include "power.h"
#include <stdio.h>

int main(void)
{
	int count;
	register int i;

	printf("Enter a positive integer: ");
	scanf("%d", &count);

	for(i = 1; i <= count; ++i)
	{
		int result;

		#ifdef _LOW
		result = SQUARE(i);
		#else
		result = CUBE(i);
		#endif

		printf("%d\t%d\n", i, result);
	}

}


