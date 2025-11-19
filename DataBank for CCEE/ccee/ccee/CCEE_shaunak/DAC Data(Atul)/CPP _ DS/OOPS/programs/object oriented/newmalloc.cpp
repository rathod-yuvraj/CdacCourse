#include<iostream.h>
#include<string.h>
#include<malloc.h>
class MyClass
{
private:
	char *name;
public:
	MyClass(char *ptr)
	{
		cout<<endl<<"In parameterised constructor\n";
		name=new char[strlen(ptr)+1];
		strcpy(name,ptr);
	}
	void disp()
	{
		cout<<"Name is\t"<<name<<endl;
	}
	~MyClass()
	{
		cout<<endl<<"In destructor\n";
		delete []name;
	}
};
void main()
{
/*	MyClass *m=new MyClass("Sachin");
	m->disp();
	//delete m;
	free(m);
	*/


	/*MyClass *m=(MyClass*)malloc(sizeof(MyClass));
	delete m;
	*/

}