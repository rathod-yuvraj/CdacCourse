#include <iostream>
using namespace std;
int main(){
    int n,m,i,j;
    int arr[n][m];
    cout<<"Enter the row:";
    cin>>n;
    cout<<"\nEnter the columns: ";
    cin>>m;
    for(i=0;i<n;i++){
        for(j=0;j<m;j++){
            cin>>arr[i][j];
        }
    }
    cout<<"Display the Matrix \n";
     for(i=0;i<n;i++){
        cout<<" ";
        for(j=0;j<m;j++){
            cout<<arr[i][j];
        }
        cout<<" "<<endl;
    }
    int sum=0;
    cout<<"Sum Of Matrix!"<<endl;
     for(i=0;i<n;i++){
        for(j=0;j<m;j++){
           sum+=arr[i][j];
        }
    }
    
}