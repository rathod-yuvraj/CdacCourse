#include <iostream>
#include <string>
using namespace std;


class Payment {
protected:
    int amount;
public:
    Payment(int amt = 0) { amount = amt; }

    virtual void processPayment() = 0;  
    int getAmount() { return amount; }
    void setAmount(int amt) { amount = amt; }
};

// Credit Card Payment
class CcPayment : public Payment {
    string cardNo;
    string expiry;
public:
    CcPayment(int amt, string card, string exp)
        : Payment(amt), cardNo(card), expiry(exp) {}

    void processPayment() override {
        cout << "Processing Credit Card Payment..." << endl;
        cout << "Card No: " << cardNo << endl;
        cout << "Expiry: " << expiry << endl;
        cout << "Amount: " << amount << endl;
       
    }
};

// UPI Payment
class UpiPayment : public Payment {
    string upiId;
public:
    UpiPayment(int amt, string id) : Payment(amt), upiId(id) {}

    void processPayment() override {
        cout << "Processing UPI Payment..." << endl;
        cout << "UPI Id: " << upiId << endl;
        cout << "Amount: " << getAmount() << endl;
        
    }
};

int main() {
    Payment* p1 = new CcPayment(1000, "1234-5678-9012-3456", "12/25");
    Payment* p2 = new UpiPayment(500, "alice@upi");

    cout << "\n--- Credit Card ---\n";
    p1->processPayment();
        cout << "Credit Card Payment Successful \n";

    cout << "\n--- UPI ---\n";
    p2->processPayment();
    cout << "UPI Payment Successful \n";

    delete p1;
    delete p2;
    return 0;
}
