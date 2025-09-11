#include<iostream>
using namespace std;

enum Day {
    sunday = 65, // 'A'
    monday,      // 'B'
    tuesday,     // 'C'
    wednesday,   // 'D'
    thursday,    // 'E'
    friday,      // 'F'
    saturday     // 'G'
};

int main() {
    int input;
    cout << "Enter a number (0 for sunday, 1 for monday, ...): ";
    cin >> input;

    // Make sure input is valid (0-6)
    if (input < 0 || input > 6) {
        cout << "Invalid day number!";
        return 1;
    }

    Day today = static_cast<Day>(input);  // Convert input number to enum Day
    cout << "Today is ";

    switch (today) {
        case sunday:
            cout << "Sunday";
            break;
        case monday:
            cout << "Monday";
            break;
        case tuesday:
            cout << "Tuesday";
            break;
        case wednesday:
            cout << "Wednesday";
            break;
        case thursday:
            cout << "Thursday";
            break;
        case friday:
            cout << "Friday";
            break;
        case saturday:
            cout << "Saturday";
            break;
        default:
            cout << "Invalid day!";
            break;
    }

    cout << endl;
    return 0;
}
