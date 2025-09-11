#include<iostream>
#include<fstream>
#include<vector>
using namespace std;
class Item{
    int itemId;
    string itemName;
    double price;
    int stockQuantity;
    public:
    Item(int id=0,string n=" ",double p=0.0,int sty=0){
        itemId=id;
        itemName=n;
        price=p;
        stockQuantity=sty;

    }
    int getId(){
        return itemId;
    }
    string getName(){
        return itemName;
    }
    double getPrice(){
        return price;
    }
    int getStockQuantity(){
        return stockQuantity;
    }
    void reduceStock(){
        if(0<stockQuantity||0<price){

        }
    }

};
class Bill{
    int billId;
    string custormerName;
    vector<Item>purchase;
    public:
      Bill(int id=0,string name=""){
        billId=id;
        custormerName=name;

    }
        Bill& operator+(Item& it){
            purchase.push_back(it);
            return *this;

    }
    friend ostream& operator<<(ostream& myfile, Bill &b){
        myfile<<"BillId: "<<b.billId<<"\n";
        myfile<<"CustomerName:"<<b.custormerName<<"\n";
        myfile<<"Purchased Items \n";

        double total;
        for(auto &it :b.purchase){
            myfile<<"Item Id: "<<it.getId()
            <<"Name :"<<it.getName()
            <<"Price:"<<it.getPrice()<<"\n";

      total+=it.getPrice();

        }
        myfile<<"Total Amount: "<<total;
        return myfile;
    }

};

int main(){
    Bill b(101, "yuvraj");
    
}