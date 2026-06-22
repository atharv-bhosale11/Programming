import java.util.*;

class NumberX
{
    public boolean CheckPerfect(int iNo)
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
        
        if(iSum == iNo)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program14
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter the No: ");
        iValue = sobj.nextInt();
        
        NumberX nobj = new NumberX();

        bRet = nobj.CheckPerfect(iValue);

        if (bRet == true)
        {
            System.out.println(iValue+" It is Perefect Number");
        }
        else
        {
            System.out.println(iValue+" It is Not Perfect Number");
        }
        sobj.close();
    }
}

// Time Complexity: O(N/2)
// Where N>=0   (where N is value which you have entered)
