import java.util.*;

class program423
{
    public static void main(String A[])
    {
        ArrayList<String> aobj = new ArrayList<String>();

        aobj.add("Java");
        aobj.add("Python");
        aobj.add("C");
        aobj.add("C++");

        Collections.sort(aobj);

        for(String str : aobj)
        {
            System.out.println(str);
        }
    }
}
