#include<iostream>
using namespace std;

class Demo{
    int* ptr;
    public:

    Demo();
    void Display();

};

Demo::Demo(){
    ptr=new int;
    *ptr=10;
}
void Demo::Display(){
    cout<<"*ptr: "<<*ptr<<endl;
    cout<<"&ptr: "<<&ptr<<endl;
}
int main(){
    Demo d;
    d.Display();
}
