#include <iostream>
#include <fstream>
#include <vector>
#include <stdexcept>
using namespace std;

class Item {
    int itemId;
    string itemName;
    double price;
    int stockQuantity;

public:
    Item(int id = 0, string name = "", double p = 0.0, int stock = 0)
        {
            itemId = id;
            itemName = name;
            price = p;
            stockQuantity = stock;


        if (p < 0 || stock < 0) {
            throw invalid_argument("Price and stock cannot be negative!");
        }
         if (itemName.empty()) {
        throw invalid_argument("Item name cannot be empty!");
    }
    }
    

    int getItemId() const { return itemId; }
    string getItemName() const { return itemName; }
    double getItemPrice() const { return price; }
    int getStockQuantity() const { return stockQuantity; }

    void reduceStock(int qty) {
        if (qty > stockQuantity) {
            throw runtime_error("Not enough stock available for item: " + itemName);
        }
        stockQuantity -= qty;
    }
};

class Bill {
    int billId;
    string customerName;
    vector<Item> purchased;

public:
    Bill(int id = 0, string name = "")  {
        billId = id;
        customerName = name;
    }
    Bill& operator+(Item& item) {
        if (item.getStockQuantity() <= 0)
            throw runtime_error("Item out of stock: " + item.getItemName());
        item.reduceStock(1);
        purchased.push_back(item);
        return *this;
    }

    // Save bill to file
    void saveFile() const {
        if (purchased.empty())
            throw runtime_error("Cannot save empty bill!");

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

    
    friend ostream& operator<<(ostream& outfile, Bill& b) {
        if (b.purchased.empty())
            throw runtime_error("Cannot display empty bill!");

        outfile << "Bill ID: " << b.billId << "\n";
        outfile << "Customer Name: " << b.customerName << "\n";
        outfile << "Purchased Items:\n";
        double total = 0.0;
        for (auto& it : b.purchased) {
            outfile << "Item ID: " << it.getItemId()
                << ", Name: " << it.getItemName()
                << ", Price: " << it.getItemPrice() << "\n";
            total += it.getItemPrice();
        }
        outfile << "Total Amount: " << total << "\n";
        return outfile;
    }
};

int main() {
    try {
        Bill bill(101, "Yuvraj");
        Item item1(1, "Pen", 15.5, 10);
        Item item2(2, "Notebook", 80.7, 5);
        Item item3(3, "Pencil", 10.4, 4); 

        bill + item1 + item2;
        bill + item3;

        cout << bill;
        bill.saveFile();
    }
    catch (const exception& e) {
        cerr << "Error: " << e.what() << "\n";
    }

    return 0;
}
