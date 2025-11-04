#include<iostream>
using namespace std;
class Parent{
    public:
    int pub=25;

    void Display(){
        cout<<"Display the Value Of Public"<<endl;
    }
};
class Child: public Parent{

    private:
     int pvt=60;
     string a="Yuvraj";
     public:
     Child(int b){
        cout<<"Value Of pvt"<<pvt<<" String A:"<<a<<endl;
     }
     void display(){
        cout<<"Display the Child Class!"<<endl;
     }
};

int main(){
     Child obj(20);
    obj.Display();
}