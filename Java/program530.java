import java.io.*;

class program530
{
    public static void main(String A[])
    {
        File fobj = new File("Marvellous");

        if(fobj.mkdir())
        {
            System.out.println(
                "Directory Created");
        }
        else
        {
            System.out.println(
                "Directory Already Exists");
        }
    }
}
