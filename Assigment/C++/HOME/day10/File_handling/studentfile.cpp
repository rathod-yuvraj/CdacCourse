#include <iostream>
#include <fstream>
#include <vector>
#include <stdexcept>
#include <string>
using namespace std;

/* --- Student Class --- */
class Student {
    int rollNo;
    string name;
    int marks[3];
public:
    Student(int r=0,string n="",int m1=0,int m2=0,int m3=0)
        : rollNo(r),name(n){
        marks[0]=m1; marks[1]=m2; marks[2]=m3;
        for(int i=0;i<3;i++){
            if(marks[i]<0||marks[i]>100){
                throw invalid_argument("Invalid marks for roll " + to_string(rollNo));
            }
        }
    }

    int getRoll() const { return rollNo; }

    void show() const {
        cout << "Roll: " << rollNo 
             << ", Name: " << name 
             << ", Marks: " << marks[0] << " " << marks[1] << " " << marks[2] << endl;
    }

    // Pre-increment (increments marks by 1)
    Student& operator++() {
        for(int i=0;i<3;i++) if(marks[i]<100) marks[i]++;
        return *this;
    }

    // Post-increment
    Student operator++(int){
        Student temp = *this;
        ++(*this); // calls pre-increment
        return temp;
    }

    // Save student to stream
    void saveToStream(ofstream& out) const {
        out << rollNo << " " << name << " " 
            << marks[0] << " " << marks[1] << " " << marks[2] << "\n";
    }

    // Load student from stream
    static Student loadFromStream(ifstream& in){
        int r,m1,m2,m3;
        string n;
        if(!(in >> r >> n >> m1 >> m2 >> m3)) return Student(); // end-of-file
        return Student(r,n,m1,m2,m3);
    }
};

/* --- Gradebook --- */
class Gradebook {
    vector<Student> students;
    string file;
public:
    Gradebook(string f):file(f){ load(); }

    void add(const Student& s){
        for(auto &x:students) 
            if(x.getRoll()==s.getRoll()){
                throw runtime_error("Duplicate roll number " + to_string(s.getRoll()));
            }
        students.push_back(s); 
        save();
    }

    void showAll(){
        if(students.empty()) 
            throw runtime_error("Gradebook is empty!");
        for(auto &s:students) s.show();
    }

    void save(){
        ofstream out(file);
        for(auto &s:students) s.saveToStream(out);
    }

    void load(){
        students.clear();
        ifstream in(file);
        while(in){
            Student s = Student::loadFromStream(in);
            if(s.getRoll()!=0) students.push_back(s);
        }
    }
};

/* --- Demo --- */
int main(){
    try {
        Gradebook gb("students.txt");
        gb.add(Student(1,"Raj",90,80,70));
        gb.add(Student(2,"Amit",85,75,65));
        gb.showAll();
    }
    catch(exception &e){
        cerr << "Error: " << e.what() << endl;
    }
    return 0;
}
