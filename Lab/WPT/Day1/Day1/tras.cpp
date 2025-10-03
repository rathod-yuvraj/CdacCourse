#include <iostream>
using namespace std;
 int a[10][10];
    int n = 2;
void accept()
{
    
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cin >> a[i][j];
        }
       
    }
     int tran[10][10];
    
    for (int i = 0; i < n; i++)
    {
        
        for (int j = 0; j < n; j++)
        {
            tran[i][j]=a[j][i];
            cout<< tran[i][j];
            cout<<" ";
        }
        cout<<endl;
    }
}
void display()
{
  
    for (int i = 0; i < n; i++)
    {
        
        for (int j = 0; j < n; j++)
        {
            cout<< a[i][j];
            cout<<" ";
        }
         cout<<endl;
    }
}
void trans()
{
    int tran[10][10];
    
    for (int i = 0; i < n; i++)
    {
        
        for (int j = 0; j < n; j++)
        {
            tran[i][j]=a[j][i];
            cout<< tran[i][j];
            cout<<" ";
        }
        cout<<endl;
    }
}
int main()
{
    cout << "Enter the number:  ";
    accept();
    cout<<"\n\n";
    display();
     cout<<"\n";
    trans();
}