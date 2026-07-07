#include<stdio.h>

typedef unsigned int UINT;

int main()
{   
    UINT iNo = 0;
    UINT iMask = 0;

    printf("Enter Number: ");
    scanf("%d",&iNo);

    // // Posituon = 28
    iMask = 0x8000000;

    iNo = iNo ^ iMask;

    printf("Updated Number: %d",iNo);

    return 0;
} 
