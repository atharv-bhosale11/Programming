import java.util.*;

class program443
{
    public static void main(String A[])
    {
        HashMap<String,ArrayList<String>> hobj = new HashMap<String,ArrayList<String>>();

        hobj.put("A", new ArrayList<String>(Arrays.asList("Amit","Pooja")));

        hobj.put("B", new ArrayList<String>(Arrays.asList("Rahul","Neha")));

        System.out.println(hobj);
    }
}
