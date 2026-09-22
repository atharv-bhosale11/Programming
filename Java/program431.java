import java.util.*;

class program431
{
    public static void main(String A[])
    {  
        ArrayList<Integer> list = new ArrayList<Integer>(); 

        list.add(10);
        list.add(20);
        list.add(30);

        Collections.reverse(list);

        System.out.println(list);
    }
}
