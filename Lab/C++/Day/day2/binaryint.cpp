#include <iostream>
using namespace std;

int binaryToDecimal(string binary) {
    int decimal = 0;
    for (char c : binary) {
        decimal = decimal * 2 + (c - '0');
    }
    return decimal;
}

int main() {
    string a = "1010", b = "1101";
    int sum = binaryToDecimal(a) + binaryToDecimal(b);
    cout << "Sum: " << sum;
    return 0;
}