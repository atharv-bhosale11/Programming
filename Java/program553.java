class Employee
{
    void CalculateBonus()
    {
        System.out.println("General Employee Bonus");
    }
}

class Developer extends Employee
{
    @Override
    void CalculateBonus()
    {
        System.out.println("Developer Bonus : 10000");
    }
}

class Manager extends Employee
{
    @Override
    void CalculateBonus()
    {
        System.out.println("Manager Bonus : 20000");
    }
}

class program553
{
    public static void main(String A[])
    {
        Employee eobj;

        eobj = new Developer();
        eobj.CalculateBonus();

        eobj = new Manager();
        eobj.CalculateBonus();
    }
}
