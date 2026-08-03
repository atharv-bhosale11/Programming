#include<iostream>
using namespace std;

template<class X>
X Maximum(X No1, X No2, X No3)
{

    if(No1 > No2 && No1 > No3)
    {
        return No1;
    }
    else if(No2 > No1 && No2 > No3 )
    {
        return No2;
    }
    else
    {
        return No3;
    }
}      

int main()
{   
    cout<<Maximum(21.5f,11.9f,27.7f)<<"\n";
    cout<<Maximum(21,18,12)<<"\n";
    cout<<Maximum(11.4,11.7,8.9)<<"\n";
    
    return 0;   
}
