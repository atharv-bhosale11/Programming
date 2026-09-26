import java.util.*;

class program473
{
    public static void main(String A[])
    {
        HashMap<String,Boolean> attendance = new HashMap<String,Boolean>();

        attendance.put("Sujit",true);
        attendance.put("Rajan",false);
        attendance.put("Amit",true);
        attendance.put("Rohit",false);

        System.out.println("Absent Students");

        for(Map.Entry<String,Boolean> entry : attendance.entrySet())
        {
            if(entry.getValue() == false)
            {
                System.out.println(entry.getKey());
            }
        }
    }
}
