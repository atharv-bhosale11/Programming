#include<stdio.h>


int main()
{
    int iNo = 0;
    int iMask = 4;          // For Cheking 3rd bit used iMask = 4
    int iAns = 0;

    printf("Enter Number: \n");
    scanf("%d",&iNo);

    iAns = iNo & iMask;

    if(iAns == iMask)
    {
        printf("3rd Bit is ON");
    }
    else
    {
        printf("3rd Bit is OFF");
    }

    return 0;
}
