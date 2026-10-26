#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{
    int iCnt;

    srand((unsigned int)time(NULL));

    printf("Random Numbers:\n");

    for(iCnt = 1; iCnt <= 5; iCnt++)
    {
        printf("%d\n", rand() % 100 + 1);
    }

    return 0;
}
