import java.util.*;

class program54
{   
    public static void Display(int iNo)
    {   
        int iCnt = 0;
        char ch = 'a';

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print(ch+"\t");
            ch++;
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

