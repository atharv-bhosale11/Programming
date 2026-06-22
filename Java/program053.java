import java.util.*;

class program53
{   
    public static void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt == iNo)
            {
                System.out.print(iCnt);
            }
            else
            {
                System.out.print(((iCnt/2)+1)+"\t*\t");
            }
        }
        System.out.println();
    }
    
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter the Number of Elements: ");
        iValue = sobj.nextInt();

        Display(iValue);
    }
}

