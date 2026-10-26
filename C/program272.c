#include <stdio.h>
#include <string.h>

int main()
{
    char strName[10];
    char strArr1[] = "Hello";
    char strArr2[] = "Hello"; 
    char strArr3[] = "World";

    memset(strName, '*', 5);
    strName[5] = '\0';

    printf("After memset(): %s\n", strName);

    printf("Comparison 1: %d\n",
           memcmp(strArr1, strArr2, 5));
 
    printf("Comparison 2: %d\n",
           memcmp(strArr1, strArr3, 5));

    return 0;
}
