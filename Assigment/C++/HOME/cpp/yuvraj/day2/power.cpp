#include <iostream>
#include <cmath> 
using namespace std;
int main() {
    int a = 2;
    int n = 5;
    //int r= pow(a, n);
    int r=1;
    // cout << a << " raised to the power " << n<< " is " << r << endl;
     for(int i=1;i<n;i++){
        r=a*a;

    }
    cout<<r;
    return 0;
   
}