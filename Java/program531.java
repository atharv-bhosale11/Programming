import java.io.*;

class program531
{
    public static void main(String A[])
    {
        File fobj = new File("."); 

        File Arr[] = fobj.listFiles();

        for(File file : Arr)
        {
            if(file.isFile())
            {
                System.out.println(file.getName());
            }
        }
    }
}
