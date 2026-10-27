#include <stdio.h>
#include <stdlib.h>

int main()
{
    char *pValue; 

    pValue = getenv("PATH");

    if(pValue != NULL)
    {
        printf("PATH Environment Variable:\n%s\n", pValue);
    }
    else
    {
        printf("Environment variable not found\n");
    }

    return 0;
}
