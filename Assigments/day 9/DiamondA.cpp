#include <iostream>
using namespace std;

class Person{

    int x;
    public:
    void display();
};

void Person::display(){
    cout<<"Display the Person class"<<endl;
}

class Faculty:virtual public Person{
     
     public:
     void Show();
};

class Student:virtual public Person{

   
    public:
    void add();
};

class TA:public Faculty ,public Student{
    
    public:
    TA(){
        cout<<"Teacher class call";
    }
};

int main(){
    TA obj ;
    obj.display();
}