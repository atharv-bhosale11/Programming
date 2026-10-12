class Employee
{
    String strName = "Atharv";
    int iId = 101;
}

class Manager extends Employee
{
    double dSalary = 60000;

    void Display()
    {
        System.out.println("Name : " + strName);
        System.out.println("ID : " + iId);
        System.out.println("Salary : " + dSalary);
    }
}

class program540
{
    public static void main(String A[])
    {
        Manager mobj = new Manager();

        mobj.Display();
    }
}
