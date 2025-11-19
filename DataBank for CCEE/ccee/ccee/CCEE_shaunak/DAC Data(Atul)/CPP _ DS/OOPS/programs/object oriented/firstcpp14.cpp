#include<iostream.h>
class MyClass
{
	private:
		int num;
	public:
		int getNum();
		MyClass(int k)
		{
			num=k;
		}
		~MyClass()
		{
			cout<<endl<<"in dest\n";
		}
};
int  MyClass::getNum()
		{
			return num;
		}
void main()
{
	MyClass m[3]={10,20,30};  // Array of object of MyClass
//	MyClass m[3]={MyClass(40),MyClass(50),MyClass(60)};  // Array of object of MyClass
	int i;
	for(i=0;i<3;i++)
	{
	cout<<endl<<m[i].getNum()<<endl;
	}
//	MyClass(70).getNum(); //Anonymous object
	cout<<endl<<MyClass(70).getNum()<<endl;
}