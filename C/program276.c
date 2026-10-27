#include <stdio.h>
#include <stdarg.h>

int Sum(int iCount, ...)
{
    va_list Args;
    int iSum = 0;
    int iCnt;
 
    va_start(Args, iCount);

    for(iCnt = 0; iCnt < iCount; iCnt++)
    {
        iSum = iSum + va_arg(Args, int);
    }

    va_end(Args);

    return iSum;
}
 
int main()
{
    printf("Sum of 3 numbers: %d\n", Sum(3, 10, 20, 30));
    printf("Sum of 5 numbers: %d\n", Sum(5, 10, 20, 30, 40, 50));
    printf("Sum of 2 numbers: %d\n", Sum(2, 100, 200));

    return 0;
}
