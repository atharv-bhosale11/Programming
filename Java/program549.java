abstract class Shape
{
    abstract void CalculateArea();
}

class Rectangle extends Shape
{
    int iLength = 10;
    int iWidth = 5;

    void CalculateArea()
    {
        System.out.println(
            "Rectangle Area : " + (iLength * iWidth));
    }
}

class program549
{
    public static void main(String A[])
    {
        Shape sobj = new Rectangle();

        sobj.CalculateArea();
    }
}
