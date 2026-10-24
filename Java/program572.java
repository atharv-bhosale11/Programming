class Calculator
{
    int Add(int iNo1, int iNo2)
    {
        return iNo1 + iNo2;
    }

    int Add(int iNo1, int iNo2, int iNo3)
    {
        return iNo1 + iNo2 + iNo3;
    }

    double Add(double dNo1, double dNo2)
    {
        return dNo1 + dNo2;
    }
}

class program572
{
    public static void main(String A[])
    {
        Calculator cobj = new Calculator();

        System.out.println("Addition of 2 numbers : " + cobj.Add(10, 20));
 
        System.out.println("Addition of 3 numbers : " + cobj.Add(10, 20, 30));
 
        System.out.println("Addition of decimal numbers : " + cobj.Add(10.5, 20.5));
    }
}
