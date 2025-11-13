#include <iostream>
using namespace std;
void Sorting() {
    int arr[] = {323, 54, 67, 98, 15, 68};
    int n = sizeof(arr) / sizeof(arr[0]);
    cout << "Length of Array Elements: " << n << endl;
    for (int i = 1; i < n; i++) {
        int key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
    cout << "\nDisplay the Array: " << endl;
    for (int i = 0; i < n; i++) {  
        cout << arr[i] << " ";
    }
}
int main(){
    Sorting();
}