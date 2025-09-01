#include<iostream>
using namespace std;
class Student{
    public:
     int roll;
     char date[10];
     int mark;

    void display();
    void accept();
   
};

void Student :: accept(){
    cout<<"Enter the Roll Number: ";
    cin>>roll;
    cout<<"Enter the Date Of Birth: ";
    cin>>date;
    cout<<"Enter the Mark: ";
    cin>>mark;
} 
void Student :: display(){
    cout<<"Roll number Of Student : "<<roll<<endl;
     cout<<"Date of Birth  Of Student : "<<date<<endl;
      cout<<"Mark Of Student : "<<mark<<endl;

}

int main(){
    int n,j;
    cout<<"Enter the No Of Student :";
    cin>>n;
    
 Student s[n];
    for(int i=0;i<n;i++){
       
        s[i].accept();
    }
     for(int i=0;i<n-1;i++){
        for(int j=0;j<n-1-i;j++){
            if(s[j].roll> s[j+1].roll){
                int temp = s[j].roll;
                s[j].roll = s[j+1].roll;
                s[j+1].roll = temp;
            }
        }
    }
    cout<<"\n\n\n\n";
    cout<<"Display the Data of student !"<<endl;
    for(int i=0;i<n;i++){
       
        s[i].display();
        cout<<" "<<i<<endl;
    }
}
