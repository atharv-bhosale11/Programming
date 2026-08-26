import java.util.*;

class ArrayX
{
    public int Arr[];
    public int iSize;

    public ArrayX(int iSize)
    {
        this.iSize = iSize;
        Arr = new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number: ");

        for(int i = 0; i < iSize; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    public void Display()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Elements of the Array are: ");

        for(int i = 0; i < iSize; i++)
        {
            System.out.print(Arr[i]+"\t");
        }
        System.out.println();
    }
}

class program268
{
    public static void main(String A[])
    {
        ArrayX aobj = new ArrayX(5);

        aobj.Accept();
        aobj.Display();
    }
}
