#include<stdio.h>

// Error Due to Stdlib.h
int main()
{   
    int *Brr = NULL;
    int iLength = 0;
    int iCnt = 0;
    
    // Step 1: Aceept the Size of Array
    printf("Enter Size of Array: \n");
    scanf("%d",&iLength);

    // Step 2: Allocate the Memory
    Brr = (int *)malloc(iLength * sizeof(int));

    // Step 3: Accept the Values from User
    printf("Enter the Number: \n");
    for(iCnt = 0 ; iCnt <iLength; iCnt++)
    {
        scanf("%d",&Brr[iCnt]);
    }

    // Step 4: Used the Memory (Logic)
    printf("The Numbers are: \n");
    for(iCnt = 0 ; iCnt <iLength; iCnt++)
    {
        printf("%d\n",Brr[iCnt]);
    }

    // Step 5: Dellocate the memory
    free(Brr);

    return 0;
}

