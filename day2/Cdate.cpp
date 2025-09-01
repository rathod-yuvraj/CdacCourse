#include <iostream>
using namespace std;

class Cdate{

    int dd,mm,yy;
    public:
    void accept();
    void display();
    void setDd(int);
    int getDd();
};
void Cdate :: accept(){
    cout<<"enter the date month and year: ";
    cin>> dd>>mm>>yy;


}
void Cdate ::display(){
    cout<<"Date month and year: "<<endl;
    cout<<dd<<"/"<<mm<<"/"<<yy<<endl;
}
void Cdate ::setDd(int a){

    dd=a;
    cout<<"Update Date: ";
    cout<<dd<<"/"<<mm<<"/"<<yy<<endl;
}
int Cdate::getDd(){
    return dd;
}

int main(){

    Cdate obj;
    obj.accept();
    obj.display();
    obj.setDd(22);
   cout<<"Date: "<<obj.getDd();
    return 0;
}
