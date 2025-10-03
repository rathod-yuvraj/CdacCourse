#include<iostream>
using namespace std;
int main(){
    int i,j,k,n=6;
    char c='A';
    for(i=1;i<=n;i++){
        for(j=n-i;j>0;--j){
            cout<<" ";
        }
        for(k=1;k<=i;k++){
            cout<<c;
        }
        c++;
        cout<<endl;
    }
}