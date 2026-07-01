#include<stdio.h>

int main()
{
    char str[] = {'J','a','y',' ','G','a','n','e','s','h','\0'};        // Garbage Value will gone after '/0'

    printf("%s\n",str);

    return 0;
}
