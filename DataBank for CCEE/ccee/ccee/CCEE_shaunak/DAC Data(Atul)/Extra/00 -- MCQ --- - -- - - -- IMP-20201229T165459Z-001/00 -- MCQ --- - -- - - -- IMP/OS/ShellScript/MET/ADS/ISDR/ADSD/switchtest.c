#include <stdio.h>

int main(void)
{
	short stay;
	int room;
	float rate;
	double payment;

	printf("1. Economy\n2. Business\n3. Executive\n4. Deluxe\n");
	printf("Room type (1-4): ");
	scanf("%d", &room);
	printf("Number of days: ");
	scanf("%hd", &stay);

	switch(room)
	{
	case 1:
		rate = 450;
		break;
	case 2:
		rate = 575;
		break;
	case 3:
		rate = 675;
		break;
	default:
		rate = 950;
	}

	payment = 1.05 * stay * rate;

	printf("Payment: %.2lf\n", payment);
}

