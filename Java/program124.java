import java.util.*;

class program124
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        StringX strobj = new StringX();             // Error

        String data = null;
        int iRet = 0;

        System.out.println("Enter String: ");
        data = sobj.nextLine();

        iRet = strobj.CountCapital(data);
        System.out.println("Number of Capital Characters are: "+iRet);

        iRet = strobj.CountSmall(data);
        System.out.println("Number of Small Characters are: "+iRet);

        iRet = strobj.CountDigits(data);
        System.out.println("Number of Digits are: "+iRet);

        iRet = strobj.CountSpace(data);
        System.out.println("Number of white Spaces are: "+iRet);

        iRet = strobj.CountSpecialSymbol(data);
        System.out.println("Number of Special Symbols are: "+iRet);

    sobj.close();
    }
}
