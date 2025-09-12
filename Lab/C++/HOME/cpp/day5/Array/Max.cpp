#include<iostream>
using namespace std;

int main(){
    int n;
    int arr[n];
    cout<<"Enter the size of  Array : ";
    cin>>n;
    cout<<"Enter the elements of Array : ";
    for(int i=0;i<n;i++){
        cin>>arr[i];    
    }
    int max=arr[0];
    for(int i=0;i<n;i++){
        if(arr[i]>max){
            max=arr[i];
            cout<<"Max of array is : "<<max<<endl;
        }
    }
}