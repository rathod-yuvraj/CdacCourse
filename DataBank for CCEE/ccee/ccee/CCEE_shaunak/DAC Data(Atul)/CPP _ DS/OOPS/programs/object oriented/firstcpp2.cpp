#include<iostream.h>
class MyClass
{
	private:
		int num;
	public:
		void setNum(int);
		int getNum();
};
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
	MyClass m;  // object of MyClass
	MyClass m1;
	m.setNum(100);
	m1.setNum(200);
	cout<<endl<<m.getNum()<<endl;
	cout<<endl<<m1.getNum()<<endl;
}









