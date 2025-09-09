#include <iostream>
using namespace std;
class cdate{


    int dd,mm,yy;
    public:
     cdate();
     cdate(int a ,int b,int c);
     void show();
    


};

cdate::cdate(){
    dd=mm=yy=0;

}
cdate ::cdate(int a,int b,int c){
    dd=a;
    mm=b;
    yy=c;
}
void cdate :: show(){
    cout<<dd<<"/"<<mm<<"/"<<yy<<endl;
}
int main(){
    // cdate c(1,9,2025);
    // // cdate c();
    // c.show();

    // using pointer
    cdate *ptr=new cdate(31,8,2025);
    ptr->show();
    delete ptr;
}