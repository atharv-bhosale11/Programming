import java.util.TreeMap;

class program328
{
    public static void main(String A[])
    {
        if(A.length != 1)
        {
            System.out.println("Invalid Number of Arguments");
            return;
        }

        String str = A[0];

        TreeMap<Character,Integer> frequency = new TreeMap<Character,Integer>();

        for(char ch : str.toCharArray())
        {
            frequency.put(ch,frequency.getOrDefault(ch, 0) + 1);
        }

        System.out.println(frequency);

        // Issue in Ordering
    }
}
