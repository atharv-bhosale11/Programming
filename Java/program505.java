import java.util.*;

class program505
{
    public static void main(String A[]) 
    {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(50);
        list.add(10);
        list.add(40);
        list.add(20);
        list.add(30);

        Collections.sort(list,
            (a, b) -> a - b);

        System.out.println(list);
    }
}
