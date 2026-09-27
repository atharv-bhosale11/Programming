import java.util.*;

class program480
{
    public static void main(String A[])
    {
        TreeMap<String,String> dictionary = new TreeMap<String,String>();

        dictionary.put("Array", "Collection of similar elements");

        dictionary.put("Class","Blueprint of an object");

        dictionary.put("Object","Instance of a class");

        for(Map.Entry<String,String> entry :
                dictionary.entrySet())
        {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println();
        }
    }
}
