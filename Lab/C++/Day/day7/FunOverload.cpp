#include <iostream>
using namespace std;

class FunOverload {

    public:

    void add(int a,int b)
    {
        cout<<"Integer sum ="<<a+b
        <<endl;
    }

    //float 
    //overloading
    void add(double a,double b)
    {
        cout<<"Float sum ="<<a + b
        << endl;
    }
};

int main()
{
    FunOverload obj;

    obj.add(10,2);

    obj.add(5.3,6.2);

    return 0;
}