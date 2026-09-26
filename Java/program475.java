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

class program475
{
    public static void main(String A[])
    {
        ArrayList<Student> students =
            new ArrayList<Student>();

        students.add(new Student("Sujit",85));
        students.add(new Student("Amit",78));
        students.add(new Student("Rajendra",92));
        students.add(new Student("Rohit",88));

        Collections.sort(students,(s1,s2) -> s2.marks - s1.marks);

        for(Student s : students)
        {
            System.out.println(s);
        }
    }
}
