#include<iostream>
using namespace std;

class Arr1d{
    int arr[10] ;
    int i;
    public:
    void accept();
    void display();


};
void Arr1d ::accept(){
    // int arr[9];
    cout<<"Enter the number "<<endl;
    for(i=0;i<10;i++){
        cout<<i<<"-->: ";
        cin>>arr[i];
    }
}
void Arr1d ::display(){
    cout<<"Display the Array Elements: ";
    for(i=0;i<10;i++){
        cout<<arr[i]<<" ";
    }
}




int main(){

    Arr1d a;
    a.accept();
    a.display();
    return 0;
}