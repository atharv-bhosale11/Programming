class Animal
{
    void Eat()
    {
        System.out.println("Animal Eats");
    }
}

class Dog extends Animal
{
    void Bark()
    {
        System.out.println("Dog Barks");
    }
}

class Puppy extends Dog
{
    void Weep()
    {
        System.out.println("Puppy Weeps");
    }
}

class program542
{
    public static void main(String A[])
    {
        Puppy pobj = new Puppy();

        pobj.Eat();
        pobj.Bark();
        pobj.Weep();
    }
}
