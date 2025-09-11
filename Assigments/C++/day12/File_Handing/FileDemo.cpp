#include<iostream>
#include<fstream>

using namespace std;
int main()
{

    ofstream myfile("yuvraj.txt");
    if(!myfile){
        cout<<"Error of Open the File!!";
    }
  myfile.close();
}