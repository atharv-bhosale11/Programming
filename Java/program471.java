import java.util.*;

class program471
{
    public static void main(String A[])
    {
        HashMap<String,Integer> expenses =
            new HashMap<String,Integer>();

        expenses.put("Food",500);
        expenses.put("Travel",300);
        expenses.put("Mobile Recharge",200);
        expenses.put("Shopping",1000);

        int total = 0;

        for(Integer amount : expenses.values())
        {
            total = total + amount;
        }

        System.out.println("Total Expense : " + total);
    }
}
