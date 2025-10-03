#include<iostream>
#include<fstream>
using namespace std;
int main(){
    ofstream myfile("yuvraj.txt",ios::app);
    myfile<<"this is the new line added";

    ifstream readfile("yuvraj.txt");
    string line;
    while(getline(readfile,line)){
        cout<<line<<endl;
    }
    myfile.close();
    return 0;
}