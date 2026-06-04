//Type 1

import java.util.*;

class program05
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the No: ");
        iValue = sobj.nextInt();

        if((iValue % 3 == 0) && (iValue % 5 == 0))
        {
            System.out.println("Number is Divisible by 3 and 5");
        }
        else
        {
            System.out.println("Number is Not Divisible by 3 and 5");
        }
        
        sobj.close();
    }
}
