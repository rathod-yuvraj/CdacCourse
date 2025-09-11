#include <iostream>
using namespace std;

class Base{

    public :
    void fun(){
        cout<<"Display Base Class";
    }
};

class parent1:public Base{
    public:
    void display();


};

class parent2:public Base{
    public:
    void show();
  
};
class Child : public parent1, public parent2{

};


int main(){
    Child* obj=new Child();

    obj->fun();
}