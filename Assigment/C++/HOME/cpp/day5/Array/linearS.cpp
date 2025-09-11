#include<iostream>
using namespace std;

int main(){
    int n;
    cout << "Enter the size of array: ";
    cin >> n;

    int arr[n];
    cout << "Enter elements: ";
    for(int i=0;i<n;i++){
        cin >> arr[i];
    }

    int key;
    cout << "Enter the element to be searched: ";
    cin >> key;

    for(int i=0;i<n;i++){
        if(arr[i]==key){
            cout << "Element found at index: " << i << endl;
            return 0;
        }
    }

    cout << "Element not found!" << endl;
    return 0;
}
