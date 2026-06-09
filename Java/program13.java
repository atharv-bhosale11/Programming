import java.util.*;

class NumberX
{ 
    public void SumFactors(int iNo)
    {
        // Logic
        int iCnt = 0;
        int iSum = 0;
        for(iCnt = 1; iCnt <= (iNo/2); iCnt++)
        {
            if ((iNo % iCnt == 0))
            {
                iSum = iSum + iCnt;
            }
        }
        System.out.println("Summation of Factors: "+iSum);
    }
}

class program13
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the No: ");
        iValue = sobj.nextInt();
        
        NumberX nobj = new NumberX();

        nobj.SumFactors(iValue);

        sobj.close();
    }
}

// Time Complexity: O(N/2)
// Where N>=0   (where N is value which you have entered)
