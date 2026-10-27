#include <stdio.h>

int main()
{
    char strBuffer[20];
    int iNo = 12345;

    int iResult = snprintf(strBuffer, sizeof(strBuffer),
                           "Number: %d", iNo);

    printf("Formatted String: %s\n", strBuffer);
    printf("Required Characters: %d\n", iResult);

    if(iResult < sizeof(strBuffer)) 
    {
        printf("Output fits in the buffer\n");
    }
    else
    {
        printf("Output was truncated\n");
    }

    return 0;
}
