import java.io.*;

class program524
{
    public static void main(String A[])
    {
        try
        { 
            FileReader fobj = new FileReader("Demo.txt");

            BufferedReader bobj =  new BufferedReader(fobj);

            String str = null;

            while((str = bobj.readLine()) != null)
            {
                System.out.println(str);
            }
 
            bobj.close();
            fobj.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
