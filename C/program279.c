#include <stdio.h>

int main()
{
    FILE *fp;
    long int lPosition;
    int iChar;

    fp = fopen("program18.txt", "w+");

    if(fp == NULL)
    {
        printf("Unable to open file\n");
        return 1;
    }

    fputs("Hello World", fp);

    lPosition = ftell(fp);
    printf("Position after writing: %ld\n", lPosition);

    fseek(fp, 6, SEEK_SET);

    iChar = fgetc(fp);
    printf("Character at position 6: %c\n", iChar);

    printf("Current position: %ld\n", ftell(fp));

    rewind(fp);

    printf("Position after rewind: %ld\n", ftell(fp));

    fclose(fp);

    return 0;
}
