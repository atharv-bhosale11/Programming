#include<stdio.h>

void CallByValue(int iNo)
{
    iNo++;
}

int main()
{   
    int iValue = 11;

    CallByValue(iValue);

    printf("Value after Function call value: %d\n",iValue);
    
    return 0;
}

