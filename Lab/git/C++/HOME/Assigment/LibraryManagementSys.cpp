#include<iostream>

using namespace std;

class Book
{
    int bookId;
    string title;
    string author;
    double price;
    public:
    Book(int id=0,string t="",string aut="",double p=0.0){
        bookId=id;
        title=t;

        author=aut;
        price=p;
    }
    int getBookId(){
        return bookId;
    }
    string getTitle(){
        return title;
    }
    string getAuthor(){
        return author;
    }
    double getPrice(){
        return price;
    }
    void setprice(int p){
        price=p;
    }
   virtual void displayDetails(){
    cout<<"Book Id:"<<bookId<<endl;
    cout<<"Title: "<<title<<endl;
    cout<<"Authot: "<<author<<endl;

    }

};

class BorrowedBook: public Book
{

    string BorrowerName;
    string duDate;
    public:
    BorrowedBook(string name="",string date=" "){
        BorrowerName=name;
        duDate=date;
    }
    void displayDetails(){
        cout<<"Borroer Name:"<<BorrowerName<<endl;
        cout<<"Du Date : "<<duDate<<endl;
    }

   Book& operator++( ){

    setprice(getPrice()+10);

    }

};
class ReferenceBook: public BorrowedBook
{


};

class User{
    protected:
    string name;

    public:
    virtual string getRole()=0;


};
class Student:public User{
public:
 Student(string n=""){
    name=n;
 }
 void borrowedBook(Book& b){
    cout<<name<<"Borrowed: "<<b.getTitle()<<endl;
 }

};

class Librarian:public User{
    public:
    Librarian(string n=""){}
    string getRole(){
        return "Librarian: "+name;
    }
    void addBook(Book &b){
        cout<<"Librarian Added Book: "<<b.getTitle()<<endl;
    }

};