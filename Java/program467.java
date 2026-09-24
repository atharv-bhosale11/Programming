import java.util.*;

class program467
{
    public static void main(String A[])
    {
        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));

        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(30,40,50,60,70));

        ArrayList<Integer> common = new ArrayList<Integer>(list1);

        common.retainAll(list2);

        System.out.println("Common Elements : " + common);
    }
}
