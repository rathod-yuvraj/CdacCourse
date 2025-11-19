#include<iostream.h>
class MyFont
{
public:
	enum openmode{PLAIN,BOLD,ITALIC};
};
class MyComponent
{
	public:
		void setStyle(MyFont::openmode style)
	{
		switch(style)
		{
		case MyFont::PLAIN: cout<<"plain"<<endl;
				break;
		case MyFont::BOLD: cout<<"bold"<<endl;
				break;
		case MyFont::ITALIC: cout<<"italic"<<endl;
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
		mc.setStyle(MyFont::PLAIN);
//		mc.setStyle(MyFont::plain); //Error
//		mc.setStyle(1); // error
//		mc.setStyle(6); // error
}
