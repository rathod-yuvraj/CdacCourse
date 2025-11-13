#include <iostream>
using namespace std;

void show();

int x;
void show();

int main (){
    
    cout<<"before Global varible Display: "<<x<<endl;
    cout<<"Enter the Global varible Display: "<<endl;
    cin>>x;
    cout<<"after Global varible Display: "<<x<<endl;
    show();



}
void show(){
   
    x++;
    cout<<"Functions in variable : "<<x<<endl;
}