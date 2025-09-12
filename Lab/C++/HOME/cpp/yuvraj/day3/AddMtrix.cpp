#include <iostream>

using namespace std;

int main() {
    cout << "\n\nWelcome to Studytonight :-)\n\n\n";
    cout << " =====  Program to demonstrate Addition of two Matrices ===== \n\n";

    //loop variable i to iterate rows and j to iterate columns.
    int row, col, i, j;

    //Declaring the 3 matrices (2D arrays) m1-first matrix, m2- second matrix and sum- stores the addition of the two matrices
    int m1[10][10], m2[10][10], sum[10][10];

    cout << "\n\nEnter the number of Rows and Columns of matrix : ";
    cin >> row >> col;

    cout << "\nEnter the " << row * col << " elements of first matrix : \n";

    for (i = 0; i < row; i++) {
        for (j = 0; j < col; j++) {
            cin >> m1[i][j];
        }
    }

    cout << "\nEnter the " << row * col << " elements of second matrix : \n";

    for (i = 0; i < row; i++) {
        for (j = 0; j < col; j++) {
            cin >> m2[i][j];
        }
    }

    //calculating the sum matrix
    for (i = 0; i < row; i++) {
        for (j = 0; j < col; j++) {
            sum[i][j] = m1[i][j] + m2[i][j];
        }
    }

    cout << "\n\nThe first matrix is : \n";

    for (i = 0; i < row; i++) {
        for (j = 0; j < col; j++) {
            cout << m1[i][j] << "  ";
        }
        cout << endl;
    }

    cout << "\n\nThe second matrix is : \n";

    for (i = 0; i < row; i++) {
        for (j = 0; j < col; j++) {
            cout << m2[i][j] << "  ";
        }
        cout << endl;
    }

    cout << "\n\nThe Sum matrix is : \n";

    for (i = 0; i < row; i++) {
        for (j = 0; j < col; j++) {
            cout << sum[i][j] << "  ";
        }

        cout << endl;
    }

    cout << "\n\n";

    return 0;
}