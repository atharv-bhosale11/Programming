import java.util.*;

class NumberX
{
    public boolean CheckPrime(int iNo)
    {
        // Logic 
        int iCnt = 0;

        for(iCnt = 2; iCnt <= (iNo/2); iCnt++)
        {
            if ((iNo % iCnt == 0))
            {
                break;
            }
        }
        
        if(iCnt < iNo/2)
        {
            return false;
        }
        else
        {
            return  true;
        }
    }
}

class program16
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter the No: ");
        iValue = sobj.nextInt();
        
        NumberX nobj = new NumberX();

        bRet = nobj.CheckPrime(iValue);

        if (bRet == true)
        {
            System.out.println(iValue+" It is Prime Number");
        }
        else
        {
            System.out.println(iValue+" It is Not Prime Number");
        }
        sobj.close();
    }
}

// Time Complexity: O(N/2)
// Where N>=0   (where N is value which you have entered)
