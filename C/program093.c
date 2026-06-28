#include<stdio.h>
#include<stdlib.h>

int CountFrequency(int Arr[], int iSize)
{
    int iCnt = 0, iCountFrequency = 0;
    
    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt] == 11)
        {
            iCountFrequency++;
        }
    }
    return iCountFrequency;
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

    iRet = CountFrequency(Brr,iLength);

    printf("Frequency :  %d\n",iRet);

    free(Brr);

    return 0;
}
