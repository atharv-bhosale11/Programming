import java.util.*;

class program456
{
    public static void main(String A[])
    {
        HashMap<String,Integer> hobj =
            new HashMap<String,Integer>();

        hobj.put("A",90);
        hobj.put("B",70);
        hobj.put("C",80);

        ArrayList<Map.Entry<String,Integer>> list =
            new ArrayList<>(hobj.entrySet());

        Collections.sort(list,
            (a,b) -> a.getValue()-b.getValue());

        System.out.println(list);
    }
}
