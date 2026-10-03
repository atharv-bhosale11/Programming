interface Maximum
{
    int Max(int A,int B);
}

class program510
{
    public static void main(String A[])
    {
        Maximum obj =(x,y) -> (x > y) ? x : y;

        System.out.println("Maximum : "+ obj.Max(100,250));
    }
}
