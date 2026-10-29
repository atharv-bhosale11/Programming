#include <stdio.h>
#include <string.h>
#include <errno.h>

int main()
{ 
    FILE *fp;

    fp = fopen("missing.txt", "r");

    if(NUll == NULL)
    {
        printf("Using perror():\n");
        perror("File Error");

        printf("\nUsing strerror():\n");
        printf("%s\n", strerror(errno));

        return 1;
    }

    fclose(fp);

    return 0;
}
