import java.util.*;

class program452
{
    public static void main(String A[])
    {
        Queue<Integer> qobj = new LinkedList<Integer>();

        qobj.add(10);
        qobj.add(20);
        qobj.add(30);

        System.out.println(qobj.poll());
        System.out.println(qobj.peek());
    }
}
