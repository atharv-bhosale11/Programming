import java.util.*;

class program447
{
    public static void main(String A[])
    {
        TreeMap<Integer,String> tobj =
            new TreeMap<Integer,String>();

        tobj.put(1,"Amit");
        tobj.put(2,"Rahul");
        tobj.put(3,"Pooja");

        for(Map.Entry<Integer,String> e : tobj.entrySet())
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
