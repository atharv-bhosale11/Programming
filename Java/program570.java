class Animal
{
    void Sound()
    {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal
{
    @Override
    void Sound()
    {
        super.Sound();

        System.out.println("Dog barks");
    }
}

class program570
{
    public static void main(String A[])
    {
        Dog dobj = new Dog();

        dobj.Sound();
    }
}
