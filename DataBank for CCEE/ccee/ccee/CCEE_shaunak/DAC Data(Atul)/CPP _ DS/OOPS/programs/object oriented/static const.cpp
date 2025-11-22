#include<iostream.h>
class myclass
{
private:
	static const int cnt;
public:
	myclass()
	{
	}
	static void show()
	{
		cout<<cnt<<endl;
	}
};
const int myclass::cnt=10;
void main()
{
	myclass::show();
}