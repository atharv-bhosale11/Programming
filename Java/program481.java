import java.util.*;

class program491
{
    public static void main(String A[])
    {
        TreeMap<String,Integer> students =
            new TreeMap<String,Integer>();

        students.put("Atharv",85);
        students.put("Rahul",92);
        students.put("Amit",78);
        students.put("Rohit",88);

        String topper = "";
        int maxMarks = Integer.MIN_VALUE;

        for(Map.Entry<String,Integer> entry :
                students.entrySet())
        {
            if(entry.getValue() > maxMarks)
            {
                maxMarks = entry.getValue();
                topper = entry.getKey();
            }
        }

        System.out.println("Topper : " + topper);
        System.out.println("Marks  : " + maxMarks);
    }
}
