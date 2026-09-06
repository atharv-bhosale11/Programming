import java.util.*;

class program332
{
    public static void main(String A[])
    {
        if(A.length != 1)
        {
            System.out.println("Invalid Number of Arguments");
            return;
        }

        String str = A[0];

        LinkedHashMap<Character,Integer> frequency = new LinkedHashMap<Character,Integer>();

        for(char ch : str.toCharArray())
        {
            frequency.put(ch,frequency.getOrDefault(ch, 0) + 1);
        }

        for(Map.Entry<Character, Integer> eobj : frequency.entrySet())
        {
            if(eobj.getValue() == 1)
            {
                System.out.println("First Non-Repetative Charachter: "+eobj.getKey());
                break;
            }
        }

        
    }
}
