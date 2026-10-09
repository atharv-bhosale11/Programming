import java.io.*;

class program528
{
    public static void main(String A[])
    {
        File fobj = new File("Demo.txt");

        if(fobj.exists())
        {
            System.out.println("File Exists");
        }
        else
        { 
            System.out.println("File Does Not Exist");
        }
    }
}
