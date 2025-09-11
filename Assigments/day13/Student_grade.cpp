#include <iostream>
#include <vector>
#include <fstream>
#include <stdexcept>
#include <iomanip>
#include <algorithm>

using namespace std;

class Student {
private:
    int rollNo;
    string name;
    double marks[3];

public:
    Student(int r = 0, string n = "", double m1 = 0, double m2 = 0, double m3 = 0)
        : rollNo(r), name(n) {
        setMarks(m1, m2, m3);
    }

    void setMarks(double m1, double m2, double m3) {
        if (m1 < 0 || m2 < 0 || m3 < 0 || m1 > 100 || m2 > 100 || m3 > 100) {
            throw invalid_argument("Marks must be between 0 and 100.");
        }
        marks[0] = m1;
        marks[1] = m2;
        marks[2] = m3;
    }

    int getRollNo() const { return rollNo; }
    string getName() const { return name; }
    double* getMarks() { return marks; }

    double average() const {
        return (marks[0] + marks[1] + marks[2]) / 3.0;
    }

    // Overload ++ to give bonus marks (+1 to each subject)
    Student& operator++() {
        for (int i = 0; i < 3; i++) {
            if (marks[i] < 100) marks[i]++;
        }
        return *this;
    }

    // Overload > to compare by average marks
    bool operator>(const Student& other) const {
        return this->average() > other.average();
    }

    // Display student
    void display() const {
        cout << "Roll No: " << rollNo
             << ", Name: " << name
             << ", Marks: [" << marks[0] << ", " << marks[1] << ", " << marks[2] << "]"
             << ", Average: " << fixed << setprecision(2) << average() << "\n";
    }

    // Save to file (CSV format)
    string toCSV() const {
        return to_string(rollNo) + "," + name + "," +
               to_string(marks[0]) + "," + to_string(marks[1]) + "," + to_string(marks[2]);
    }

    // Load from file
    static Student fromCSV(const string& line) {
        stringstream ss(line);
        string token;
        int roll;
        string name;
        double m[3];

        getline(ss, token, ',');
        roll = stoi(token);

        getline(ss, name, ',');

        for (int i = 0; i < 3; ++i) {
            getline(ss, token, ',');
            m[i] = stod(token);
        }

        return Student(roll, name, m[0], m[1], m[2]);
    }
};

class Gradebook {
private:
    vector<Student> students;

public:
    // Add student
    void addStudent(const Student& s) {
        for (const auto& st : students) {
            if (st.getRollNo() == s.getRollNo()) {
                throw runtime_error("Duplicate roll number detected.");
            }
        }
        students.push_back(s);
    }

    // Search by roll no
    Student* search(int rollNo) {
        for (auto& s : students) {
            if (s.getRollNo() == rollNo)
                return &s;
        }
        return nullptr;
    }

    // Overload << to print all students
    friend ostream& operator<<(ostream& os, const Gradebook& g) {
        if (g.students.empty())
            throw runtime_error("Gradebook is empty.");
        os << "---- Student Records ----\n";
        for (const auto& s : g.students)
            s.display();
        os << "-------------------------\n";
        return os;
    }

    // Save to file
    void saveToFile(const string& filename = "gradebook.txt") const {
        ofstream out(filename);
        for (const auto& s : students) {
            out << s.toCSV() << "\n";
        }
        out.close();
    }

    // Load from file
    void loadFromFile(const string& filename = "gradebook.txt") {
        ifstream in(filename);
        string line;
        while (getline(in, line)) {
            if (!line.empty()) {
                Student s = Student::fromCSV(line);
                try {
                    addStudent(s);  // will skip duplicates
                } catch (...) {
                    // Skip duplicates silently
                }
            }
        }
        in.close();
    }

    // Update marks
    void updateMarks(int rollNo, double m1, double m2, double m3) {
        Student* s = search(rollNo);
        if (s) {
            s->setMarks(m1, m2, m3);
        } else {
            throw runtime_error("Student not found.");
        }
    }

    // Bonus marks
    void applyBonus(int rollNo) {
        Student* s = search(rollNo);
        if (s) {
            ++(*s); 
        } else {
            throw runtime_error("Student not found.");
        }
    }

  
    void compare(int roll1, int roll2) {
        Student* s1 = search(roll1);
        Student* s2 = search(roll2);
        if (!s1 || !s2) throw runtime_error("One or both students not found.");
        if (*s1 > *s2)
            cout << s1->getName() << " has a higher average than " << s2->getName() << ".\n";
        else if (*s2 > *s1)
            cout << s2->getName() << " has a higher average than " << s1->getName() << ".\n";
        else
            cout << "Both have equal average marks.\n";
    }
};
