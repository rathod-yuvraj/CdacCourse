#include<iostream.h>
#include<string.h>
class MyClass
{
private:
	static int cnt;
	int num;
public:
	int temp;
	MyClass(int k)
	{
		num=k;
		temp=k*2;
	}
	void disp()
	{
		cout<<endl<<"in side disp\n";
	}
	static int rate;
	static void show()
	{
		cout<<cnt<<endl;
	}
	~MyClass()
	{
		//cout<<this->num<<endl;
		cout<<endl<<"in dest\n"<<endl;
	}
};
int MyClass::rate=12;
int MyClass::cnt=30;
void main()
{
	cout<<endl<<MyClass::rate<<endl;
	MyClass m1(100);
	cout<<endl<<"m1's temp is\t"<<m1.temp<<endl;
	m1.disp();
	MyClass m2(200);
	MyClass::show();
}