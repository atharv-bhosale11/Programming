import java.util.*;

class program430 
{
    public static void main(String A[])
    { 
        ArrayList<Integer> list = new ArrayList<Integer>();  

        list.add(40);
        list.add(10);
        list.add(60);
        list.add(20);

        Collections.sort(list);

        System.out.println("Second Smallest : "
                + list.get(1));
    }
}
