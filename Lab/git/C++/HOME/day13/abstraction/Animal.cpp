#include <iostream>
using namespace std;

class Animal{
    protected:

    string name;

    public:
    virtual void makeSound()=0;

};
class Dog:public Animal{


    public:
    void makeSound(){
        cout<<"Woof Woof"<<endl;

    }
};
class Cat:public Animal{

    public:

    void makeSound(){
        cout<<"Meow Meow"<<endl;
    }
};

class Cow:public Animal{

    public:
    void makeSound(){
        cout<<"Moo Moo"<<endl;
    }
};

int main(){
    Animal* obj;
    Dog d;
    Cat c;
    Cow a;


    obj=&d;
    obj->makeSound();
     obj=&c;
    obj->makeSound();
     obj=&a;
    obj->makeSound();
}