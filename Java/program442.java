import java.util.*;

class program442
{
    public static void main(String A[])
    {
        ArrayList<String> list =
            new ArrayList<String>();

        list.add("Java");
        list.add("Programming");
        list.add("C");

        Collections.sort(list,
            (s1,s2) -> s1.length()-s2.length());

        System.out.println(list);
    }
}
