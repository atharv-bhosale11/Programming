import java.util.*;

class Student
{
    String name;
    int marks;

    Student(String name,int marks)
    {
        this.name = name;
        this.marks = marks;
    }

    public String toString()
    {
        return name + " " + marks;
    }
}

class program424
{
    public static void main(String A[])
    {
        ArrayList<Student> aobj = new ArrayList<Student>();

        aobj.add(new Student("Amit",78));
        aobj.add(new Student("Rahul",90));
        aobj.add(new Student("Pooja",85));

        Collections.sort(aobj,new Comparator<Student>()
        {
            public int compare(Student s1, Student s2)
            {
                return s2.marks - s1.marks;
            }
        });

        for(Student s : aobj)
        {
            System.out.println(s);
        }
    }
}
