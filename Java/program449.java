import java.util.*;

class program449
{
    public static void main(String A[])
    {
        PriorityQueue<String> pobj =
            new PriorityQueue<String>();

        pobj.add("Java");
        pobj.add("C");
        pobj.add("Python");

        while(!pobj.isEmpty())
        {
            System.out.println(pobj.poll());
        }
    }
}
