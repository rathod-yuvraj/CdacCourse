#include<iostream>
using namespace std;
class Person
{
    public:

//    void display();
};
// void Person::display()
// {
//     cout<<"in display"<<endl;   
// }

class Faculty : virtual public Person
{
    public:
 

   void display() {
        cout << "Faculty display" << endl;
    }
    
};
class Student: virtual public Person
{
    public:
   void display() {
        cout << "Student display" << endl;
    }
   
};
class TA:public Faculty,public Student
{
    public:
    
};
int main()
{
    TA t1;
    t1.Student::display();
    return 0;
}