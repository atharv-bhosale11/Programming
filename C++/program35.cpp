#include<iostream>   // Include standard input/output stream library
using namespace std; // Use the standard namespace

// Template function to find the maximum of two values
template<class X>
X Maximum(X No1, X No2)
{
    X Ans; // Variable to store the result

    // Compare the two values
    if(No1 > No2)
    {
        Ans = No1; // If first is greater, store No1
    }
    else  
    {
        Ans = No2; // Otherwise, store No2
    }
    return Ans; // Return the maximum value
}

int main()
{   
    // Demonstrate template function with different data types
    cout << Maximum(21.5f, 11.9f) << "\n"; // Float comparison
    cout << Maximum(21, 11) << "\n";       // Integer comparison
    cout << Maximum(21.4, 11.7) << "\n";   // Double comparison
    
    return 0; // End of program
}
