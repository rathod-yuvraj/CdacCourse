#include <iostream>
using namespace std;
class cdate{

    int dd,mm,yy;
    public:
    cdate(){
 
        dd=mm=yy=0;
    }
    cdate(int,int,int);
    void accept();
    void display();
    ~cdate(){
        cout<<"Display the date: "<<endl;
        
    }
};
void cdate::accept(){
    cout<<"Enter the date: ";
    cin>>mm>>dd>>yy;
}
void cdate::display(){
    cout<<"Date: "<<dd<<"\t"<<"Month: "<<mm<<"\t"<<"Year: "<<yy;
}
cdate::cdate(int a,int b,int c){
    dd=a;
    mm=b;
    yy=c;
}

int main(){
    cdate* obj=new cdate(22,8,2025);
    obj->display();
    
    obj->accept();
     obj->display();

}