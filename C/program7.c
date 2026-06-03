#include<stdio.h>

int main()
{
    
    float fValue1=0.0f;                         // To store first input
    float fValue2=0.0f;                         // To store second input
    float fResult=0.0f;                         // To store the Result

    printf("Enter the First Number: \n");
    scanf("%f",&fValue1);

    printf("Enter the Second Number: \n");
    scanf("%f",&fValue2);

    fResult = fValue1 + fValue2;                // Perform the Addition

    printf("Addition is: %f\n ",fResult);

    return 0;
}