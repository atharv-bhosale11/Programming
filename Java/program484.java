import java.util.*;

class program484
{
    public static void main(String A[]) 
    {
        int iNo = 16;
                                                                     
        if((iNo > 0) && ((iNo & (iNo - 1)) == 0))            
        {
            System.out.println("Power of 2");
        }
        else
        {
            System.out.println("Not Power of 2");
        }
    }
}
