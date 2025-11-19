/*
copy constructor is called in 3 situations
a) when object is initialized with another object
b) when object is passed as an argument ,and collected in 
another temporary object
c) when object is returned from a function and collected in
some other object
*/
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
		MyClass(const MyClass &);
};
MyClass::MyClass()
{
	name=NULL;
	cout<<"in side def constructor but outside class\n";
}
MyClass::MyClass(char *str,int k)
{
	name=new char[strlen(str)+1];
	strcpy(name,str);
	age=k;
	cout<<"in parameterized constructor\n";
}
MyClass::MyClass(const MyClass &m1)
{
	name=new char[strlen(m1.name)+1];
	strcpy(name,m1.name);
	age=m1.age;
	cout<<"\ninside copy constructor\n";
}
MyClass::~MyClass()
{
	if(name!=NULL) //so that it should not create problem for m3.
	{
		delete []name;
	}
	cout<<"\ninside destructor\n";
}
void MyClass::disp()
		{
			if(name!=NULL) //so that it should not create problem for m3.
			cout<<name<<"\t"<<age;
			else
				cout<<age<<endl;
		}
void main()
{
	MyClass m1("sachin",25);
	m1.disp();
	MyClass m2=m1; // here copy constructor will be called
	m2.disp();
	MyClass &ref=m2;
	ref.disp();
	MyClass m3=ref; // here also copy constructor gets called
	m3.disp();
}
