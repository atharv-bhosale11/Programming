class Animal
{
    void Display()
    {
        System.out.println("This is an Animal");
    }
}

class Dog extends Animal
{
    void Bark()
    {
        System.out.println("Dog is barking");
    }
}

class program560
{
    public static void main(String A[])
    {
        // Upcasting
        Animal aobj = new Dog();

        aobj.Display();

        // Downcasting
        Dog dobj = (Dog)aobj;

        dobj.Display();
        dobj.Bark();
    }
}
