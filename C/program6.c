/*
    ------------ALGORITHM-----------------

    START 
        Accept the first number as No1 
        Accept the second number as No2
        Perform the addtion of No1 and No2
        Display the Results
    STOP
*/


#include<stdio.h>

int main()
{
    // Variable creation with Default Values
    
    float i=0.0f,j=0.0f,k=0.0f;

    printf("Enter the First Number: \n");
    scanf("%f",&i);

    printf("Enter the Second Number: \n");
    scanf("%f",&j);

    k = i + j;

    printf("Addition is: %f\n ",k);

    return 0;
}