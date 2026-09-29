class program489
{
    public static void main(String A[])
    {
        try
        {
            int iNo = 10 / 2;

            System.out.println("Result : " + iNo);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception Occurred");
        }
        finally
        {
            System.out.println("Finally block executed");
        }
    }
}
