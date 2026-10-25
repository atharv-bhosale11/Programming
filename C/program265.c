#include <stdio.h>
#include <ctype.h>

int main()
{
    char ch1 = 'A'; 
    char ch2 = '7';
    char ch3 = '@';

    printf("Character: %c\n", ch1);
    printf("Is Alphabet: %s\n", isalpha((unsigned char)ch1) ? "Yes" : "No");
    printf("Is Digit: %s\n", isdigit((unsigned char)ch1) ? "Yes" : "No");

    printf("\nCharacter: %c\n", ch2);
    printf("Is Alphabet: %s\n", isalpha((unsigned char)ch2) ? "Yes" : "No");
    printf("Is Digit: %s\n", isdigit((unsigned char)ch2) ? "Yes" : "No");

    printf("\nCharacter: %c\n", ch3);
    printf("Is Alphanumeric: %s\n", isalnum((unsigned char)ch3) ? "Yes" : "No");

    return 0;
}
