
#include <iostream>
using namespace std;
void swap (int *,int*);
int main()
{
   int a =10,b=20;
//    int p,q;
   cout <<"a="<<"\t"<<"b="<<b;
   swap(&a,&b);
   cout <<"\nafter swap in main()\n";
   cout<<"a="<<a<<"\t"<<"b="<<b;
}
void swap (int * p, int *q)
{
int temp ;
temp= *p;
*p=*q;
*q = temp;
 cout <<"\n in swap func  ()\n";
 cout <<"*p= "<<*p<<"\t" <<"q="<< *q ;
}








