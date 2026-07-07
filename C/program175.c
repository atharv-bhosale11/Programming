#include<stdio.h>

typedef unsigned int UINT;

int main()
{   
    UINT iNo = 0;
    UINT iMask = 0;

    printf("Enter Number: ");
    scanf("%d",&iNo);

    // // Posituon = 11
    iMask = 0x400;

    iNo = iNo ^ iMask;

    printf("Updated Number: %d",iNo);

    return 0;
} 
