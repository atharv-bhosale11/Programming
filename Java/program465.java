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
        return id + " " + name + " " + salary;
    }
}

class program465
{
    public static void main(String A[])
    {
        ArrayList<Employee> employees =
            new ArrayList<Employee>();

        employees.add(new Employee(101,"Rahul",50000));
        employees.add(new Employee(102,"Atharv",70000));
        employees.add(new Employee(103,"Amit",50000));
        employees.add(new Employee(104,"Rohit",60000));

        Collections.sort(employees,
            Comparator.comparingDouble((Employee e) -> e.salary)
                      .thenComparing(e -> e.name));

        for(Employee e : employees)
        {
            System.out.println(e);
        }
    }
}
