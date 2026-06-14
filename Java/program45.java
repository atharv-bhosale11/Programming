import java.util.*;

class ArrayX
{
    Scanner Sobj = new Scanner(System.in);
    int iCnt = 0;

    private int Arr[];
    private int iSize = 0;

    public ArrayX(int x) 
        {
            iSize = x; 
            Arr = new int[iSize];
        }   
        
        void accept()
        {
            System.out.println("Enter the Elements: ");
            for(iCnt = 0; iCnt < iSize; iCnt++)
            {
                Arr[iCnt] = Sobj.nextInt();
            } 
        }

        void display()
        {
            System.out.println("Elements are: ");
            for(iCnt = 0; iCnt < iSize; iCnt++)
            {
                System.out.println(Arr[iCnt]);
            }
        }

        int Summation()
        {
            int iSum = 0;

            for(iCnt = 0; iCnt < iSize; iCnt++)
            {
                iSum = iSum + Arr[iCnt];
            }
            return iSum;
        }
}

class first
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iLength = 0, iRet = 0;

        System.out.println("Enter the Number of Elements: ");
        iLength = sobj.nextInt();

        ArrayX aobj = new ArrayX(iLength);

        aobj.accept();
        aobj.display();

        iRet = aobj.Summation();

        System.out.println("Summation is "+iRet);
    }
}
