class Calculator
{
    int Addition(int iNo1, int iNo2)
    {
        return iNo1 + iNo2;
    }

    int Addition(int iNo1, int iNo2, int iNo3)
    {
        return iNo1 + iNo2 + iNo3;
    }
}

class AdvancedCalculator extends Calculator
{
    int Multiplication(int iNo1, int iNo2)
    {
        return iNo1 * iNo2;
    }
}

class program546
{ 
    public static void main(String A[])
    {
        AdvancedCalculator aobj = new AdvancedCalculator();

        System.out.println(aobj.Addition(10, 20));
        System.out.println(aobj.Addition(10, 20, 30));
        System.out.println(aobj.Multiplication(10, 20));
    }
}
