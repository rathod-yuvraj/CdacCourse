#include<iostream>
using namespace std;

class Person{
 
    public:
    int findClose(int x,int y,int z){
        int a,b;
        a=z-x;
        b=z-y;
        if(a==b){
            return 0;
        }
        return a<b ? 1:2;
    }

};

int main(){
    Person obj;
    obj.findClose(2,7,9);
}