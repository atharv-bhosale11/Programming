#include <iostream>
#include <list>
using namespace std;

int main()
{
    list<int> Numbers;

    Numbers.push_back(10);
    Numbers.push_back(20);
    Numbers.push_back(30);

    Numbers.push_front(5);

    cout << "List Elements: ";

    for(int iNo : Numbers)
    {
        cout << iNo << " ";
    }

    Numbers.pop_front();

    cout << "\nAfter pop_front(): ";

    for(int iNo : Numbers)
    {
        cout << iNo << " ";
    }

    Numbers.pop_back();

    cout << "\nAfter pop_back(): ";

    for(int iNo : Numbers)
    {
        cout << iNo << " ";
    }

    Numbers.remove(20);

    cout << "\nAfter remove(20): ";

    for(int iNo : Numbers)
    {
        cout << iNo << " ";
    }

    cout << endl;

    return 0;
}
