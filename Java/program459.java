import java.util.*;

class program459
{
    public static void main(String A[])
    {
        HashMap<Integer,String> students = new HashMap<>();

        students.put(101,"Atharv");
        students.put(102,"Rahul");
        students.put(103,"Amit");

        System.out.println("Students : "+students);

        System.out.println("Search Roll 102 : " + students.get(102));

        students.put(102,"Rohit");

        students.remove(103);

        System.out.println("Updated Data : "
                            + students);
    }
}
