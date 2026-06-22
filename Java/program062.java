import java.util.*;

class program62
{   
    public static void Display(int iNo)
    {   
        int iCnt = 0;
        char ch = '\0', ch1 = '\0';

        for(iCnt = 1, ch = 'A', ch1 ='a' ; iCnt <= iNo; iCnt++,ch++,ch1++)
        {   
            if(iCnt % 2 == 0)
            {
                System.out.print(ch1+"\t");
            }
            else
            {
                System.out.print(ch+"\t");
            }
        }
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

