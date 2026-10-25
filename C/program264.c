#include <stdio.h>
#include <stdlib.h>

int Compare(const void *p1, const void *p2)
{
    return (*(int *)p1 - *(int *)p2);
}

int main()
{
    int Arr[] = {50, 20, 40, 10, 30};
    int iSize = sizeof(Arr) / sizeof(Arr[0]);
    int iKey = 30;
    int *pResult;

    qsort(Arr, iSize, sizeof(int), Compare);

    printf("Sorted Array: ");

    for(int i = 0; i < iSize; i++)
    {
        printf("%d ", Arr[i]);
    } 

    pResult = bsearch(&iKey, Arr, iSize, sizeof(int), Compare);

    if(pResult != NULL)
    {
        printf("\nElement %d found\n", iKey);
    }
    else
    {
        printf("\nElement %d not found\n", iKey);
    }

    return 0;
}
