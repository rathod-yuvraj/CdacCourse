#include  <iostream>
using namespace std;

void show ();

void show()
    {
        static int x =0;
        cout <<x<<endl;
        x++;//000
    }
int main()
{
    show();
static int y;
cout<<y;
}