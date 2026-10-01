class program494
{
    public static void main(String A[])
    {
        int iSum = 0;

        for(String str : A)
        {
            iSum += Integer.parseInt(str);
        }

        System.out.println("Sum : "+iSum);
    }
}
