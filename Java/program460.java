import java.util.*;

class Employee
{
    int id;
    String name;
    double salary;

    Employee(int id,String name,double salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString()
    {
        return id+" "+name+" "+salary;
    }
}

class program460
{
    public static void main(String A[])
    {
        ArrayList<Employee> al = new ArrayList<>();

        al.add(new Employee(1,"Soham",50000));
        al.add(new Employee(2,"Sujit",80000));
        al.add(new Employee(3,"Amit",65000));

        Employee max = al.get(0);

        for(Employee e : al)
        {
            if(e.salary > max.salary)
            {
                max = e;
            }
        }

        System.out.println("Highest Salary Employee");
        System.out.println(max);
    }
}
