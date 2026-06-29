import java.util.Scanner;

class program108
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        String Arr = null;

        System.out.println("Enter String: ");
        Arr = sobj.nextLine();

        System.out.println("Length of String is: "+Arr.length());
    
        sobj.close();
    }
}
