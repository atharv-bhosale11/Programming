import java.util.*;

class Movie
{
    String name;
    double rating;

    Movie(String name, double rating)
    {
        this.name = name;
        this.rating = rating;
    }

    public String toString()
    {
        return name + " " + rating;
    }
}

class program413
{
    public static void main(String A[])
    {
        ArrayList<Movie> aobj = new ArrayList<Movie>();

        aobj.add(new Movie("MovieA", 8.5));
        aobj.add(new Movie("MovieB", 9.1));
        aobj.add(new Movie("MovieC", 7.8));

        Collections.sort(aobj, new Comparator<Movie>()
        {
            public int compare(Movie M1, Movie M2)
            {
                return Double.compare(M2.rating, M1.rating);
            }
        });

        for(Movie m : aobj)
        {
            System.out.println(m);
        }
    }
}
