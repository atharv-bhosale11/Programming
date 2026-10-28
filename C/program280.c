#include <stdio.h>

int main() 
{
    FILE *fp;

    fp = fopen("oldfile.txt", "w");

    if(fp == NULL)
    {
        printf("Unable to create file\n");
        return 1;
    }

    fprintf(fp, "Hello, C Programming!");
    fclose(fp);

    printf("File created successfully\n");

    if(rename("oldfile.txt", "newfile.txt") == 0)
    {
        printf("File renamed successfully\n");
    }
    else
    {
        printf("File rename failed\n");
        return 1; 
    }

    if(remove("newfile.txt") == 0)
    {
        printf("File deleted successfully\n");
    }
    else
    {
        printf("File deletion failed\n");
        return 1;
    }
 
    return 0;
}
