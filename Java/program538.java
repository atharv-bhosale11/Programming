class Parent
{
    int iValue = 100;

    void Display()
    { 
        System.out.println("Parent Class Method"); 
    }
}

class Child extends Parent
{
    int iValue = 200;

    void Show()
    {
        System.out.println("Parent Value : " + super.iValue);

        System.out.println("Child Value : " + iValue);

        super.Display();
    }
}

class program538
{
    public static void main(String A[])
    {
        Child cobj = new Child();

        cobj.Show();
    }
}
