import java.util.*;

class program439
{
    public static void main(String A[])
    {
        ArrayList<Integer> A1 = new ArrayList<Integer>();

        ArrayList<Integer> A2 = new ArrayList<Integer>();

        A1.add(10);
        A1.add(20);

        A2.add(20);
        A2.add(30);

        HashSet<Integer> hobj = new HashSet<Integer>();

        hobj.addAll(A1);
        hobj.addAll(A2);

        System.out.println(hobj);
    }
}
