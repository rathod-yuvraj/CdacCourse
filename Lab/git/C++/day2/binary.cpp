#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

string addBinary(string a, string b) {
    string result = "";
    int i = a.length() - 1, j = b.length() - 1;
    int carry = 0;
    int max_len = max(a.size(), b.size());
    a = string(max_len - a.size(), '0') + a;
    b = string(max_len - b.size(), '0') + b;
    i = j = max_len - 1; 
    while (i >= 0 || j >= 0 || carry) {
      
        int bitA = (i >= 0) ? a[i] - '0' : 0;
        int bitB = (j >= 0) ? b[j] - '0' : 0;

   
        int total = bitA + bitB + carry;
     
        char sum_bit = '0' + (total % 2);
       
        carry = total / 2;

        result.push_back(sum_bit);


        i--;
        j--;
    }
    reverse(result.begin(), result.end());
    
    
    size_t start_pos = result.find_first_not_of('0');
    if (start_pos != string::npos) {
        return result.substr(start_pos);
    }
    
    return "0";
}

int main() {
    string bin1, bin2;

    cout << "Enter first binary number: ";
    cin >> bin1;
    cout << "Enter second binary number: ";
    cin >> bin2;

    string sum = addBinary(bin1, bin2);
    cout << "Sum (Binary): " << sum << endl;

    return 0;
}