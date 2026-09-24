import java.util.*;

class program468
{
    public static void main(String A[])
    {
        ArrayList<String> names =new ArrayList<String>();

        names.add("Atharv");
        names.add("Rahul");
        names.add("Atharv");
        names.add("Amit");
        names.add("Rahul");

        LinkedHashSet<String> unique =
            new LinkedHashSet<String>(names);

        System.out.println(unique);
    }
}
