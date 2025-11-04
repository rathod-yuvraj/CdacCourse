#include <iostream>
using namespace std;
int main(){
    int n;
    cout<<"ENter the Array size: ";
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    int min=arr[0];
    for(int i=0;i<n;i++){
        if(arr[i]<min){
            min=arr[i];
            cout<<"Min of array is : "<<min<<endl;
        }
    }
}