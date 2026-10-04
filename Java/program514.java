import java.util.*;
import java.util.stream.*;

class program514
{
    public static void main(String A[])
    {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        list.stream().map(no -> no * no).forEach(System.out::println);
    }
}
