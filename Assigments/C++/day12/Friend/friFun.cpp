#include <iostream>
//yuvraj rathod
using namespace std;

class A{
    int num;
    string name;
    public:
    void accept();
  friend  void display(A&);
};

void A::accept(){
   cout<<"Enter the Number:";
   cin>>num;
   cout<<"Enter the String: ";
   cin>>name;
}
void display(A& aobj){
   cout<<"Frient functions is accessing Number: "<<aobj.num<<endl;
   cout<<" Friend functions is String: "<<aobj.name;
}
int main(){
   A obj;
   obj.accept();
   display(obj);
}