class Grandparent
{
    void DisplayGrandparent()
    {
        System.out.println("This is Grandparent class");
    }
}

class Parent extends Grandparent
{
    void DisplayParent()
    {
        System.out.println("This is Parent class");
    }
}

class Child extends Parent
{
    void DisplayChild()
    {
        System.out.println("This is Child class");
    }
}

class program571
{
    public static void main(String A[])
    {
        Child cobj = new Child();

        cobj.DisplayGrandparent();
        cobj.DisplayParent();
        cobj.DisplayChild();
    }
}
