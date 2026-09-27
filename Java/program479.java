import java.util.*;

class program479
{
    public static void main(String A[])
    {
        TreeMap<Integer,Integer> employees = new TreeMap<Integer,Integer>();

        employees.put(104,70000);
        employees.put(101,50000);
        employees.put(103,65000);
        employees.put(102,80000);

        for(Map.Entry<Integer,Integer> entry :
                employees.entrySet())
        {
            System.out.println("Emp ID : "
                    + entry.getKey()
                    + " Salary : "
                    + entry.getValue());
        }
    }
}
