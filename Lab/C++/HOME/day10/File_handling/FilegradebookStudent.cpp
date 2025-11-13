#include<iostream>
#include<vector>
using namespace std;

class Student{
    int rollNo;
    string name;
    int mark[3];
    int total;
    public:
    Student(int r=0,string n="",int m1=0,int m2=0,int m3=0){
        rollNo=r;
        name=n;
        mark[0]=m1;
        mark[1]=m2;
        mark[2]=m3;
        if(mark[0]<0||mark[0]<100){
           throw runtime_error("mark are not negative:");
        }

    }

    int getRollno(){
        return rollNo;

    }
    string getname(){
        return name;
    }
    int getTotalMark(){
       total=mark[0]+mark[1]+mark[2];
       return total;
    }
    int getavg(){
        int avg=total/3.0;
    }
     Student& operator++(){
    for(int i=0; i<3;i++){
        if(mark[i]<100){
            mark[i]++;
        }

    }
    return *this;

    }
    bool operator>(Student& st){
        if(st.getavg()<getavg()){
            return getavg();
        }

    }


};

class gradeBook{


    vector<Student>stud;
    
 
};