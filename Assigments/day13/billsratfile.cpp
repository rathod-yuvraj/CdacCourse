#include <iostream>
#include <fstream>
#include <vector>
#include <string>
#include <stdexcept>

using namespace std;

class Item {
private:
    int itemID;
    string itemName;
    double price;
    int stockQuantity;

public:
    Item(int id = 0, string name = "", double p = 0.0, int stock = 0)
        : itemID(id), itemName(name), price(p), stockQuantity(stock) {
        if (price < 0 || stockQuantity < 0)
            throw invalid_argument("Price and quantity must be non-negative.");
    }

    // Getters
    int getItemID() const { return itemID; }
    string getItemName() const { return itemName; }
    double getPrice() const { return price; }
    int getStockQuantity() const { return stockQuantity; }

    // Purchase item (decrement stock)
    void purchase(int quantity) {
        if (quantity > stockQuantity)
            throw runtime_error("Not enough stock available.");
        stockQuantity -= quantity;
    }

    // Restore stock (for future feature like returns)
    void restore(int quantity) {
        stockQuantity += quantity;
    }
};

// Purchased Item wrapper
struct PurchasedItem {
    Item item;
    int quantity;

    PurchasedItem(Item it, int qty) : item(it), quantity(qty) {}
};

class Bill {
private:
    int billID;
    string customerName;
    vector<PurchasedItem> purchasedItems;

public:
    Bill(int id = 0, string name = "") : billID(id), customerName(name) {}

    // Add item to bill with quantity
    Bill& operator+(pair<Item&, int> purchaseInfo) {
        Item& item = purchaseInfo.first;
        int quantity = purchaseInfo.second;

        if (quantity <= 0)
            throw invalid_argument("Quantity must be positive.");

        item.purchase(quantity);  // Decrement stock
        purchasedItems.emplace_back(item, quantity);
        return *this;
    }

    // Display bill
    friend ostream& operator<<(ostream& os, const Bill& b) {
        if (b.purchasedItems.empty())
            throw runtime_error("Cannot display an empty bill.");

        os << "Bill ID: " << b.billID << "\n";
        os << "Customer Name: " << b.customerName << "\n";
        os << "Purchased Items:\n";
        double total = 0.0;
        for (const auto& pi : b.purchasedItems) {
            double subtotal = pi.item.getPrice() * pi.quantity;
            os << " - " << pi.item.getItemName()
               << " | Price: " << pi.item.getPrice()
               << " | Qty: " << pi.quantity
               << " | Subtotal: " << subtotal << "\n";
            total += subtotal;
        }
        os << "Total: " << total << "\n";
        return os;
    }

    // Save bill to file
    void saveToFile(const string& filename = "bills.txt") const {
        if (purchasedItems.empty())
            throw runtime_error("Cannot save an empty bill.");

        ofstream outFile(filename, ios::app);
        if (!outFile)
            throw runtime_error("Unable to open file.");

        outFile << "Bill ID: " << billID << "\n";
        outFile << "Customer Name: " << customerName << "\n";
        outFile << "Purchased Items:\n";
        double total = 0.0;
        for (const auto& pi : purchasedItems) {
            double subtotal = pi.item.getPrice() * pi.quantity;
            outFile << pi.item.getItemID() << ","
                    << pi.item.getItemName() << ","
                    << pi.item.getPrice() << ","
                    << pi.quantity << ","
                    << subtotal << "\n";
            total += subtotal;
        }
        outFile << "Total: " << total << "\n";
        outFile << "-------------------------\n";
        outFile.close();
    }

    // Load existing bills from file (static utility)
    static void loadBills(const string& filename = "bills.txt") {
        ifstream inFile(filename);
        if (!inFile) {
            cout << "No previous bills found.\n";
            return;
        }

        cout << "----- Previous Bills -----\n";
        string line;
        while (getline(inFile, line)) {
            cout << line << "\n";
        }
        cout << "--------------------------\n";
        inFile.close();
    }
};

int main() {
    try {
        // Load old bills
        Bill::loadBills();

        // Create items
        Item laptop(1, "Laptop", 800.0, 10);
        Item mouse(2, "Mouse", 25.0, 50);
        Item keyboard(3, "Keyboard", 45.0, 30);

        // Create a new bill
        Bill bill1(1001, "Alice");

        // Add items to bill using overloaded +
        bill1 + make_pair(ref(laptop), 1);
        bill1 + make_pair(ref(mouse), 2);
        bill1 + make_pair(ref(keyboard), 1);

        // Print bill to console
        cout << bill1;

        // Save bill to file
        bill1.saveToFile();
    }
    catch (const exception& e) {
        cerr << "Error: " << e.what() << "\n";
    }

    return 0;
}
