#include<stdio.h>


int main()
{
    unsigned iNo = 0;
    unsigned iMask = 4;
    unsigned iAns = 0;

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
