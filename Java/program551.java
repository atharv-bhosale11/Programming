class Person 
{
    String strName;

    Person(String str)
    { 
        strName = str;
        System.out.println("Person Constructor");
    }
}

class Employee extends Person
{
    int iId;

    Employee(String str, int i)
    {
        super(str);
        iId = i;
        System.out.println("Employee Constructor");
    }
}

class Manager extends Employee
{
    double dSalary;

    Manager(String str, int i, double d)
    {
        super(str, i);
        dSalary = d;
        System.out.println("Manager Constructor");
    }

    void Display()
    {
        System.out.println("Name : " + strName);
        System.out.println("ID : " + iId);
        System.out.println("Salary : " + dSalary);
    }
}

class program551
{
    public static void main(String A[])
    {
        Manager mobj = new Manager("Atharv", 101, 75000);

        mobj.Display();
    }
}
