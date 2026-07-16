//Type 2

import java.util.*;
 
class program06
{
    void CheckDivisible(int iNo)
    { 
        if((iNo % 3 == 0) && (iNo % 5 == 0))
        {
            System.out.println("Number is Divisible by 3 and 5");
        }
        else
        {
            System.out.println("Number is Not Divisible by 3 and 5");
        }
    }
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the No: ");
        iValue = sobj.nextInt();
        
        CheckDivisible(iValue);         // Error
        
        sobj.close();
    }
}
