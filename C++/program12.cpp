#include<iostream>
using namespace std;

#pragma pack(1)
class ArrayX
{
    public:
        int *Arr;
        int iSize; 

        // parametrized constructor
        ArrayX(int X)
        {   
            cout<<"Inside Constructor\n";
            iSize = X;                  // Characterstics Initialisation
            Arr = new int[iSize];       // Resource Allocation
        }

        // Destrcutor
        ~ArrayX()                       
        {
            cout<<"Inside Destructor\n";
            delete []Arr;               //  // Resource De-allocation 
        }
};

int main()
{   
    ArrayX aobj1(5);    

    return 0;
}
