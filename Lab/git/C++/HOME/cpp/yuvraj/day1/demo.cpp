// Online C++ compiler to run C++ program online
#include <iostream>
using namespace std;
int main() 
{
    
    // Write C++ code here
    int a[]={190,76,309,87,45,34};
    int max;
    int i;
    max=a[0];
    for(i=1;i<5;i++)
    {
        if(max<a[i])
        {
            max=a[i];
        }
        
    }
    cout <<"Max value: " << max;

    return 0;
}