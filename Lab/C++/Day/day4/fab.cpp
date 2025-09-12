#include<iostream>
using namespace std;

int main()
{
    int num = 10;
    int a= 0,b= 1; 

    cout << a << ", " << b << ", ";

    int sum=0;

    for (int i=2;i<num;i++){
        sum=a+b;
        a=b;
        b=sum;

        cout<<sum <<",";
     }
     return 0;

}