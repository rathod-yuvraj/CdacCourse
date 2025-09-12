#include <iostream>
using namespace std;

int main(){
  
    int n;
    int arr[n];
    int sum=0;
    cout<<"Enter the size of  Array : ";
    cin>>n;
    cout<<"Enter the elements of Array : ";
    for(int i=0;i<n;i++){
        cin>>arr[i];
        sum+=arr[i];
}
cout<<"Display the Array!"<<endl;
for(int i=0;i<n;i++){
        cout<<arr[i];

}
cout<<endl;
cout<<"Sum of Array is : "<<sum<<endl;
    return 0;

}