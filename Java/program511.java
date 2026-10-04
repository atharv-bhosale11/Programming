interface StringLength
{
    int getLength(String str);
}

class program511
{
    public static void main(String A[])
    {
        StringLength obj = str -> str.length();

        System.out.println(obj.getLength("Jay Ganesh..."));
    }
}
