import java.util.*;

class program335
{
    public static void main(String A[])
    {
        String transaction[] = {"TX101","TX102","TX103","TX101","TX104","TX102"};

        HashSet <String> unique    = new HashSet<String>();
        HashSet <String> duplicate = new HashSet<String>();

        for(String str : transaction)
        {
            if(!unique.add(str))
            {
                duplicate.add(str);
            }
        }
        System.out.println("Unique Transactions are: "+unique);

        System.out.println("Duplicate Transactions are: "+duplicate);
    }
}
