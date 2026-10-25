#include <stdio.h>
#include <math.h>

int main()
{
    double dNo = 25.0;
    double dBase = 2.0;
    double dExponent = 3.0;
    double dValue = 5.7;

    printf("Square Root: %.2f\n", sqrt(dNo));
    printf("Power: %.2f\n", pow(dBase, dExponent));
    printf("Ceiling: %.2f\n", ceil(dValue));
    printf("Floor: %.2f\n", floor(dValue));

    return 0;
}
