import java.util.*;

class program469
{
    public static void main(String A[])
    {
        HashMap<String,Integer> students = new HashMap<String,Integer>();

        students.put("Atharv",85);
        students.put("Rahul",92);
        students.put("Amit",78);
        students.put("Rohit",88);

        String topper = "";
        int max = Integer.MIN_VALUE;

        for(Map.Entry<String,Integer> entry : students.entrySet())
        {
            if(entry.getValue() > max)
            {
                max = entry.getValue();
                topper = entry.getKey();
            }
        }

        System.out.println("Topper : " + topper);
        System.out.println("Marks  : " + max);
    }
}
