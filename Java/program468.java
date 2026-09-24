import java.util.*;

class program468
{
    public static void main(String A[])
    {
        ArrayList<String> names = new ArrayList<String>();

        names.add("Sujit");
        names.add("Mohan");
        names.add("Sujit"); 
        names.add("Amit");
        names.add("Mohan");

        LinkedHashSet<String> unique =
            new LinkedHashSet<String>(names);

        System.out.println(unique);
    }
}
