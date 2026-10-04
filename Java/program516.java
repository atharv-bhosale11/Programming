import java.util.*;

class program516
{
    public static void main(String A[])
    {
        List<Integer> list = Arrays.asList(10,60,20,70,30,80);

        long count = list.stream()
                .filter(no -> no > 50)
                .count();

        System.out.println(count);
    }
}
