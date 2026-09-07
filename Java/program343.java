import java.util.*;

class Student
{
    public String name;
    public int marks;

    public Student(String a, int b)
    {
        this.name = a;
        this.marks = b;
    }

    @Override
    public String toString()
    {
        return this.name + " " + this.marks;
    }
}

class program343
{
    public static void main(String A[])
    {
        Student S1 = new Student("Amit", 78);
        Student S2 = new Student("Pooja", 92);
        Student S3 = new Student("Rahul", 85);
        Student S4 = new Student("Neha", 92);
        Student S5 = new Student("Kiran", 67);

        ArrayList<Student> aobj = new ArrayList<Student>();

        aobj.add(S1);
        aobj.add(S2);
        aobj.add(S3);
        aobj.add(S4);
        aobj.add(S5);

        Collections.sort(aobj, new Comparator<Student>()
        {
            public int compare(Student S1, Student S2)
            {
                if(S1.marks != S2.marks)
                {
                    return S2.marks - S1.marks;   // Descending by marks
                }
                return S1.name.compareTo(S2.name); // Ascending by name
            }
        });

        for(Student s : aobj)
        {
            System.out.println(s);
        }
    }
}
