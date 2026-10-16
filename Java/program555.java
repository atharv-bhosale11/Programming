class Shape
{
    void CalculateArea()
    {
        System.out.println("Calculating Shape Area");
    }
}

class Circle extends Shape
{
    void CalculateArea()
    {
        int iRadius = 5;

        System.out.println(
            "Circle Area : " +
            (Math.PI * iRadius * iRadius));
    }
}

class Rectangle extends Shape
{
    void CalculateArea()
    {
        int iLength = 10;
        int iWidth = 5;

        System.out.println(
            "Rectangle Area : " +
            (iLength * iWidth));
    }
}

class Triangle extends Shape
{
    void CalculateArea()
    {
        int iBase = 10;
        int iHeight = 6;

        System.out.println(
            "Triangle Area : " +
            (0.5 * iBase * iHeight));
    }
}

class program555
{
    public static void main(String A[])
    {
        Shape Arr[] = new Shape[3];

        Arr[0] = new Circle();
        Arr[1] = new Rectangle();
        Arr[2] = new Triangle();

        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i].CalculateArea();
        }
    }
}
