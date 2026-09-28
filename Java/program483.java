class program483
{
    public static void main(String A[])
    { 
        int Arr[] = {10,20,30};

        try 
        {
            int iNo = 10 / 0;

            System.out.println(Arr[5]); 
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index Exception");
        }
    }
}
