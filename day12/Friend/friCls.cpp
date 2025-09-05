#include <iostream>
//yuvraj rathod
using namespace std;
 class Demo{
    int num=10023;
   //  char name[20]="Yuvraj";
    string name;
    public:
   //  Demo(int a,string b){

   //    a=num;
   //    b=name;

   //  }
    void display();
    void accept();
    friend class F;
 };
 void Demo:: accept(){

   cout<<"Enter the Number: ";
   cin>>num;
   cout<<endl;
   cout<<"Enter the String: ";
   cin>>name;

 }
 void Demo::display(){
   cout<<"Number: "<<num<<endl;
   cout<<"String: "<<name;
 }
 class F{

   public:
     int show(Demo &b){
      b.accept();
      b.display();
   } 

 };

 int main(){
   // Demo* obj=new Demo(21,"yuvraj");
   // obj->accecpt();
   // obj->display();
   Demo obj;
   F fri;
   fri.show(obj);

 }