class InvalidAgeException extends Exception
{
    InvalidAgeException(String msg)
    {
        super(msg);
    }
}
 
class program488
{
    public static void main(String A[])
    {
        int iAge = 16;

        try
        {
            if(iAge < 18)
            {
                throw new InvalidAgeException("Age must be 18 or above");
            }
            System.out.println("Eligible for driving license");
        }
        catch(InvalidAgeException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
