#include <iostream>
#include <fstream>
#include <vector>

using namespace std;

class Item {
    int itemId;
    string itemName;
    double price;

public:
    
    Item(int id = 0, string name = "", double p = 0.0)
        : itemId(id), itemName(name), price(p) {

        }

    int getItemId() const {
        return itemId;
    }

    string getItemName() const {
        return itemName;
    }

    double getItemPrice() const {
        return price;
    }
};

class Bill {
    int billId;
    string customerName;
    vector<Item> purchased;

public:
    Bill(int id = 0, string name = "") : billId(id), customerName(name) {}

    // Overload '+' to add item
    Bill& operator+(const Item& item) {
        purchased.push_back(item);
        return *this;
    }

    // Save to file
    void saveFile() const {
        ofstream myfile("bill.txt", ios::app);
        myfile << "Bill ID: " << billId << "\n";
        myfile << "Customer Name: " << customerName << "\n";
        myfile << "Purchased Items:\n";

        double total = 0.0;
        for (const auto& it : purchased) {
            myfile << "Item ID: " << it.getItemId()
                   << ", Name: " << it.getItemName()
                   << ", Price: " << it.getItemPrice() << "\n";
            total += it.getItemPrice();
        }

        myfile << "Total Amount: " << total << "\n";
        myfile << "--------------------------\n";
        myfile.close();
    }

    // Overload << to print the bill
    friend ostream& operator<<(ostream& out,Bill& b) {
        out << "Bill ID: " << b.billId << "\n";
        out << "Customer Name: " << b.customerName << "\n";
        out << "Purchased Items:\n";
        double total = 0.0;
        for (auto& it : b.purchased) {
            out << "Item ID: " << it.getItemId()
                << ", Name: " << it.getItemName()
                << ", Price: " << it.getItemPrice() << "\n";
            total += it.getItemPrice();
        }
        out << "Total Amount: " << total << "\n";
        return out;
    }
};

int main() {
    try {
        Bill bill(101, "Yuvraj");
        Item item1(1, "Pen", 1.5);
        Item item2(2, "Notebook", 3.75);
        Item item3(3, "Pencil", 0.99);

        bill + item1 + item2 + item3;

        cout << bill;

        bill.saveFile();
    }
    catch (...) {
        cerr << "An error occurred.\n";
    }

    return 0;
}
