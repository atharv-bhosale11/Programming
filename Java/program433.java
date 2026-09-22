import java.util.*;

class program433
{
    public static void main(String A[])
    {
        ArrayList<Integer> list = new ArrayList<Integer>();  
 
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(10);

        int freq = Collections.frequency(list,10);

        System.out.println(freq);
    }
}
