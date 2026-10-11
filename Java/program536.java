class Employee
{
    int iId;
    String strName;
    double dSalary;

    Employee()
    {
        this(101, "Atharv");
    }

    Employee(int i, String str)
    {
        this(i, str, 50000);
    }

    Employee(int i, String str, double d)
    {
        iId = i;
        strName = str;
        dSalary = d;
    }

    void Display()
    {
        System.out.println("ID : " + iId);
        System.out.println("Name : " + strName);
        System.out.println("Salary : " + dSalary);
    }
}

class program536
{
    public static void main(String A[])
    {
        Employee eobj = new Employee();

        eobj.Display();
    }
}
