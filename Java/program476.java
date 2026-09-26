import java.util.*;

class Book
{
    int id;
    String name;

    Book(int id, String name)
    {
        this.id = id;
        this.name = name;
    } 

    public String toString()
    {
        return id + " " + name;
    }
}

class program476
{
    public static void main(String A[])
    {
        ArrayList<Book> library = new ArrayList<Book>();

        library.add(new Book(101,"Java"));
        library.add(new Book(102,"Python"));
        library.add(new Book(103,"C Programming"));

        System.out.println("Available Books :");
        for(Book b : library)
        {
            System.out.println(b);
        }

        int searchId = 102;
        boolean bFlag = false;

        for(Book b : library)
        {
            if(b.id == searchId)
            {
                System.out.println("\nBook Found : " + b);
                bFlag = true;
                break;
            }
        }

        if(bFlag == false)
        {
            System.out.println("Book not found");
        }

        library.removeIf(book -> book.id == 103);

        System.out.println("After Removal :");
        for(Book b : library)
        {
            System.out.println(b);
        }
    }
}
