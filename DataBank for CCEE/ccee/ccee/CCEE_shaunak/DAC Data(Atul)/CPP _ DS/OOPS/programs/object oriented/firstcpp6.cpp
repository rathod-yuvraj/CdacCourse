/* constructor is a special member function,which does the 
job of constructing members of the class
it is special because
a) has the same name as of class
b) called automatically when the object is created
c) it has no return type

  there are three types of constructors in c++
  1) no-arg / default constructor
  2) parameterized constructor
  3) copy constructor

  When we don't write any constructor ,no-arg constructor is provided by compiler
  */
#include<iostream.h>
class MyClass
{
	private:
		int num;
	public:
		void setNum(int);
		int getNum();
		/*MyClass()
		{
			cout<<"\ninside def.constructor\n";
		}*/
		MyClass();
};
MyClass::MyClass()
{
	cout<<"in side def constructor but outside class\n";
}
void MyClass::setNum(int k)
		{
			this->num=k;
		}
int  MyClass::getNum()
		{
			return num;
		}
void main()
{
	MyClass m;
	m.setNum(100);
	cout<<endl<<m.getNum()<<endl;
}







