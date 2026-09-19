import java.util.*;

class program416
{
    public static void main(String A[])
    {
        ArrayList<Integer> aobj = new ArrayList<Integer>();

        aobj.add(34);
        aobj.add(22);
        aobj.add(17);
        aobj.add(45);
        aobj.add(51);
        aobj.add(69);

        Collections.sort(aobj, new Comparator<Integer>()
        {
            public int compare(Integer i1, Integer i2)
            {
                return (i1 % 10) - (i2 % 10);
            }
        });

        for(Integer i : aobj)
        {
            System.out.println(i);
        }
    }
}
