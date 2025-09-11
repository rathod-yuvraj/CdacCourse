#include<iostream>
#include <vector>
using namespace  std;
class Student
{
    int rollno;
    string name;
    int marks[3];
    double avg;
    public:
    Student(int r=0,string n="",int m1=0 ,int m2=0,int m3=0)
    {
        rollno=r;
        name=n;
        marks[0]=m1;
        marks[1]=m2;
        marks[2]=m3;

    }
    int roll_no()
    {
        return rollno;

    }
    string getname()
    {
        return name;
    }
    int getmark()
    {
        for(int i=0;i<3;i++)
        {
            return marks[i];
        }
    }
    double getavg(){
        return (marks[0]+marks[1]+marks[2])/3;
    }
    void accpet()
    {
        cout<<"Enter roll number"<<endl;
        cin>>rollno;
        cout<<"Enter name"<<endl;
        cin>>name;
        for(int i=0;i<3;i++)
        {
        cout<<"Enter marks for "<<i+1<<endl;
        cin>>marks[i];
        }
    }
    void display()
    {
        cout<<"roll number = "<<rollno<<endl;
        cout<<"Enter name is "<<name<<endl;
        for(int i=0;i<3;i++)
        {
        cout<<"marks for subject "<<i+1<<" "<<marks[i]<<endl;
        }
    }

};
class gradebook
{
    vector <Student> Stud;
    public:
    void addstud(Student & s)
    {
        Stud.push_back(s);
    }
    void displayall()
    {
        for(auto&s : Stud)
        {
            s.display();
        }
    }
};
int main()
{
    Student s1;
    s1.accpet();
    s1.display();
    cout<<s1.getavg();
    gradebook g1;
    g1.addstud(s1);
    g1.displayall();
}