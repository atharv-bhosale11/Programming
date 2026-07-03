#include<stdio.h>

void UpdateLetter(char * str)
{
    
    while (*str != '\0')
    {
        if(*str == 'l')
        {
            *str = '-';
        }
        str++;
    }
}

int main()
{
    char Arr[50] = {'\0'};

    printf("Enter String:\n");
    scanf("%[^'\n']s",Arr);           

    UpdateLetter(Arr);
    
    printf("Updated String is: %s",Arr);

    return 0;
} 
