class Employee
{
    protected int iId = 101; 
    protected String strName = "Atharv";

    protected void Display()
    {
        System.out.println("Employee Details");
    }
}

class Manager extends Employee
{
    void Show()
    {
        Display();

        System.out.println("ID : " + iId);
        System.out.println("Name : " + strName);
    }
}

class program547
{
    public static void main(String A[])
    {
        Manager mobj = new Manager();

        mobj.Show();
    }
}
