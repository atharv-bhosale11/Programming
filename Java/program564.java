class Student
{
    int iRollNo;
    String strName;

    Student(int iRollNo, String strName)
    {
        this.iRollNo = iRollNo;
        this.strName = strName;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj)
        {
            return true;
        }

        if(obj == null || getClass() != obj.getClass())
        {
            return false;
        }

        Student sobj = (Student)obj;

        return iRollNo == sobj.iRollNo;
    }

    @Override
    public int hashCode()
    {
        return Integer.hashCode(iRollNo);
    }
}

class program
{
    public static void main(String A[])
    {
        Student sobj1 = new Student(101, "Rohit");
        Student sobj2 = new Student(101, "Vansh");
        Student sobj3 = new Student(102, "Amit");

        System.out.println("HashCode 1 : " + sobj1.hashCode());
        System.out.println("HashCode 2 : " + sobj2.hashCode());
        System.out.println("HashCode 3 : " + sobj3.hashCode());

        System.out.println("Student 1 equals Student 2 : "
                           + sobj1.equals(sobj2));
    }
}
