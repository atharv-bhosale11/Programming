import java.util.*;

class program422
{
    public static void main(String A[])
    {
        int Arr[] = {10,20,10,30,20,10};

        HashMap<Integer,Integer> hobj = new HashMap<Integer,Integer>();

        for(int no : Arr)
        {
            if(hobj.containsKey(no))
            {
                hobj.put(no,hobj.get(no)+1);
            }
            else
            {
                hobj.put(no,1);
            }
        }

        System.out.println(hobj);
    }
}
