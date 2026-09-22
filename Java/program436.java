import java.util.*;

class program436
{
    public static void main(String A[])
    {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Java");
        list.add("Python");

        String Arr[] = list.toArray(new String[0]);

        for(String str : Arr)
        {
            System.out.println(str);
        }
    }
}
