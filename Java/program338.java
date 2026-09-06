import java.util.*;

class program338
{
    public static void main(String A[])
    {
        String transaction[] = {"TX101","TX102","TX103","TX101","TX104","TX102"};
 
        HashSet <String> unique    = new HashSet<String>();
        HashSet <String> duplicate = new HashSet<String>();

        boolean bRet = false;

        for(String str : transaction)
        {
            
            bRet = unique.add(str);

            if(bRet == false)
            {
                duplicate.add(str);
            }
            
        }

        System.out.println("Duplicate Transactions are: ");
        for(String str : duplicate)
        {
            System.out.println(str);
        }
    }
}
