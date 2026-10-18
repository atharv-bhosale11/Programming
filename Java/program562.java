 class Student
{
    int iRollNo;
    String strName;
    int iMarks;

    Student(int iRollNo, String strName, int iMarks)
    {
        this.iRollNo = iRollNo;
        this.strName = strName;
        this.iMarks = iMarks;
    }

    @Override
    public String toString()
    {
        return "Roll No : " + iRollNo +
               "\nName    : " + strName +
               "\nMarks   : " + iMarks;
    }
}

class program562
{
    public static void main(String A[])
    {
        Student sobj = new Student(101, "Atharv", 85);

        System.out.println(sobj);
    }
}
