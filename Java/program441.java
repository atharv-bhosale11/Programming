import java.util.*;

class program441 
{
    public static void main(String A[])
    {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);

        list.removeIf(n -> n % 2 == 0);

        System.out.println(list);
    }
}
