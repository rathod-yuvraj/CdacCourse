#include<iostream.h>

class single
{
private:

static single s;
	single(single &ref)
	{
		cout<<"in copy const\n";
	}
	single()
	{
		cout<<"in def const\n";
	}
public:
	//	Single s;
	
	void disp()
	{
		cout<<"in disp method\n";
	}
	static single& getSingle()
	{
		
		return s;
	}
};
single single::s;
void main()
{
	single &ref=single::getSingle();
	ref.disp();
}