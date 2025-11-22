#include <stdio.h>

long array[] = {123, 234, 345, 456, 567, 678, 789, 890};

int main(void)
{
	int index;
	long value;

	printf("Index (0-7): ");
	scanf("%d", &index);

	if(index <= 7)
	{
		value = array[index];
		printf("Value = %ld\n", value);
	}

	puts("Good bye!");
}


