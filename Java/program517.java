import java.util.*;

class program517
{
    public static void main(String A[])
    {
        List<Integer> list = Arrays.asList(10,50,20,90,30);

        int max = list.stream().max(Integer::compare).get();

        System.out.println(max);
    }
}
