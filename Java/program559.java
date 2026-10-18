class Person
{
    private String strName;
    private int iAge;

    Person(String strName, int iAge)
    {
        this.strName = strName;
        this.iAge = iAge;
    }

    public String getName()
    {
        return strName;
    }

    public int getAge()
    {
        return iAge;
    }
}

class Student extends Person
{
    int iRollNo;

    Student(String strName, int iAge, int iRollNo)
    {
        super(strName, iAge);
        this.iRollNo = iRollNo;
    }

    void Display()
    {
        System.out.println("Name    : " + getName());
        System.out.println("Age     : " + getAge());
        System.out.println("Roll No : " + iRollNo);
    }
}

class program559
{
    public static void main(String A[])
    {
        Student sobj = new Student("Atharv", 25, 101);

        sobj.Display();
    }
}
