import java.util.*;

class program495
{
    public static void main(String A[])
    {
        String str = "aabbccddefg";

        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();

        for(char ch : str.toCharArray())
        {
            hmap.put(ch, hmap.getOrDefault(ch, 0) + 1);
        }

        char result = '\0';

        for(char ch : str.toCharArray())
        {
            if(hmap.get(ch) == 1)
            {
                result = ch;
                break;
            }
        }

        if(result != '\0')
        {
            System.out.println("First Non-Repeated Character : " + result);
        }
        else
        {
            System.out.println("No Unique Character Found");
        }
    }
}
