#include<stdio.h>
#include<stdlib.h>

// Example run: myexe 10 11
int main(int argc, char *argv[])
{
    if(argc != 3)
    {
        printf("Invalid number of arguments\n");
        return -1;
    }

    int num1 = atoi(argv[1]);
    int num2 = atoi(argv[2]);

    int ans = num1 * num2;

    printf("Multiplication is : %d\n", ans);

    return 0;
}
