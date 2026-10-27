#include <stdio.h>
#include <stdlib.h>

void DisplayMessage()
{ 
    printf("Program termination function executed\n");
}

int main()
{
    atexit(DisplayMessage);

    printf("Program started\n"); 
    printf("Performing operations\n");

    exit(0);
}
