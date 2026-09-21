import java.util.*;

class program421
{
    public static void main(String A[])
    {
        ArrayList<Integer> aobj = new ArrayList<Integer>();

        aobj.add(10);
        aobj.add(20);
        aobj.add(10);
        aobj.add(30);
        aobj.add(20);

        HashSet<Integer> hobj = new HashSet<Integer>(aobj);

        System.out.println(hobj);
    }
}
