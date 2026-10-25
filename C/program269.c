#include <stdio.h>
#include <stdlib.h>

int main()
{
    char strNum1[] = "12345";
    char strNum2[] = "6789";
    char strNum3[] = "250abc";

    int iNum = atoi(strNum1);
    long int lNum = strtol(strNum2, NULL, 10);

    char *pEnd;
    long int lValue = strtol(strNum3, &pEnd, 10);

    printf("Using atoi(): %d\n", iNum);
    printf("Using strtol(): %ld\n", lNum);
    printf("Converted value: %ld\n", lValue);
    printf("Remaining string: %s\n", pEnd);

    return 0;
}
