#include<iostream>
using namespace std;

// int main(){
//     int n;
//     cout<<"ENter the Array size: ";
//     cin>>n;
//     int arr[n];
//     for(int i=0;i<n;i++){
//         cin>>arr[i];

//     }
//     cout<<"Display the Array!"<<endl;
//     for(int i=0;i<n;i++){
//         cout<<arr[i]<<" ";

//     }
//     cout<<endl;
//     cout<<"Reverse of Array is : "<<endl;
//     for(int i=n-1;i>=0;--i){
    
//         cout<<arr[i];

//     }
// }
/*
              Reverse Of Array  using Swapping

*/
int main(){
    int n;
    cout<<"ENter the Array size: ";
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];

    }
    cout<<"Display the Array!"<<endl;
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";

    }
    cout<<endl;
    // Reversing using Swapping
    int start=0;
    int end=n-1;
    while(start<end){
        // swap(arr[start],arr[end]);

        //swaping without using inbuild function
         // int temp=arr[start];
        // arr[start]=arr[end];
        // arr[end]=temp;

         arr[start]=arr[start]+arr[end]; //sum of both
         arr[end]=arr[start]-arr[end];   //substracting end from sum we get start
         arr[start]=arr[start]-arr[end];
        //swap without using third varible
            // arr[start]=arr[start]^arr[end]; //XOR of both
            // arr[end]=arr[start]^arr[end];   //XORing end with XOR we get start
            // arr[start]=arr[start]^arr[end]; //XORing start with XOR we get end   
            
       
        
        start++;
        end--;
    }
    cout<<"Reverse of Array is : "<<endl;
    for(int i=0;i<n;i++){
    
        cout<<arr[i]<<" ";

    }
}