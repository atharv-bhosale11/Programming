#include<stdio.h>

typedef unsigned int UINT;

int main()
{   
    UINT iNo = 0;
    UINT iMask = 0x1;
    UINT iPos = 0;

    printf("Enter Number: ");
    scanf("%d",&iNo);

    printf("Enter the Position: ");
    scanf("%d",&iPos);

    iMask = iMask << (iPos - 1);

    iNo = iNo ^ iMask;

    printf("Updated Number: %d",iNo);

    return 0;
} 
