import java.util.*;

class City
{
    String name;
    long population;

    City(String name, long population)
    {
        this.name = name;
        this.population = population;
    }

    public String toString()
    {
        return name + " " + population;
    }
}

class program414
{
    public static void main(String A[])
    {
        ArrayList<City> aobj = new ArrayList<City>();

        aobj.add(new City("Mumbai", 20000000));
        aobj.add(new City("Pune", 7000000));
        aobj.add(new City("Nashik", 2500000));

        Collections.sort(aobj, new Comparator<City>()
        {
            public int compare(City C1, City C2)
            {
                return Long.compare(C2.population, C1.population);
            }
        });

        for(City c : aobj)
        {
            System.out.println(c);
        }
    }
}
