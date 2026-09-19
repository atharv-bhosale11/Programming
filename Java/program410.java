import java.util.*;

class Employee
{
    String name;
    int salary;

    Employee(String name, int salary)
    {
        this.name = name;
        this.salary = salary;
    }

    public String toString()
    {
        return name + " " + salary;
    }
}

class program410
{
    public static void main(String A[])
    {
        ArrayList<Employee> aobj = new ArrayList<Employee>();

        aobj.add(new Employee("Amit", 50000));
        aobj.add(new Employee("Pooja", 75000));
        aobj.add(new Employee("Rahul", 60000));
        aobj.add(new Employee("Neha", 75000));

        Collections.sort(aobj, new Comparator<Employee>()
        {
            public int compare(Employee E1, Employee E2)
            {
                if(E1.salary != E2.salary)
                {
                    return E2.salary - E1.salary;
                }
                return E1.name.compareTo(E2.name);
            }
        });

        for(Employee e : aobj)
        {
            System.out.println(e);
        }
    }
}
