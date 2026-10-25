#include <stdio.h>
#include <string.h>

int main()
{
    char strSource[] = "Hello World"; 
    char strDestination[20];

    memcpy(strDestination, strSource, strlen(strSource) + 1);

    printf("After memcpy(): %s\n", strDestination);

    char strName[] = "ABCDEFG";

    memmove(strName + 2, strName, 5);

    printf("After memmove(): %s\n", strName);

    return 0;
}
