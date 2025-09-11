#include <iostream>
using namespace std;

template <class A>
int add(A &b, A &c){


      A result=b+c;

      return result;
}
int main(){

    int num1 ,num2;
    cout<<"Enter the num1: ";
    cin>>num1;
    cout<<"Enter the num2: ";
    cin>>num2;
    int res=add(num1,num2);
    cout<<"addition of two num: "<<res;
}