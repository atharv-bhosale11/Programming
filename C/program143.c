#include<stdio.h>

int main()
{
    int iNo1 = 0, iNo2 = 0, Ans = 0;

    printf("Enter First Number:\n ");
    scanf("%d",&iNo1);

    printf("Enter Second Number:\n ");
    scanf("%d",&iNo2);

    Ans = iNo1 & iNo2;
    printf("Result is : %d",Ans);

    return 0;
}
