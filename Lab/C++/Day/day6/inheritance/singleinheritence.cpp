#include <iostream>  
using namespace std;  

class Account {  
    float bonus = 2000;  
public:
    float getBonus() // Change return type to float
    {
        return bonus;
    }
};  
class Programmer: public Account {  
public:  
    float monthly_salary = 5000;  
    void CalculateSalary()
    {
        cout << "Total Salary: " << monthly_salary + getBonus() << endl;  
    }
};       
int main() {  
    Programmer p1;  
    p1.CalculateSalary(); // Call the CalculateSalary function
    return 0;  
}
