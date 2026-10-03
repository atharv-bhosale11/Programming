import java.util.*;

class Employee
{
    int id;
    String name;
    int salary;

    Employee(int id, String name, int salary)
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

class program506
{
    public static void main(String A[])
    {
        ArrayList<Employee> list =
 new ArrayList<Employee>();

        list.add(new Employee(3,"Atharv",70000));
        list.add(new Employee(1,"Rahul",50000));
        list.add(new Employee(2,"Amit",60000));

        Collections.sort(list,
            (e1,e2) -> e1.salary - e2.salary);

        for(Employee e : list)
        {
            System.out.println(e);
        }
    }
}
