class Employee
{
    String name;
    double salary;
    double bonus;

    Employee(String n,double s,double b)
    {
        name = n;
        salary = s;
        bonus = b;
    }

    double TotalSalary()
    {
        return salary + bonus;
    }
}

class program503
{
    public static void main(String A[])
    { 
        Employee eobj =
            new Employee("Atharv",50000,10000);

        System.out.println(
            eobj.TotalSalary());
    }
}
