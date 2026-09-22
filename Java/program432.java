import java.util.*;

class program432
{ 
    public static void main(String A[])
    {
        ArrayList<String> list = new ArrayList<String>(); 

        list.add("A"); 
        list.add("B"); 
        list.add("C");
        list.add("D");

        Collections.shuffle(list);

        System.out.println(list);
    }
}
