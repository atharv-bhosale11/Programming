class Employee
{
    final void DisplayCompany()
    {
        System.out.println("Company : OpenAI");
    }

    void DisplayRole()
    {
        System.out.println("Role : Employee");
    }
}

class Manager extends Employee
{
    @Override
    void DisplayRole()
    {
        System.out.println("Role : Manager");
    }
}

class program558
{
    public static void main(String A[])
    {
        Manager mobj = new Manager();

        mobj.DisplayCompany();
        mobj.DisplayRole();
    }
}
