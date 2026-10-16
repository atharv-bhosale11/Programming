class Employee
{
    void CalculateSalary()
    {
        System.out.println("Basic Salary Calculation");
    }
}
 
class Manager extends Employee
{
    @Override
    void CalculateSalary()
    {
        super.CalculateSalary();

        System.out.println("Manager Bonus Calculation");
    }
}

class program552 
{
    public static void main(String A[])
    {
        Manager mobj = new Manager();

        mobj.CalculateSalary(); 
    }
}
