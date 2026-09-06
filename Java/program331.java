import java.util.LinkedHashMap;

class program331
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

        for(char ch : frequency.keySet())
        {
            if(frequency.get(ch) == 1)
            {
                System.out.println("First Non repetative charachter is   : "+ch);
                break;
            }
        }

    }
}
