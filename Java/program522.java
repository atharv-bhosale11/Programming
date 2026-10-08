import java.util.StringTokenizer;

class program522
{
    public static void main(String A[])
    {
        String str = "Java is a powerful programming language";

        StringTokenizer sobj = new StringTokenizer(str);

        while(sobj.hasMoreTokens())
        {
            System.out.println(sobj.nextToken());
        }
    }
}
