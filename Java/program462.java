import java.util.*;

class program462
{
    public static void main(String A[])
    {
        ArrayList<Integer> marks = new ArrayList<Integer>();

        marks.add(78);
        marks.add(92);
        marks.add(85);
        marks.add(96);
        marks.add(88);
        marks.add(75);

        Collections.sort(marks,Collections.reverseOrder());

        System.out.println("Top 3 Marks:");

        for(int i = 0; i < 3; i++)
        {
            System.out.println(marks.get(i));
        }
    }
}
