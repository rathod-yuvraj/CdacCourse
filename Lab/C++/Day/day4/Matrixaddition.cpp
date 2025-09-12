#include<iostream>
using namespace std;

int main() {
    int i, j;
    int n = 2, cal = 2;
    int a[2][2] = { 1,2,3,4};
    int b[2][2] = {1,2,3,4 };
    int c[2][2] = {0}; 

    
    for (i = 0; i <n; i++) {
        for (j = 0; j <n; j++) { 
            c[i][j] = a[i][j] + b[i][j];
        }
    }

    for (i = 0; i <n; i++) {
        for (j = 0; j <n; j++) {
            cout << c[i][j] << " "; 
        }
        cout << endl;
    }

    return 0;
}
