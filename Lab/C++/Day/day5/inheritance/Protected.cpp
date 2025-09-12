#include <iostream> 
using namespace std; 
  
class Base { 
private: 
    int pvt = 1; 
  
protected: 
    int prot = 2; 
  
public: 
    int pub = 3; 
    void display();
  
    int getPVT() { 
        return pvt; 
    } 
}; 
  
class ProtectedDerived : protected Base { 
public: 
    // Corrected the syntax for calling the base class method
    int getBasePVT() { 
        return Base::getPVT(); 
    }
    
    int getProt() { 
        return prot; 
    } 
  
    int getPub() { 
        return pub; 
    } 
}; 
  
int main() { 
    ProtectedDerived object1; 
    cout << "Private cannot be accessed." << endl; 
    cout << "Protected = " << object1.getProt() << endl; 
    cout << "Public = " << object1.getPub() << endl; 
    cout << "Base private = " << object1.getBasePVT() << endl; 

    return 0; 
}
