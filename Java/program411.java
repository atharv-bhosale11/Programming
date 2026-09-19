import java.util.*;

class Product
{
    String name;
    int price;

    Product(String name, int price)
    {
        this.name = name;
        this.price = price;
    }

    public String toString()
    {
        return name + " " + price;
    }
}

class program411
{
    public static void main(String A[])
    {
        ArrayList<Product> aobj = new ArrayList<Product>();

        aobj.add(new Product("Mouse", 800));
        aobj.add(new Product("Keyboard", 1200));
        aobj.add(new Product("Monitor", 10000));
        aobj.add(new Product("Pen Drive", 600));

        Collections.sort(aobj, new Comparator<Product>()
        {
            public int compare(Product P1, Product P2)
            {
                return P1.price - P2.price;
            }
        });

        for(Product p : aobj)
        {
            System.out.println(p);
        }
    }
}
