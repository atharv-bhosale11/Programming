import java.util.*;

class NumberX
{
    public void DisplayFactors(int iNo)
    {
        // Logic
        int iCnt = 0;
        for(iCnt = 1; iCnt <= (iNo/2); iCnt++)
        {
            if ((iNo % iCnt == 0))
            {
                System.out.println(iCnt);
            }
        }
    }
}

class program47
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the No: ");
        iValue = sobj.nextInt();
        System.out.println("Factors are: ");
        
        NumberX nobj = new NumberX();

        nobj.DisplayFactors(iValue);

        sobj.close();
    }
}

// Time Complexity: O(N/2)
// Where N>=0   (where N is value which you have entered)
