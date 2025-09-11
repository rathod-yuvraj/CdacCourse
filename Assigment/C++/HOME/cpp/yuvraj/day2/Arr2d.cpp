#include<iostream>
using namespace std;

class Arr2d{
    int arr[3][3];
    int i,j;
    public:
    void accept();
    void display();
};

void Arr2d::accept()
{
    cout <<"Enter the numbers: ";
    for(i=0;i<3;i++){
        for (j=0;j<3;j++){
            //cout <<" ";
            cin>>arr[i][j];
        }
    }
}
void Arr2d::display(){
    cout<<"Display the 2D Array: ";
    for(i=0;i<3;i++){
        for (j=0;j<3;j++){
            //cout <<" ";
            cout<<arr[i][j]<<"\t ";
        }
        cout <<endl;
    }
}
int main (){
    Arr2d a;
    a.accept();
    a.display();
    return 0;
}