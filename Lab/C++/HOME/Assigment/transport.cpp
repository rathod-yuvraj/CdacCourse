#include<iostream>
using namespace std;

class Vehicle{
    int vehicleId;
    string modelName;
    double Price;

    public:
    Vehicle(int id=0,string name="",double p=0.0){
        vehicleId=id;
        modelName=name;
        Price=p;
    }
    int getVehicalId(){
        return vehicleId;
    }
    string getMOdelName(){
        return modelName;
    }
    double getPrice(){
        return Price;
    }
    double setPrice(int p){
        Price=p;
    }
};