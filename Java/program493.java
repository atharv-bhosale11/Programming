class Arithmetic
{
    int Addition(int... Arr)
    {
        int iSum = 0;

        for(int no : Arr)
        {
            iSum += no;
        }

        return iSum;
    }
}

class program493
{
    public static void main(String A[]) 
    {
        Arithmetic aobj = new Arithmetic();

        System.out.println(aobj.Addition(10,20));
        System.out.println(aobj.Addition(10,20,30,40));
    }
}
