class program535
{
    public static <T extends Number> double Average(T Arr[])
    {
        double dSum = 0;

        for(T no : Arr)
        {
            dSum = dSum + no.doubleValue();
        }

        return dSum / Arr.length;
    }

    public static void main(String A[])
    {
        Integer Arr[] = {10,20,30,40,50};

        double dRet = Average(Arr);

        System.out.println("Average : " + dRet);
    }
}
