
#include<iostream>
using namespace std;

class Animal{
    char name[20]="Cat";
    public:
       
        void display();
};

void Animal:: display(){
    cout<<"Display the "<<name<<endl;
}

class Dog :public Animal{ 
    int num=10;
    public:
    void show()
{
Animal::display();
}    
};

int main(){
    
    Dog obj;
    obj.display();
}