import java.util.*;

class program457
{
    public static void main(String A[])
    {
        ArrayList<Integer> list =
            new ArrayList<Integer>();

        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);

        LinkedHashSet<Integer> hobj =
            new LinkedHashSet<Integer>(list);

        System.out.println(hobj);
    }
}
