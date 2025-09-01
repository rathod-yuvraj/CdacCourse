#include <iostream>
using namespace std;

class Student{
    int roll;
    char name[];
    public:
    void accept();
    void display();
    ~Student();
    
};
void Student :: accept(){
    cout<<"Enter the Name: ";
    cin>>name;
     cout<<"Enter the Roll Number";
    cin>>roll;
}
void Student ::display(){
    cout<<"Name Of Student:"<<name<<endl;
    cout<<"Roll Numver of Student: "<<roll<<endl;
}
