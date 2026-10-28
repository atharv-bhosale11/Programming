#include <iostream>
#include <stack>
using namespace std;

int main()
{
    stack<int> Numbers;

    Numbers.push(10);
    Numbers.push(20);
    Numbers.push(30);
    Numbers.push(40);

    cout << "Top Element: " << Numbers.top() << endl;
    cout << "Stack Size: " << Numbers.size() << endl;

    Numbers.pop();

    cout << "After pop(), Top Element: "
         << Numbers.top() << endl;

    cout << "Stack Size: " << Numbers.size() << endl;

    cout << "Is Stack Empty: "
         << (Numbers.empty() ? "Yes" : "No") << endl;

    return 0;
}
