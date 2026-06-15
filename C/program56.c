#include<stdio.h>

int main()
{   
    int Arr[7] = {10,20,30,40,50};  //  4 bytes(of integer) each by Default  , if initialize 7 then size will be 28 bytes

    printf("%d\n",sizeof(Arr));

    return 0;
}
