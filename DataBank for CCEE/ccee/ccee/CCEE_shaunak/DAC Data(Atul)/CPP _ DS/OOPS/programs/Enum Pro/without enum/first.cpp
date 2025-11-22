#include<iostream.h>
class MyFont
{
	public:
		static const int PLAIN;
		static const int BOLD;
		static const int ITALIC;
};
const int MyFont::PLAIN=0;
const int MyFont::BOLD=1;
const int MyFont::ITALIC=2;

class MyComponent
{
	public:
	void setStyle(int style)
	{
		switch(style)
		{
			case 0: cout<<"plain"<<endl;
				break;
			case 1: cout<<"bold"<<endl;
				break;
			case 2: cout<<"italic"<<endl;
				break;
			default: cout<<"unpredictable color"<<endl;
		}			
	}
};
void main()
{
		MyComponent mc;
		mc.setStyle(MyFont::BOLD);
		mc.setStyle(MyFont::ITALIC);
//		mc.setStyle(MyFont::plain); //Error
		mc.setStyle(1); // saves typing
		mc.setStyle(6); // can be risky
}
