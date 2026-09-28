import java.util.*;

class program485
{
    public static void main(String A[])
    {
        int iNo = 29;
        int iCount = 0;

        while(iNo != 0)
        { 
            if((iNo & 1) == 1)
            {
                iCount++;
            } 

            iNo = iNo >> 1;
        }

        System.out.println("Set Bits : " + iCount);
    }
}
