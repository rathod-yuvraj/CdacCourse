#include <iostream>
using namespace std;

template <class A>
A fun(A &c){
    cout<<"Value of the C:"<<c;
}

template <class A, class B>
A fun(A &p , B &q){
    cout<<"Value of the p and q "<<p<<"\t"<<
}