import java.util.*;

class program482
{
    public static void main(String A[])
    {
        int Arr[] = {10,20,30,10,40,20,50,10};

        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();

        for(int no : Arr)
        {
            if(hmap.containsKey(no))
            {
                hmap.put(no,hmap.get(no)+1);
            }
            else
            {
                hmap.put(no,1);
            }
        }

        System.out.println("Duplicate Elements :");

        for(Map.Entry<Integer,Integer> entry : hmap.entrySet())
        {
            if(entry.getValue() > 1)
            {
                System.out.println(entry.getKey()+" occurs "+ entry.getValue()+"times");
            }
        }
    }
}
