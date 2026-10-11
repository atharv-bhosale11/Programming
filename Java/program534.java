import java.util.*;

class program534
{
    public static double CalculateSum(List<? extends Number> list)
    {
        double dSum = 0;

        for(Number no : list)
        {
            dSum = dSum + no.doubleValue();
        }

        return dSum;
    }

    public static void main(String A[])
    {
        List<Integer> iList = Arrays.asList(10,20,30,40);

        List<Double> dList = Arrays.asList(10.5,20.5,30.5);

        System.out.println("Integer Sum : " + CalculateSum(iList));

        System.out.println("Double Sum : " + CalculateSum(dList));
    }
}
