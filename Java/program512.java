import java.util.*;
import java.util.stream.*;

class program512
{
    public static void main(String A[])
    {
        List<Integer> list = Arrays.asList(10,15,20,25,30,35);

        list.stream().filter(no -> no % 2 == 0).forEach(System.out::println);
    }
}
