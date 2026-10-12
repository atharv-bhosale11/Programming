class Arithmetic
{
    int Addition(int iNo1, int iNo2)
    {
        return iNo1 + iNo2;
    }
}

class Calculator extends Arithmetic
{
    int Multiplication(int iNo1, int iNo2)
    {
        return iNo1 * iNo2;
    }
}

class program541
{
    public static void main(String A[])
    {
        Calculator cobj = new Calculator();

        System.out.println(
            "Addition : " + cobj.Addition(10, 20));

        System.out.println(
            "Multiplication : " + cobj.Multiplication(10, 20));
    }
}
