import java.util.*;

class program470
{
    public static void main(String A[])
    {
        TreeMap<String,Integer> cities =
            new TreeMap<String,Integer>();

        cities.put("Mumbai",200);
        cities.put("Pune",100);
        cities.put("Nashik",80);
        cities.put("Nagpur",90);

        for(Map.Entry<String,Integer> entry : cities.entrySet())
        {
            System.out.println(entry.getKey()+" : "
                                + entry.getValue());
        }
    }
}
