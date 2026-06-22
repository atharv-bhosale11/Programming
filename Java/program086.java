/*

    iRow = 4
    iCol = 4

    $       @       @       @
    @       $       @       @
    @       @       $       @
    @       @       @       $

*/

import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        
        // Filter for Diagonal Pattern
        if (iRow != iCol)
        {
            System.out.println("Invalid Parameters!!!");
            System.out.println("Numbers of Rows and Columns Should be Same..........");
            return;
        }
        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {   
                if(i == j)      // Diagonal
                {
                    System.out.print("$\t");
                }
                else
                {
                    System.out.print("@\t");
                }
            }
            System.out.println();
        }
    }
}

class program86
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter the Number of Rows:  ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the Number of Columns: ");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iValue1, iValue2);

        sobj.close();
    }
}
