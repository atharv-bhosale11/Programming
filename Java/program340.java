
import java.util.ArrayList;


class Student
{
    public String name;
    public int marks;

    public Student(String a, int b)
    {
        this.name  = a;
        this.marks = b;
    }

    @Override
    public String toString()
    {
        return this.name+ " "+this.marks;
    }
}

class program340
{
    public static void main(String A[])
    {
        Student S1 = new Student("Amit",  78);
        Student S2 = new Student("Pooja", 92);
        Student S3 = new Student("Rahul", 85);
        Student S4 = new Student("Neha",  92);
        Student S5 = new Student("Kiran", 67);

        ArrayList <Student> aobj = new ArrayList<Student>();

        aobj.add(S1);
        aobj.add(S2);
        aobj.add(S3);
        aobj.add(S4);
        aobj.add(S5);

        System.out.println(aobj);
    }
}
