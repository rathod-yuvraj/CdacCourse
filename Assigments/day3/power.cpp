
#include<iostream>
using namespace std;

int main(){
    int num;
    int power;
    int i, result=1;

    

    cout<<"Enter the num : ";
    cin>>num;
    cout<<"\nEnter the power: ";
    cin>>power;
    for(i=1;i<=power;i++){
        result=num*result;
        cout<<" in Loop: "<<result<<endl;
    }
    cout<<" power : "<<result<<endl;
    cout << num << " raised to the power " << power<< " is " << result << endl;

    return 0;
}