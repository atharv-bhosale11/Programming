import java.util.*;

class program455
{
    public static void main(String A[])
    {
        String str = "swiss";

        LinkedHashMap<Character,Integer> hobj = new LinkedHashMap<Character,Integer>();

        for(char ch : str.toCharArray())
        {
            hobj.put(ch,hobj.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> e : hobj.entrySet())
        {
            if(e.getValue() == 1)
            {
                System.out.println(e.getKey());
                break;
            }
        }
    }
}
