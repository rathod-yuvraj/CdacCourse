#include<iostream>
using namespace std;
// this program is to print the pyrimid pattern
int main(){
    int i,k,j,n;
    cout<<"Enter the number of rows: ";
    cin>>n;
    for(i=0;i<n;i++){
        for(k=n-i;k>1;k--){
            cout<<" ";
        }
        for(j=0;j<i;j++){
            cout<<"* ";
        }
        cout<<endl;
    }
}