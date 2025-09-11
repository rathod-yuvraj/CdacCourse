#include <iostream>
using namespace std;

int main() {
    int num=9;
    // cout << "Enter the Number: ";
    // cin >> num;
    
    int count = 0;
    
    for (int i = 2; i < num; i++) {
        if (num % i == 0) {
            count++; 
            break; 
        }
    }
    
    if (count == 0) {
        cout << "Yes, " << num << " is a prime number." << endl;
    } else {
        cout << "No, " << num << " is not a prime number." << endl;
    }
    
    return 0;
}