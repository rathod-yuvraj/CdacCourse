#include<iostream.h>
#include<string.h>
class MyClass
{
	private:
		const int cnt;
		int num;
	public:
		MyClass(int k,int m):cnt(m)
		{
			num=k;
		}
		void disp()
		{
			//cnt++; //Error
			num++;  // No Error
			cout<<endl<<num<<"\t"<<cnt<<endl;
		}
		void myfun()const
		{
			//cnt++; //Error
			//num++; //Error
			cout<<endl<<num<<"\t"<<cnt<<endl;
		}

};
void main()
{
	MyClass m(100,10);
	m.disp();
	m.myfun();
}

