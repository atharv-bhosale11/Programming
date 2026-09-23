import java.util.*;

class program450
{
    public static void main(String A[])
    {
        Stack<Integer> sobj = new Stack<Integer>();

        sobj.push(10);
        sobj.push(20);
        sobj.push(30);

        System.out.println(sobj.pop());
        System.out.println(sobj.peek());
    }
}
