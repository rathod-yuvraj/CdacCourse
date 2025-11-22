#include<iostream.h>
class MyClass
{
	private:
		int num; // instance member
	public:
		void setNum(int k)
		{
			num=k;
		}
		int getNum()
		{
			return num;
		}
};
void main()
{
	MyClass m;  // object of MyClass
	m.setNum(100);
	cout<<endl<<m.getNum()<<endl;
}









