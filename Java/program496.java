import java.util.regex.*;

class program496
{
    public static void main(String A[])
    {
        String strEmail = "abc@gmail.com";

        String strPattern ="^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        boolean bRet = Pattern.matches(strPattern, strEmail);

        if(bRet)
        {
            System.out.println("Valid Email");
        }
        else
        {
            System.out.println("Invalid Email");
        }
    }
}
