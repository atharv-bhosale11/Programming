import java.util.*;

class program429
{
    public static void main(String A[])
    {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(50);
        list.add(30);
        list.add(90);
        list.add(70);

        Collections.sort(list); 

        System.out.println("Second Largest : "
                + list.get(list.size()-2));
    }
}
