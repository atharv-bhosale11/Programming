#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

bool LinerSearch(int Arr[], int iSize)
{
    int iCnt = 0;
    bool bFlag = false;
    
    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt] == 11)
        {
            bFlag = true;
            break;
        }
    }
    return bFlag;
}

int main()
{   
    int *Brr = NULL, iLength = 0, iCnt = 0;
    bool bRet = false;

    printf("Enter the Size of Array: ");
    scanf("%d",&iLength);
    
    Brr = (int *)malloc(iLength * sizeof(int));

    printf("Enter the Elements: ");
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d",&Brr[iCnt]);
    }

    bRet = LinerSearch(Brr,iLength);

    if(bRet == true)
    {
        printf("11 is present");
    }
    else
    {
        printf("11 is absent");
    }

    free(Brr);

    return 0;
}
