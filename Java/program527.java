import java.io.*;

class program527
{
    public static void main(String A[])
    {
        try
        {
            FileWriter fobj = new FileWriter("Demo.txt", true);
 
            fobj.write("\nNew Data Added");

            fobj.close();

            System.out.println("Data Appended");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
