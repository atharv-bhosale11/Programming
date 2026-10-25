#include <stdio.h>
#include <string.h>

int main()
{
    char strName1[50] = "Jay";
    char strName2[50] = "Ganesh";
    char strCopy[50];

    printf("Length of Name: %zu\n", strlen(strName1));
 
    strcpy(strCopy, strName1);
    printf("Copied String: %s\n", strCopy);

    strcat(strName1, strName2);
    printf("Concatenated String: %s\n", strName1);

    printf("Comparison Result: %d\n",strcmp("Apple", "Apple"));

    return 0;
}
