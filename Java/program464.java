import java.util.*;

class program464
{
    public static void main(String A[])
    {
        String str = "java is easy and java is powerful";

        String words[] = str.split(" ");

        HashMap<String,Integer> hmap =
            new HashMap<String,Integer>();

        for(String word : words)
        {
            hmap.put(word,hmap.getOrDefault(word,0) + 1);
        }

        for(Map.Entry<String,Integer> entry : hmap.entrySet())
        {
            System.out.println(entry.getKey() + " : "
                                + entry.getValue());
        }
    }
}
