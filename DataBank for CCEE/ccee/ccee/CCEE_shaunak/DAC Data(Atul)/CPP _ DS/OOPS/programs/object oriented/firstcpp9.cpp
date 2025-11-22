#include<iostream.h>
#include<string.h>
class MyClass
{
	private:
		char *name;
		int age;
	public:
		void disp();
		MyClass();
		MyClass(char *,int);
		~MyClass();
};
MyClass::MyClass()
{
	cout<<"in side def constructor but outside class\n";
}
MyClass::MyClass(char *str,int k)
{
	name=new char[strlen(str)+1];
	strcpy(name,str);
	age=k;
	cout<<"in parameterized constructor\n";
}
MyClass::~MyClass()
{
	delete []name;
	cout<<"\ninside destructor\n";
}
void MyClass::disp()
		{
			cout<<name<<"\t"<<age;
		}
void main()
{
	MyClass m1("sachin",25);
	m1.disp();
}