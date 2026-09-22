import java.util.*;

class program434
{
    public static void main(String A[])
    { 
       
        ArrayList<Integer> src = new ArrayList<Integer>(); 

        src.add(10);
        src.add(20);
        src.add(30);

        ArrayList<Integer> dest =
            new ArrayList<Integer>(src); 

        System.out.println(dest);
      
    }
}
