#include<stdio.h>

// myexe 10 11
int main(int argc, char *argv[])
{
    int ans = 0;

    if(argc != 3)
    {
        printf("Invalid number of arguments");
        return -1;
    }

    ans = argv[1] + argv[2];        // Error 

    printf("Addition is %d",ans);

    return 0;
}
