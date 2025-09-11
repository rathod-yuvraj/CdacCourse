#include <iostream>
using namespace std;

template<class X, class Y>
X  fun (X &a,Y &b)
{
    
    X rohit = a+b;
    return rohit;


}

int main() {
    int a=10;
    int b=28;
   cout<<"result "<< fun(a,b);
  
}