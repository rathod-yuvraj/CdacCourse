#include<iostream>
using namespace std;

void maxSubArray(int arr[], int n, int k) {


    int maxSum = 0;
    
    for (int i = 0; i < k; i++) {
        maxSum += arr[i];
    }

     int windowSum = maxSum;

    for (int i = k; i <n; i++) {
        cout<<"value of i: "<<i<<"\t"<<"value of k: "<<k<<endl;
         windowSum += arr[i] - arr[i - k];
         cout << "Maximum: "<<windowSum << endl;
        //  maxSum = max(maxsum, windowSum);
           if (windowSum > maxSum)
           maxSum = windowSum;
     }

    cout << "Maximum sum of subarray of size " << k << " is: " << maxSum << endl;
}

int main() {
    int maxa[10] = {10,20,30,40,50,60,80,90};  // Only first 5 are used
    int usedSize = 5;
    maxSubArray(maxa, usedSize, 2);
}
