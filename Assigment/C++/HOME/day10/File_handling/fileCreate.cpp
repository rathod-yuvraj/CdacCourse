#include<iostream>
#include<fstream> // for file handling
using namespace std;
int main(){
    ofstream myfile("yuvraj.txt");
    myfile<<"suyog is not able to understand file handling in c++";
    myfile<<"\nthis file has be end";
    myfile.close();
    return 0;

}