import java.util.*;

class program454
{
    public static void main(String A[])
    {
        String str = "java python java c java";

        HashMap<String,Integer> hobj =
            new HashMap<String,Integer>();

        String Arr[] = str.split(" ");

        for(String s : Arr)
        {
            hobj.put(s,hobj.getOrDefault(s,0)+1);
        }

        System.out.println(hobj);
    }
}
