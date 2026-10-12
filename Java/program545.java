class Employee
{
    String strName;
    int iId;

    Employee(String str, int i)
    {
        strName = str;
        iId = i;
    }
}

class Manager extends Employee
{
    double dSalary;

    Manager(String str, int i, double d)
    {
        super(str, i);

        dSalary = d;
    }

    void Display()
    {
        System.out.println("Name : " + strName);
        System.out.println("ID : " + iId);
        System.out.println("Salary : " + dSalary);
    }
}

class program545
{
    public static void main(String A[])
    {
        Manager mobj =
            new Manager("Atharv", 101, 75000);

        mobj.Display();
    }
}
