class Animal
{
    void Eat()
    {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal 
{
    void Bark()
    {
        System.out.println("Dog is barking");
    }
}

class program567
{
    public static void main(String A[])
    {
        Dog dobj = new Dog();

        dobj.Eat();
        dobj.Bark();
    }
}
