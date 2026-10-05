import java.util.function.Predicate;

class program522
{
    public static void main(String A[]) 
    {
        Predicate<Integer> pobj = no -> no > 50;

        System.out.println(pobj.test(75));
    }
}
