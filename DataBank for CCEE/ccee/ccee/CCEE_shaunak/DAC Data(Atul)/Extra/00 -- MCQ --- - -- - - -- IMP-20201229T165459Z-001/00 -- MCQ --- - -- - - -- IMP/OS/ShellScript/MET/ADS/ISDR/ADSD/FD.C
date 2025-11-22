static float InterestRate(short period)
{
	return period < 3 ? 9.5 : 10.5;	
}

double CashValue(double amount, short period)
{
	float rate = InterestRate(period);

	while(period > 0)
	{
		amount += amount * rate / 100;
		period -= 1;
	}

	return amount;
}

