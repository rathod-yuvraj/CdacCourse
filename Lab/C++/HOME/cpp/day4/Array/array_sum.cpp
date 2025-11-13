#include <iostream>
using namespace std;

int main(){
    int n;
    cout<<"Enter the size of  Array : ";
    cin>>n;

    int arr[n];
    cout<<"Enter "<<n<<" Elements!"<<endl;
    for(int i=0;i<n;i++){
       cin>> arr[i];
    }
    int sum=0;
    for(int i=0;i<n;i++){
        sum+=arr[i];
    }
    cout<<"Sum oF Array Elements: "<<sum;

}