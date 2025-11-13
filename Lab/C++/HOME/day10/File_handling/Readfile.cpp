#include<fstream>
#include<iostream>
using namespace std;
int main(){
    
    ifstream myfile("yuvraj.txt");
    string line;
    while(getline(myfile,line)){
        cout<<line<<endl;
    }

    myfile.close();
    return 0;
}