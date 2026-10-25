#include <stdio.h>
#include <string.h>

int main()
{
    char strName[] = "Programming in C";
    char *pResult;

    pResult = strchr(strName, 'g');

    if(pResult != NULL)
    {
        printf("Character found: %s\n", pResult);
    }
    else
    {
        printf("Character not found\n");
    }

    pResult = strstr(strName, "in C");

    if(pResult != NULL)
    {
        printf("Substring found: %s\n", pResult);
    }
    else
    {
        printf("Substring not found\n");
    }

    return 0;
}
