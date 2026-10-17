abstract class Employee
{
    String strName;

    Employee(String str)
    {
        strName = str;
    }

    abstract double CalculateSalary();
}

class FullTimeEmployee extends Employee 
{
    double dMonthlySalary;

    FullTimeEmployee(String str, double dSalary)
    {
        super(str);
        dMonthlySalary = dSalary;
    }

    double CalculateSalary()
    {
        return dMonthlySalary;
    }
}

class PartTimeEmployee extends Employee
{
    int iHours;
    double dRate;

    PartTimeEmployee(String str, int i, double d)
    {
        super(str);
        iHours = i;
        dRate = d;
    }

    double CalculateSalary()
    {
        return iHours * dRate;
    }
}

class program556
{
    public static void main(String A[])
    {
        Employee eobj;

        eobj = new FullTimeEmployee("Atharv", 50000);
        System.out.println(eobj.strName + " Salary : " +eobj.CalculateSalary());

        eobj = new PartTimeEmployee("Rahul", 80, 200);
        System.out.println(eobj.strName + " Salary : " +eobj.CalculateSalary());
    }
}
