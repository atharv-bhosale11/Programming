#include<stdio.h>
#include<stdlib.h>

int SumEven(int Arr[], int iSize)
{
    int iCnt = 0, iCountEven = 0, iSumEven = 0;
    
    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt] % 2 == 0)
        {
            iSumEven = iSumEven + Arr[iCnt];
        }
    }
    return iSumEven;
}

int main()
{   
    int *Brr = NULL, iLength = 0, iCnt = 0, iRet = 0;

    printf("Enter the Size of Array: ");
    scanf("%d",&iLength);
    
    Brr = (int *)malloc(iLength * sizeof(int));

    printf("Enter the Elements: ");
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d",&Brr[iCnt]);
    }

    iRet = SumEven(Brr,iLength);

    printf("Even Numbers summation : %d\n",iRet);

    free(Brr);

    return 0;
}
