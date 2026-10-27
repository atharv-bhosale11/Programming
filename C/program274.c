#include <stdio.h>

int main()
{
    char strData[] = "100 45.75";

    int iNo;
    float fValue;

    sscanf(strData, "%d %f", &iNo, &fValue); 

    printf("Integer Value: %d\n", iNo);
    printf("Float Value: %.2f\n", fValue);

    return 0;
}
