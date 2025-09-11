#include<iostream>
#include<cmath> 
using namespace std;

int main(){
    int p, r, n;
    double c;
    
    cout << "Enter the P: ";
    cin >> p;
    cout << "Enter the rate: ";
    cin >> r;
    cout << "Enter the time or years: ";
    cin >> n;

    c = p * pow((1 + r/100.0), n); 
    cout << "Amount: " << c;
    
    return 0;
}