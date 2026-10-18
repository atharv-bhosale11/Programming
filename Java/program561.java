class Animal
{
    Animal GetObject()
    {
        System.out.println("Animal Object");
        return new Animal();
    }
}

class Dog extends Animal
{
    @Override
    Dog GetObject()
    {
        System.out.println("Dog Object");
        return new Dog();
    }
}

class program561
{
    public static void main(String A[])
    {
        Animal aobj = new Animal();
        aobj.GetObject();

        Dog dobj = new Dog();
        dobj.GetObject();
    }
}
