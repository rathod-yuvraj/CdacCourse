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
		MyClass(int);
};
MyClass::MyClass()
{
	cout<<"in side def constructor but outside class\n";
}
MyClass::MyClass(int k)
{
	num=k;
	cout<<"in parameterized constructor\n";
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
	MyClass m1(45);
	cout<<endl<<m1.getNum()<<endl;
}












