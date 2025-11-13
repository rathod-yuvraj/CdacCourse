#include <iostream>
using namespace std;

int main(){
    int a=10;
    int b=20;
    // cout<<" Before Swap the number: ";
    // cout<<"A: "<<a<<endl;
    // cout<<"B: "<<b<<endl;
    // int temp;
    // temp=a;
    // a=b;
    // b=temp;
    // cout<<" After Swap the number: ";
    // cout<<"A: "<<a<<endl;
    // cout<<"B: "<<b<<endl;
    a = a + b;    
    b = a - b;    
    a = a - b;    
    
    
    cout<<a<<endl;
    cout<<b;

}