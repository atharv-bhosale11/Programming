import java.util.*;

class program415
{
    public static void main(String A[])
    {
        ArrayList<String> aobj = new ArrayList<String>();

        aobj.add("Java");
        aobj.add("Programming");
        aobj.add("C");
        aobj.add("Python");

        Collections.sort(aobj, new Comparator<String>()
        {
            public int compare(String s1, String s2)
            {
                if(s1.length() != s2.length())
                {
                    return s1.length() - s2.length();
                }
                return s1.compareTo(s2);
            }
        });

        for(String s : aobj)
        {
            System.out.println(s);
        }
    }
}
