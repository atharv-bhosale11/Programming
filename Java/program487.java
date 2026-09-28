import java.util.*;

class program487
{
    public static void main(String A[])
    {
        int iNo = 21;
        int k = 3; 

        int iMask = 1 << (k - 1);

        if((iNo & iMask) != 0)
        {
            System.out.println("Bit is Set");
        }
        else
        {
            System.out.println("Bit is Not Set");
        }
    }
}
