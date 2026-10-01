class InsufficientBalanceException
        extends Exception
{
    InsufficientBalanceException(String str)
    {
        super(str);
    }
}

class program504
{
    public static void main(String A[])
    {
        int balance = 5000;
        int withdraw = 7000;

        try
        {
            if(withdraw > balance)
            {
                throw new
                InsufficientBalanceException(
                    "Insufficient Balance");
            }
        }
        catch(Exception e)
        {
            System.out.println(
                e.getMessage());
        }
    }
}
