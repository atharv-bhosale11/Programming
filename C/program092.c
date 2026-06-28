#include<stdio.h>
#include<stdlib.h>

int CountOdd(int Arr[], int iSize)
{
    int iCnt = 0, iCountOdd = 0;
    
    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt] % 2 != 0)
        {
            iCountOdd++;
        }
    }
    return iCountOdd;
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

    iRet = CountOdd(Brr,iLength);

    printf("Odd Numbers are %d\n",iRet);

    free(Brr);

    return 0;
}
