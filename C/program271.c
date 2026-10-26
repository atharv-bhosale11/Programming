#include <stdio.h>

int main()
{
    char strResult[100];
    char strLimited[20];

    int iNo = 100;  
    float fPrice = 250.50f;

    sprintf(strResult, "Number: %d, Price: %.2f", iNo, fPrice);

    printf("Using sprintf(): %s\n", strResult);

    snprintf(strLimited, sizeof(strLimited), "Price: %.2f", fPrice);

    printf("Using snprintf(): %s\n", strLimited);

    return 0;
}
