import java.util.*;

class program466
{
    public static void main(String A[])
    {
        HashMap<String,Integer> inventory = new HashMap<String,Integer>();

        inventory.put("Laptop",10);
        inventory.put("Mouse",25);
        inventory.put("Keyboard",15);
        inventory.put("Monitor",8);

        System.out.println("Inventory Details");

        for(Map.Entry<String,Integer> entry : inventory.entrySet())
        {
            System.out.println(entry.getKey()+" : "
                                + entry.getValue());
        }
    }
}
