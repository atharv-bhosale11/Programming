#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

bool LinerSearch(int Arr[], int iSize, int iNo)
{
    int iCnt = 0;
    bool bFlag = false;
    
    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt] == iNo)
        {
            bFlag = true;
            break;
        }
    }
    return bFlag;
}

int main()
{   
    int *Brr = NULL, iLength = 0, iCnt = 0, iValue = 0;
    bool bRet = false;

    printf("Enter the Size of Array: ");
    scanf("%d",&iLength);
    
    Brr = (int *)malloc(iLength * sizeof(int));

    printf("Enter the Elements: ");
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d",&Brr[iCnt]);
    }

    printf("Enter Searching Elements: ");
    scanf("%d",&iValue);

    bRet = LinerSearch(Brr,iLength,iValue);

    if(bRet == true)
    {
        printf("%d is present",iValue);
    }
    else
    {
        printf("%d is absent",iValue);
    }

    free(Brr);

    return 0;
}
