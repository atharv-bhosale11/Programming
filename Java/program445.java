import java.util.*;

class program445
{
    public static void main(String A[])
    {
        TreeSet<Integer> tobj =
            new TreeSet<Integer>(Collections.reverseOrder());

        tobj.add(50);
        tobj.add(10);
        tobj.add(30);

        System.out.println(tobj);
    }
}
