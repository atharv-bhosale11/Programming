import java.io.*;

class program526
{
    public static void main(String A[])
    {
        try
        {
            BufferedReader bobj =  new BufferedReader( new FileReader("Demo.txt"));

            BufferedWriter wobj =
                new BufferedWriter(
                    new FileWriter("Copy.txt"));

            String str = null;

            while((str = bobj.readLine()) != null)
            {
                wobj.write(str);
                wobj.newLine();
            }

            bobj.close();
            wobj.close();

            System.out.println("File Copied Successfully");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
