#include <iostream>
#include<string.h>
using namespace std;

class String1{
    int len;
    char* ptr;
    public:
    void Display();
    String1();
    String1(int);
    String1(char*);
    String1(char ,int);
    ~String1();

};
 String1::String1(){
    len=5;
    ptr=new char[len];
}
String1::String1(int a){

    len=a;
}
String1::String1(char* s){

    len=strlen(s);
    ptr=new char[len+1];
    strcpy(ptr,s);

}
String1::String1(char c,int len){
    int i;
    this->len=len;
    ptr=new char[len];
    for(i=0;i<len;i++){
        ptr[i]=c;

    }
    ptr[len]='\0';

}
String1::~String1(){
    cout<<"destructor is called\n";
			if(ptr)
			{
			cout<<"in if\n";
			delete[]ptr;
			ptr=NULL;
			}

}
void String1::Display()
{
	if(len>1)
	{
			cout<<"length of character is "<<len<<endl;
			cout<<"string is "<<ptr<<endl;
	}
	else
	{
	cout<<"length of character is "<<len<<endl;
	cout<<"character is "<<*ptr<<endl;
	}
}
int main()
{
	String1 s1;
	s1.Display();
	String1 s2("rahul");
	s2.Display();
	String1 s3('*',80);
	s3.Display();
	String1 s4(4);
	s4.Display();

	/*s1.~string1();
	s2.~string1();
	s3.~string1();
	s4.~string1();*/
}