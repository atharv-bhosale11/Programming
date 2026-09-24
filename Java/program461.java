import java.util.*;

class program461
{
    public static void main(String A[])
    {
        HashMap<String,ArrayList<String>> hmap = new HashMap<String,ArrayList<String>>();

        hmap.put("A",new ArrayList<String>());
        hmap.put("B",new ArrayList<String>());
        hmap.put("C",new ArrayList<String>());

        hmap.get("A").add("Atharv");
        hmap.get("A").add("Rahul");

        hmap.get("B").add("Amit");
        hmap.get("B").add("Rohit");

        hmap.get("C").add("Sagar");

        for(Map.Entry<String,ArrayList<String>> entry : hmap.entrySet())
        {
            System.out.println("Grade : " + entry.getKey());
            System.out.println("Students : " + entry.getValue());
        }
    }
}
