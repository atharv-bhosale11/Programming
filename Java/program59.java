import java.util.*;

class program59
{   
    public static void Display(int iNo)
    {   
        int iCnt = 0;
        char ch = '\0';

        for(iCnt = 1, ch = 'A' ; iCnt <= iNo; iCnt++)
        {   
            if(iCnt == iNo)
            {
                System.out.println(ch);
            }
            else
            {
            System.out.print(ch+"\t*\t");
            ch++;
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

