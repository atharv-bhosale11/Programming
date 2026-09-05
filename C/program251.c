#include<stdio.h>
#include<stdlib.h>

// myexe 10 11
int main(int argc, char *argv[])
{
    int ans = 0;

    if(argc != 3)
    {
        printf("Invalid number of arguments");
        return -1;
    }

    ans = atoi(argv[1]) + atoi(argv[2]);        // Warning

    printf("Addition is : %d\n",ans);

    return 0;
}
