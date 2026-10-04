import java.util.*;

class program515
{
    public static void main(String A[])
    {
        List<String> list = Arrays.asList("jay","shree","ganesh");

        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
