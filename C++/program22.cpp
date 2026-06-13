#include<iostream>
using namespace std;

#pragma pack(1)
class ArrayX
{
    private:

        int *Arr;
        int iSize;

        public: 
            // Parameterized Constructor with default arguments
            ArrayX(int X = 5)           // 15 will overwrite over 5
            { 
                iSize = X;                  
                Arr = new int[iSize];       
            }
    
            ~ArrayX()                       
            {
                delete []Arr;               
            }
};

int main()
{   
    ArrayX *aobj1 = new ArrayX();               // Parametrized Constructor 
    ArrayX *aobj2 = new ArrayX(15);              // Parametrized Constructor

    // Function Call

    delete aobj1;
    delete aobj2;

    return 0;
}
