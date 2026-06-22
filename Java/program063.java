// INPUT    -:  11
// OUTPUT   -:  * * * # # # * * * # #

import java.util.*;

class Pattern
{
    void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(((iCnt - 1) / 3) % 2 == 0)
            {
                System.out.print("*\t");
            }
            else
            {
                System.out.print("#\t");
            }
        }
    }
}

class program63
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int iValue = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue);
    }
}
