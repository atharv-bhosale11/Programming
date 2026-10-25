#include <stdio.h>
#include <ctype.h>

int main()
{
    char ch1 = 'a';
    char ch2 = 'Z';

    printf("Original Character 1: %c\n", ch1);
    printf("Uppercase Character: %c\n", toupper((unsigned char)ch1));

    printf("\nOriginal Character 2: %c\n", ch2);
    printf("Lowercase Character: %c\n", tolower((unsigned char)ch2)); 

    return 0;
}
