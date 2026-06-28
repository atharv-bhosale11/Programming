#include<stdio.h>
#include<stdlib.h>

int Summation(int Arr[],int iSize)
{
    int iCnt = 0;
    int iSum = 0; 

    for(iCnt = 0 ; iCnt < iSize; iCnt++)
    {
        iSum = iSum + Arr[iCnt];
    }
    return iSum;
}

int main()
{   
    int *Brr = NULL;
    int iLength = 0;
    int iCnt = 0;
    int iRet = 0;
    
    // Step 1: Aceept the Size of Array
    printf("Enter Size of Array: \n");
    scanf("%d",&iLength);

    // Step 2: Allocate the Memory
    Brr = (int *)malloc(iLength * sizeof(int));

    // Step 3: Accept the Values from User
    printf("Enter the Number: \n");
    for(iCnt = 0 ; iCnt < iLength; iCnt++)
    {
        scanf("%d",&Brr[iCnt]);
    }

    // Step 4: Used the Memory (Logic)
    iRet = Summation(Brr,iLength);
    
    printf("Summation of Array is: %d\n",iRet);

    // Step 5: Dellocate the memory
    free(Brr);

    return 0;
}

