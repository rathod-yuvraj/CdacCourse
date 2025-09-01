#include <iostream>
using namespace std;
void Sorting(){
    int arr[] = {323, 54, 67, 98, 15, 68};
    int n = sizeof(arr) / sizeof(arr[0]);
    cout << "Length of Array Elements: " << n << endl;
    int arr1[n];
    int first=arr[0];
    for(int i=0;i<n;i++){
        if(first<arr[i]){
        arr1[i]=arr[i];
        }
    }
    cout<<"Display the Array "<<endl;
     for(int i=0;i<n;i++){
        cout<<arr1[i];
    }


}

int main() {
    int arr[] = {323, 54, 67, 98, 15, 68};
    int n = sizeof(arr) / sizeof(arr[0]);
    cout << "Length of Array Elements: " << n << endl;
    int frist, second;

    if (arr[0] > arr[1]) {
        frist = arr[0];
        second = arr[1];
    } else {
        frist = arr[1];
        second = arr[0];
    }
        for (int i = 2; i < n; i++) {
        if (arr[i] > frist) {
            second = frist;
            frist = arr[i];
        } else if (arr[i] > second && arr[i] != frist) {
            second = arr[i];
        }
    }
        cout << "Second Largest Element in Array: " << second << endl;
    return 0;


}