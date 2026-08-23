import java.util.*;

class Matrix
{
    public int Arr[][];

    public Matrix(int iRow, int iCol)
    {
        System.out.println("Inside Matrix Constructor");

        Arr = new int[iRow][iCol];
    }

    protected void finalize()
    {
        System.out.println("Inside finalize method");
        
       Arr = null;
       System.gc(); 
    }
}

class program221
{
    public static void main(String A[])
    {        
        Scanner sobj = new Scanner(System.in);

        int iRow = 0, iCol = 0;
        int i = 0, j = 0;

        System.out.println("Enter number of rows : ");
        iRow = sobj.nextInt();

        System.out.println("Enter number of coluns : ");
        iCol = sobj.nextInt();

        Matrix mobj = new Matrix(iRow, iCol);

        mobj = null;

        System.gc();
        
    }

}
