import java.util.*;

class program426
{
    public static void main(String A[])
    {
        HashMap<Integer,String> hobj =
            new HashMap<Integer,String>();

        hobj.put(1,"Amit");
        hobj.put(2,"Pooja");
        hobj.put(3,"Rahul");

        for(Map.Entry<Integer,String> e : hobj.entrySet())
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
