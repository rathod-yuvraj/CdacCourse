
#include <iostream>
using namespace std;

int main() {
    int a = 42;
    int* p = &a;   // pointer to a  

    cout << "a = " << a << endl;         // 42
    cout << "Address of a = " << &a << endl; 
    cout << "p (address stored) = " << p << endl; 
    cout << "*p (value at address) = " << *p << endl; // 42

    *p = 99;  // change value at address
    cout << "a after change = " << a << endl; // 99
    cout << "p after (address stored) = " << p << endl; 
    return 0;
}
// Demonstrates basic pointer usage in C++
// Compile with: g++ -std=c++14 demo.cpp -o demo