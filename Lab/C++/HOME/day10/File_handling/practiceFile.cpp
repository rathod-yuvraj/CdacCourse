#include<iostream>
#include<fstream>
using namespace std;
int main(){
    string line;
    int n;
    cout<<"Enter the number of line we wants: ";
    cin>>n;

//create
    ofstream file("demo.txt", ios::app);
    for(int i=0;i<n;i++){
       
        getline(cin,line);
        file<<line<<endl;
         cout<<line;
    }

    // /display the display 
    ifstream myfile("demo.txt");
    while(getline(myfile,line)){
        cout<<line;
    }

}