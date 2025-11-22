#include <iostream.h>
class base
{
private:
	int a;
public:
	base(int k)
	{
		disp();
		a=k;
	}
	void disp()
	{
		cout<<"Value of a is\t"<<a<<endl;
	}
};
void main()
{
	base b1(10);
	b1.disp();

}
