#include <stdio.h>
#include <stdlib.h>

int main()
{ 
    int iNo = -25;
    int iDividend = 17;
    int iDivisor = 5;

    div_t Result;

    printf("Absolute Value: %d\n", abs(iNo));

    Result = div(iDividend, iDivisor);

    printf("Quotient: %d\n", Result.quot);
    printf("Remainder: %d\n", Result.rem);

    return 0;
}
