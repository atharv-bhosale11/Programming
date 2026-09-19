import java.util.*;

class Book
{
    String title;
    int pages;

    Book(String title, int pages)
    {
        this.title = title;
        this.pages = pages;
    }

    public String toString()
    {
        return title + " " + pages;
    }
}

class program417
{
    public static void main(String A[])
    {
        ArrayList<Book> aobj = new ArrayList<Book>();

        aobj.add(new Book("Java", 500));
        aobj.add(new Book("Python", 450));
        aobj.add(new Book("DSA", 700));

        Collections.sort(aobj, new Comparator<Book>()
        {
            public int compare(Book B1, Book B2)
            {
                return B2.pages - B1.pages;
            }
        });

        for(Book b : aobj)
        {
            System.out.println(b);
        }
    }
}
