import java.io.FileWriter;
import java.io.IOException;

class program523
{
    public static void main(String A[])
    {
        try
        {
            FileWriter fobj = new FileWriter("Demo.txt");
 
            fobj.write("Welcome to Java File Handling");

            fobj.close();

            System.out.println("Data written successfully");
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
