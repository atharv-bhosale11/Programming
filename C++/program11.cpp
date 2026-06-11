#include<iostream>
using namespace std;

#pragma pack(1)
class ArrayX
{
    public:
        int *Arr;
        int iSize; 
        //default constructor
        ArrayX()
        {
            
        }

        // parametrized constructor
        ArrayX(int X)
        {

        }
        
};

int main()
{   
    ArrayX aobj1;       // default
    ArrayX aboj2(5);    // parameter

    cout<<sizeof(aobj1)<<endl;

    return 0;
}
