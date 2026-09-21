import java.util.*;

class program420
{
    public static void main(String A[])
    {
        ArrayList<Integer> aobj = new ArrayList<Integer>();

        aobj.add(11);
        aobj.add(21);
        aobj.add(51);
        aobj.add(101);
        aobj.add(31);

        int iMax = Collections.max(aobj);

        System.out.println("Maximum element is : " + iMax);
    }
}
