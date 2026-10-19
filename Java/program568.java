class Person
{
    Person()
    {
        System.out.println("Person Constructor"); 
    }
}

class Student extends Person
{
    Student()
    {
        System.out.println("Student Constructor");
    }
}

class program568
{
    public static void main(String A[])
    {
        Student sobj = new Student();
    }
}
