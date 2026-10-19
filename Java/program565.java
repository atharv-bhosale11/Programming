class Student implements Cloneable
{
    int iRollNo;
    String strName;

    Student(int iRollNo, String strName)
    {
        this.iRollNo = iRollNo;
        this.strName = strName;
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    void Display()
    {
        System.out.println("Roll No : " + iRollNo);
        System.out.println("Name    : " + strName);
    }
}

class program565
{
    public static void main(String A[]) throws CloneNotSupportedException
    {
        Student sobj1 = new Student(101, "Atharv");

        Student sobj2 = (Student)sobj1.clone();

        System.out.println("Original Student:");
        sobj1.Display();

        System.out.println("\nCloned Student:");
        sobj2.Display();
    }
}
