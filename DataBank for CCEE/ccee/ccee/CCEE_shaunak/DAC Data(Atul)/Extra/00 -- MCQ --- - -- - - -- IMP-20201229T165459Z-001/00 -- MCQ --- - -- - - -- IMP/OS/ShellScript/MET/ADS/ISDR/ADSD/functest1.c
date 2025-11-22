#include <stdio.h>

extern double CashValue(double, short);

int main(void)
{
	double p, amount;
	short n;
	
	printf("Enter amount and period: ");
	scanf("%lf%hd", &p, &n);

	amount = CashValue(p, n);

	printf("Cash value: %.2lf\n", amount);

}


