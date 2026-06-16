#include<stdio.h>

void CallByAddress(int *iPtr)
{
    (*iPtr)++;  // * fetch the value
}

int main()
{   
    int iValue = 11;

    CallByAddress(&iValue);

    printf("Value after Function call by address: %d\n",iValue);
    
    return 0;
}

