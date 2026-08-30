// Complete Searching Code

import java.util.*;

interface GetterSetter
{
    void Accept();
    void Display();
}

class ArrayX implements GetterSetter
{
    protected  int Arr[];
    protected  int iSize;

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

final class Searching extends ArrayX
{
    public Searching(int iSize)
    {
        super(iSize);
    }

    public boolean LinerSearch(int iNo)
    {
        int i = 0;
        boolean bFlag = false;
        for(i = 0; i < super.iSize; i++)
        {
            if(Arr[i] == iNo)
            {
                bFlag = true;
                break;
            }

        }
        return bFlag;
    }

    public boolean BiDirectionalSearch(int iNo)
    {
        int iStart = 0, iEnd = 0;
        boolean bFlag = false;

        iStart = 0;
        iEnd = super.iSize - 1;

        while(iStart <= iEnd)
        {
            if(Arr[iStart] == iNo || Arr[iEnd] == iNo)
            {
                bFlag = true;
                break;
            }
            iStart++;
            iEnd--;
        }

        return bFlag;
    }

    public boolean CheckSorted()
    {
        int i  = 0;
        boolean bFlag = true;

        for(i = 0 ; i < iSize - 1 ; i++)
        {
            if(Arr[i] > Arr[i + 1])
            {
                bFlag = false;
                break;
            }
        }
        return bFlag;
    }

    public boolean BinarySearch(int iNo)
    {
        int iStart = 0, iEnd = 0, iMid = 0;
        boolean bFlag = false;

        if(CheckSorted() == false)
        {
            return BiDirectionalSearch(iNo);
            
        }

        iStart = 0;
        iEnd = iSize - 1;

        if((iNo < Arr[iStart]) || (iNo > Arr[iEnd]))
        {
            return false;
        }

        while(iStart <= iEnd)
        {
            iMid = iStart + ((iEnd - iStart) / 2);

            if(Arr[iMid] == iNo || Arr[iStart] == iNo || Arr[iEnd] == iNo)
            {
                bFlag = true;
                break;
            }
            else if(iNo < Arr[iMid])
            {
                iEnd = iMid - 1;
            }
            else if(iNo > Arr[iMid])
            {
                iStart = iMid + 1;
            }
        }
        return bFlag;
    }
}


class program294
{
    public static void main(String A[])
    {
      Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int iSize = sobj.nextInt();

        Searching srobj = new Searching(iSize);

        srobj.Accept();
        srobj.Display();

        System.out.println("Enter element to search: ");
        int iNo = sobj.nextInt();

        if(srobj.LinerSearch(iNo))
            System.out.println("Element found using Linear Search");
        else
            System.out.println("Element not found using Linear Search");

        if(srobj.BiDirectionalSearch(iNo))
            System.out.println("Element found using BiDirectional Search");
        else
            System.out.println("Element not found using BiDirectional Search");

        if(srobj.BinarySearch(iNo))
            System.out.println("Element found using Binary Search");
        else
            System.out.println("Element not found using Binary Search");
    }
}
