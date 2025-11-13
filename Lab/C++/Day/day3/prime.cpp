
#include <iostream>
using namespace std;
int main() {
    int num;
    cout<<"Enter the Number: ";
    cin>>num;
    int count=0;
    for (int i = 2; i <=num; i++) {
        if (num % i == 0) {
        //    cout << "No " <<  num << " is not a prime number.\n";
          count++;
        // }else{
        //     // cout << "Yes " <<  num << " is a prime number.\n";
    
         }
    }
   if(count==1){
            cout<<"Yes is a prime number"<<endl;
         }else{
            cout<<"No is a prime number"<<endl;
         }
    return 0;
}
