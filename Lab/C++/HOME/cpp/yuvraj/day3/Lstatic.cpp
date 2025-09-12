#include <iostream>
using namespace std;


void var();

int main(){
    int x=10; //local
    cout<<"Display the value: "<<x<<endl;
    static int y;
    cout<<"Display the Static varible Default value:: "<<y<<endl;
    static int a=10;
    cout<<"Display the Static varible value : "<<a<<endl;
    var();
    // cout<<"Display the Static varible In functions value  : "<< b <<endl;
    cout<<"Display the Local varible In function value : "<<x <<endl;





}
void var(){
   
    static int b;
    b++;
    cout<<"Display the Static varible In functions value  : "<< b <<endl;

}