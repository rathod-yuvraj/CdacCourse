#include <iostream>
#include<fstream>
using namespace std;

int main(){

    fstream myfile('yuvraj.txt');
    if(!myfile){

        cout<<"Error Of file opening !!";
    }
    
    myfile.close();
}