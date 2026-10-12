class Parent
{
    void Display()
    {
        System.out.println("Parent Class Method"); 
    }
}

class Child extends Parent
{
    void Show()
    {
        System.out.println("Child Class Method");
    }
}
 
class program539
{
    public static void main(String A[])
    {
        Child cobj = new Child();

        cobj.Display();
        cobj.Show();
    }
}
