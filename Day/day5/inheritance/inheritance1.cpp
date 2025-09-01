#include <iostream>
using namespace std;

class Base { 
private: 
    int pvt = 1; 
protected: 
    int prot = 2; 
  
public: 
    int pub = 3; 
  

    int getPVT()
     { 
        return pvt; 
    } 
}; 
  
class PublicDerived : public Base { 
public: 
    // function to access protected member from Base 
    int getProt()
     { 
        return prot;
     } 
}; 
  
int main() 
{ 
    PublicDerived object1; 
    cout << "Private = " << object1.getPVT() << endl; //1
    cout << "Protected = " << object1.getProt() << endl; //2
    cout << "Public = " << object1.pub << endl; //3
//cout << "Public = " << object1.prot<< endl;  

    return 0; 
}