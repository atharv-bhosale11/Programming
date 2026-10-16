class Parent
{
    final void Display()
    {
        System.out.println("Final Method of Parent");
    }
}

class Child extends Parent
{
    void Show()
    {
        System.out.println("Child Class Method");
    }
}

class program548
{
    public static void main(String A[])
    {
        Child cobj = new Child();

        cobj.Display();
        cobj.Show();
    }
}
