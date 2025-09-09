#include <iostream>
using namespace std;

enum Icecream
{
    vanilla, strawberry, mango
};

int main()
{
    //  Icecream i = vanilla; 
    for(int i=vanilla;i<=mango;i++)
    cout << "Ice cream flavor selected: " << i << endl;
    return 0;
}
