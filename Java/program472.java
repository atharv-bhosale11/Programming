import java.util.*;

class program472
{
    public static void main(String A[])
    {
        String votes[] =
        {
            "A","B","A","C","A","B","C","B","A"
        };

        HashMap<String,Integer> result = new HashMap<String,Integer>();

        for(String vote : votes)
        {
            result.put(vote,result.getOrDefault(vote,0)+1);
        } 

        System.out.println(result);
    }
}
