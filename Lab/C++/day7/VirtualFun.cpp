#include <iostream>
using namespace std;

class Vehicle{

    int price=20000;
    public:
  virtual void display();
  virtual void Cost(){
    cout<<"Cost of Vehicle";
  }
};
void Vehicle:: display(){
    cout<<"Display the Price Of Vehicle: "<<price<<endl;
}

class Car:public Vehicle{
    char name[21]="Thar";
    void Cost(){
cout<<"Cost of Car";
    }
};


int main(){
    Vehicle *obj;
    Car ob;
    obj=&ob;
    obj->Cost();
}