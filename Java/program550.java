class Employee
{
    String strName; 

    Employee(String str)
    {
        strName = str;
    }

    void Display()
    {
        System.out.println("Employee : " + strName);
    }
}

class Developer extends Employee
{
    Developer(String str)
    {
        super(str);
    }

    void Work()
    {
        System.out.println("Developing Software");
    }
}

class Tester extends Employee
{
    Tester(String str)
    {
        super(str);
    }

    void Work()
    {
        System.out.println("Testing Software");
    }
}

class program550
{
    public static void main(String A[])
    {
        Developer dobj = new Developer("Atharv");
        Tester tobj = new Tester("Rahul");

        dobj.Display();
        dobj.Work();

        tobj.Display();
        tobj.Work();
    }
}
