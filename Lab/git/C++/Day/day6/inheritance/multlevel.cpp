#include <iostream>
using namespace std;
class Animal
{
	int c=1;
public:
	int a=2;
protected:
	int b=3;
public:
	void display()
	{
		cout<<"in display of Animal\n";
	}
};
class Cat:private Animal
{
public:
	void show()
	{
	    display();//allowed
		cout<<a<<b;
	}
};

class Dog:public Cat
{
	public:
	void show()
	{
	   
		cout<< a<<b; 
		cout<<c;
	}
};
int main()
{
	Cat obj;
	obj.show();
	//bobj.display(); //not allowed
}