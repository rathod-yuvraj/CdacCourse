#include <iostream>
using namespace std;

int main(){
    int i,j,k;
    int n=5;
    for(i=1;i<n;i++){
        for(j=1;j<n-1;j++){
            cout<<"/t";
        }
        for(k=i;k<n;k++){
            cout<<k;
        }
    }
}