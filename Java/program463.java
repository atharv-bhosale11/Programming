import java.util.*;

class program463
{
    public static void main(String A[])
    {
        HashMap<String,String> contacts =
            new HashMap<String,String>();

        contacts.put("Atharv","9876543210");
        contacts.put("Rahul","9123456780");
        contacts.put("Amit","9988776655");
        contacts.put("Rohit","9090909090");

        String name = "Rahul";

        if(contacts.containsKey(name))
        {
            System.out.println("Contact Found");
            System.out.println("Name : " + name);
            System.out.println("Number : " + contacts.get(name));
        }
        else
        {
            System.out.println("Contact Not Found");
        }
    }
}
