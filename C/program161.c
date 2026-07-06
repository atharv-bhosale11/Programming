#include<stdio.h>

typedef unsigned int UINT;

int main()
{
    UINT iNo = 0;
    UINT iMask = 0x1;
    UINT iAns = 0;
    UINT iPos = 0;

    printf("Enter Number: \n");
    scanf("%d",&iNo);

    printf("Enter the Position: ");
    scanf("%d",&iPos);

    iMask = iMask << (iPos - 1); 
    
    iAns = iNo & iMask;

    if(iAns == iMask)
    {
        printf("%dth Bit is ON",iPos);
    }
    else
    {
        printf("%dth Bit is OFF",iPos);
    }

    return 0;
}
