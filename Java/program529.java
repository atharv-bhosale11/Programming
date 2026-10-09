import java.io.*;

class program529
{
    public static void main(String A[])
    {
        File fobj = new File("Demo.txt");

        if(fobj.exists())
        {
            System.out.println("File Name : "+ fobj.getName());

            System.out.println("Path : "+ fobj.getAbsolutePath());

            System.out.println("Size : "
                                + fobj.length()
                                + " bytes");
        }
    }
}
