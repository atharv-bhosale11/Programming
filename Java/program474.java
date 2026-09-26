import java.util.*;

class Employee
{
    String name;
    int salary;

    Employee(String name,int salary)
    {
        this.name = name;
        this.salary = salary;
    }
}

class program474
{
    public static void main(String A[])
    {
        ArrayList<Employee> employees = new ArrayList<Employee>();

        employees.add(new Employee("Sujit",70000));
        employees.add(new Employee("Mangesh",45000));
        employees.add(new Employee("Amit",80000));
        employees.add(new Employee("Rohit",35000));

        for(Employee e : employees)
        {
            if(e.salary > 50000)
            {
                System.out.println(e.name + " : " + e.salary);
            }
        }
    }
}
