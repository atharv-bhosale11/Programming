import java.util.*;

class program435
{
    public static void main(String A[])
    { 
        ArrayList<Integer> list = new ArrayList<Integer>();
 
        list.add(10);
        list.add(20);
        list.add(30); 

        Collections.swap(list,0,2);

        System.out.println(list);
      
    }
}
