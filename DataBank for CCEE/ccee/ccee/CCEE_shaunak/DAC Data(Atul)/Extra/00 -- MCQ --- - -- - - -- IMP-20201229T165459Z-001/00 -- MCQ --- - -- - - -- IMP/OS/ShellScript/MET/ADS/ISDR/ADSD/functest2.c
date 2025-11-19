#include "box.h"
#include <stdio.h>

int main(void)
{
	long l, b, h;
	long area, volume;

	printf("Enter box dimensions: ");
	scanf("%ld%ld%ld", &l, &b, &h);

	area = BoxGetArea(l, b, h);
	volume = BoxGetVolume(l, b, h);

	printf("Area = %ld and Volume = %ld\n", area, volume);
}

