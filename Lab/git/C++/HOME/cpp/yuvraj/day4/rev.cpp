#include<iostream>
#include<cstring>
using namespace std;

// int main()
// {
// string s = "world";

// s = string(s.rbegin(), s.rend());
    

#include <iostream>
#include <cstring> 

int main() {
    char a[]="Hello World ";
    // cout<<"Enter the String: ";
    // cin>>a;
    // int n = strlen(a);
    int num=sizeof(a)/sizeof(a[0]);
    cout<<"lenght of String: "<<num<<endl;

    for (int i = num - 1; i >= 0; --i) {
        char c = a[i]; 
        cout << c;
    }

    cout <<endl; 
    return 0;
}
