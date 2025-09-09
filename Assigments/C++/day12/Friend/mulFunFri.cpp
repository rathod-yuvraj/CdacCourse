#include<iostream>
using namespace std;
class B;
class A{

    int a;
    public:
    int getdata(){
    cout<<"Enter the Number:(value a) ";
    cin>>a;
    }
    friend void big(A& ,B&);
};

class B{
    string name;
    public:
    void accept();
    friend void big(A& ,B&);
    
};
void B:: accept(){
    cout<<"Enter the new String: ";
    cin>>name;

}
void big(A& aobj ,B& bobj){
    cout << "\nIn friend function 'big()':" << endl;
    cout << "The number from class A is: " << aobj.a << endl;  // Accessing 'a' in class A
    cout << "The string from class B is: " << bobj.name << endl;
}

int main(){
    A aobj;
    aobj.getdata();
    B bobj;
    bobj.accept();
    big(aobj,bobj);
    
}