import java.io.*;

class program525
{
    public static void main(String A[])
    {
        int iLines = 0;
        int iWords = 0;
        int iChars = 0;

        try
        {
            BufferedReader bobj = new BufferedReader(new FileReader("Demo.txt"));

            String str = null;

            while((str = bobj.readLine()) != null)
            {
                iLines++;

                iChars += str.length();

                String Arr[] = str.split("\\s+");

                iWords += Arr.length;
            }

            bobj.close();

            System.out.println("Lines      : " + iLines);
            System.out.println("Words      : " + iWords);
            System.out.println("Characters : " + iChars);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
