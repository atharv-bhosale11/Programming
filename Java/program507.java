import java.util.*;

class program507
{
    public static void main(String A[])
    {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(30);

        list.forEach(
            no ->
            {
                if(no % 2 == 0)
                {
                    System.out.println(no);
                }
            });
    }
}
