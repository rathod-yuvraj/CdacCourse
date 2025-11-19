#include <stdio.h>

long inner = 0, outer = 0;
static long frame;

int main(void)
{
	printf("Enter inner and outer widths: ");
	scanf("%ld%ld", &inner, &outer);

	frame = outer * outer - inner * inner;

	printf("Frame area = %ld\n", frame);
}




