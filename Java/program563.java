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
}

class program564
{
    public static void main(String A[])
    {
        Student sobj1 = new Student(101, "Yash");
        Student sobj2 = new Student(101, "Nilam");
        Student sobj3 = new Student(102, "Nilam");

        System.out.println(sobj1.equals(sobj2));
        System.out.println(sobj1.equals(sobj3));
    }
}
