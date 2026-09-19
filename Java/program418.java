import java.util.*;

class Player
{
    String name;
    int score;

    Player(String name, int score)
    {
        this.name = name;
        this.score = score;
    }

    public String toString()
    {
        return name + " " + score;
    }
}

class program418
{
    public static void main(String A[])
    {
        ArrayList<Player> aobj = new ArrayList<Player>();

        aobj.add(new Player("Amit", 90));
        aobj.add(new Player("Rahul", 85));
        aobj.add(new Player("Pooja", 90));
        aobj.add(new Player("Neha", 80));

        Collections.sort(aobj, new Comparator<Player>()
        {
            public int compare(Player P1, Player P2)
            {
                if(P1.score != P2.score)
                {
                    return P2.score - P1.score;
                }
                return P1.name.compareTo(P2.name);
            }
        });

        for(Player p : aobj)
        {
            System.out.println(p);
        }
    }
}
