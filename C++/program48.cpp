#include <iostream>
#include <vector>
using namespace std;

int main()
{
    vector<int> Arr;

    Arr.push_back(10); 
    Arr.push_back(20);
    Arr.push_back(30);
    Arr.push_back(40);

    cout << "Vector Elements: ";

    for(int i = 0; i < Arr.size(); i++)
    {
        cout << Arr[i] << " ";
    }

    cout << "\nSize: " << Arr.size();
    cout << "\nElement at index 2: " << Arr.at(2);

    Arr.pop_back();

    cout << "\nAfter pop_back(): ";

    for(int i = 0; i < Arr.size(); i++)
    {
        cout << Arr[i] << " ";
    }

    cout << "\nIs Empty: " << (Arr.empty() ? "Yes" : "No");

    return 0;
}
