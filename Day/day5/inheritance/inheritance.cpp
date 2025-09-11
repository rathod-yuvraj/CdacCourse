#include<iostream>
using namespace std;
class A
{
	int a; //varible declare
public:
	A(int); // paramtric contructor
    void display(); //function
 };
A::A(int p) //contructor declaration scope 
//:: resolutions oparator
{
	cout<<"in para of A\n";
	a=p;
}
void A::display() //functions declare
{
	cout<<a<<endl;
}
class B:public A  //class declare
{
	int b;
public:
	B(int,int);
	void display();
};
B::B(int p,int q):A(p)//base class initilization list
{
	cout<<"in para of B\n";
	b=q;
}
void B::display()
{
	A::display();
	cout<<b<<endl;
}
int main()
{
	B b(10,20);
	b.display();
}