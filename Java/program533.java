import java.io.*;

class program533
{
    public static void main(String A[])
    {
        File fobj = new File("Demo.txt");

        if(fobj.delete())
        {
            System.out.println("File Deleted");
        }
        else
        {
            System.out.println("Unable to Delete File"); 
        }
    }
}
