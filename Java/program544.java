class Parent
{
    Parent()
    {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent
{
    Child()
    {
        System.out.println("Child Constructor");
    }
}

class program544
{
    public static void main(String A[])
    {
        Child cobj = new Child();
    }
}
