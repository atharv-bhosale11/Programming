import java.util.*;

class program458
{
    public static void main(String A[])
    {
        LinkedHashMap<Integer,String> lobj =
            new LinkedHashMap<Integer,String>(3,0.75f,true);

        lobj.put(1,"A");
        lobj.put(2,"B");
        lobj.put(3,"C");

        lobj.get(1);

        System.out.println(lobj);
    }
}
