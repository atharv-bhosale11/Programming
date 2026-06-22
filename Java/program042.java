import java.util.*;

class program42
{

    public static void update(int Arr[])
    {
        int iCnt = 0;
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt]++;
        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iCnt = 0, iRet = 0;

        System.out.println("Enter the Size of Array: ");
        int iLength = sobj.nextInt();

        System.out.println("Enter the Elements: ");
        int Brr[] = new int[iLength];

        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            Brr[iCnt] = sobj.nextInt();
        }

        System.out.println("Array Elements before function call: ");

        for(iCnt = 0; iCnt < Brr.length ; iCnt++)
        {
            System.out.println(Brr[iCnt]);
        }

        update(Brr);

        System.out.println("Array Elements After function call: ");

        for(iCnt = 0; iCnt < Brr.length ; iCnt++)
        {
            System.out.println(Brr[iCnt]);
        }

    }
}
