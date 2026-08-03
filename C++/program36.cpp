#include<iostream>   // Include standard input/output stream library
using namespace std; // Use the standard namespace

// Template function to find the maximum of three values
template<class X>
X Maximum(X No1, X No2, X No3)
{
    // Check if No1 is greater than both No2 and No3
    if(No1 > No2 && No1 > No3)
    {
        return No1; // Return No1 if it is the largest
    }
    // Otherwise, check if No2 is greater than both No1 and No3
    else if(No2 > No1 && No2 > No3 )
    {
        return No2; // Return No2 if it is the largest
    }
    // If neither No1 nor No2 is the largest, then No3 must be
    else
    {
        return No3; // Return No3
    }
}      

int main()
{   
    // Demonstrate template function with different data types
    cout << Maximum(21.5f, 11.9f, 27.7f) << "\n"; // Float comparison
    cout << Maximum(21, 18, 12) << "\n";          // Integer comparison
    cout << Maximum(11.4, 11.7, 8.9) << "\n";     // Double comparison
    
    return 0; // End of program
}
