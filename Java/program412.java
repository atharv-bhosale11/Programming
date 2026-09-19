import java.util.*;

class Student
{
    String name;

    Student(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return name;
    }
}

class program412
{
    public static void main(String A[])
    {
        ArrayList<Student> aobj = new ArrayList<Student>();

        aobj.add(new Student("Amit"));
        aobj.add(new Student("Rahul"));
        aobj.add(new Student("Pooja"));
        aobj.add(new Student("Neha"));

        Collections.sort(aobj, new Comparator<Student>()
        {
            public int compare(Student S1, Student S2)
            {
                if(S1.name.length() != S2.name.length())
                {
                    return S1.name.length() - S2.name.length();
                }
                return S1.name.compareTo(S2.name);
            }
        });

        for(Student s : aobj)
        {
            System.out.println(s);
        }
    }
}
