#include <iostream>
using namespace std;

class Student{
    int roll;
    char name[10];
    public:
    void accept();
    void display();
    void sorting(Student arr[]);
    ~Student();
    
};
void Student :: accept(){
    cout<<"Enter the Name: ";
    cin>>name;
     cout<<"Enter the Roll Number: ";
    cin>>roll;
}
void Student ::display(){
    cout<<"Name Of Student: "<<name<<endl;
    cout<<"Roll Number of Student: "<<roll<<endl;
}
Student ::~Student(){
    cout<<"Destroctor is call"<<endl;
}
void Student ::sorting(Student s[]){
    int i,j,n;
    for(i=0;i<n;i++){
        for(j=0;j<n-i;j++){
            if(s[j].roll>s[j+1].roll){
                // int temp=s[j].roll;
                // s[j].roll=s[j+1].roll;
                // s[j+1].roll=temp;
                s[j].roll=s[j].roll   + s[j+1].roll;
                s[j].roll=s[j].roll   - s[j+1].roll;
                s[j+1].roll=s[j].roll - s[j+1].roll;
               
            }

        }
    }
}
int main(){

    int n,i,j;
    cout<<"Enter the number of Student Data: ";
    cin>>n;
    Student* s=new Student[n];
    cout<<"Acccept the Data ! "<<endl;
    for(i=0;i<n;i++){
         s[i].accept();
         cout<<"**********************"<<endl;

    }
   
    cout<<"\n\n\n";
    cout<<"Display the Date! "<<endl;
    for(i=0;i<n;i++)
    (s+i)->display();

    delete[] s;
}
