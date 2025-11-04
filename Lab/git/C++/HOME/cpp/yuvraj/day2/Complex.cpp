#include <iostream>
using namespace std;
class Complex{
    int real;
    int img;
    public:
    void accept();
    void display();
    void setReal(int);
    int getReal();


};

void Complex ::accept(){
    cout<<"Enter the Real Number: ";
    cin>>real;
    cout<<"Enter the Img Number: ";
    cin>>img;
}
void Complex ::display(){
    cout<<"The Complex Number: "<<real<<"+"<<img<<"i"<<endl;

}

void Complex :: setReal(int a){
    real=a;
    cout<<"Updated new Complex Number: "<<real<<"+"<<img<<"i"<<endl;
}
int Complex ::getReal(){
    return real;
}
int main(){
    Complex c;
    c.accept();
    c.display();
    c.setReal(34);
    cout<<"Get the value: "<<c.getReal();
}