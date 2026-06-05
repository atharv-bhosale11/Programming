//Type 3

import java.util.*;

class NumberX
{
    public static boolean CheckDivisible(int iNo)
    {
        if((iNo % 3 == 0) && (iNo % 5 == 0))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}


class program10
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter the No: ");
        iValue = sobj.nextInt();
        
        bRet = NumberX.CheckDivisible(iValue);   // if Static Keyword present in another class then we call this way 
        
        if(bRet == true)
        {
            System.out.println("Number is Divisible by 3 and 5");
        }
        else
        {
            System.out.println("Number is not Divisible by 3 and 5");
        }

        sobj.close();
    }
}
