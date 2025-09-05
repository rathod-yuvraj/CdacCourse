#include <iostream>
using namespace std;

int maxSumSubarray(int arr[], int n, int k) {
    
    int window_sum = 0;
    for (int i = 0; i < k; i++) {
        window_sum += arr[i];
    }

    int max_sum = window_sum;

    
    for (int i = k; i < n; i++) {
        window_sum += arr[i] - arr[i - k];
        if (window_sum > max_sum)
            max_sum = window_sum;
    }

    return max_sum;
}

int main() {
    int arr1[] = {100, 200, 300, 400};
    int n1 = sizeof(arr1) / sizeof(arr1[0]);
    int k1 = 2;
    cout << maxSumSubarray(arr1, n1, k1) << "\n";  // Output: 700

    int arr2[] = {1, 4, 2, 10, 23, 3, 1, 0, 20};
    int n2 = sizeof(arr2) / sizeof(arr2[0]);
    int k2 = 2;
    cout << maxSumSubarray(arr2, n2, k2) << "\n";  // Output: 39

    int arr3[] = {2, 3};
    int n3 = sizeof(arr3) / sizeof(arr3[0]);
    int k3 = 1;
    cout << maxSumSubarray(arr3, n3, k3) << "\n";  // Output: 3

    return 0;
}
