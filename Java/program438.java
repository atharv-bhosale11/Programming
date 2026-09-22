import java.util.*;

class program438
{
    public static void main(String A[])
    {
        ArrayList<Integer> A1 = new ArrayList<Integer>();

        ArrayList<Integer> A2 = new ArrayList<Integer>();

        A1.add(10);
        A1.add(20);
        A1.add(30);

        A2.add(20);
        A2.add(30);
        A2.add(40);

        A1.retainAll(A2);

        System.out.println(A1);
    }
}
