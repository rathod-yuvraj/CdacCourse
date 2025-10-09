#include<iostream>
using namespace std;
class A
{
	int a;
public:
	A();
    void display();
 };
A::A()
{
	cout<<"in default of A\n";
	a=10;
}
void A::display()
{
	cout<<a<<endl;
}
class B:public A
{
	int b;
public:
	B();
	void display();
};
B::B()
{
	cout<<"in default of B\n";
	b=20;
}
void B::display()
{
	A::display();
	cout<<b<<endl;
}
int main()
{
	B bobj;
	bobj.display();
}