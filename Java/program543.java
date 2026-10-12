class Shape
{
    void Display()
    {
        System.out.println("This is a Shape"); 
    }
}

class Circle extends Shape
{
    void CalculateArea()
    {
        double dRadius = 5;

        System.out.println(
            "Circle Area : " +
            (Math.PI * dRadius * dRadius));
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

class program543
{
    public static void main(String A[])
    {
        Circle cobj = new Circle();
        Rectangle robj = new Rectangle();

        cobj.Display();
        cobj.CalculateArea();

        robj.Display();
        robj.CalculateArea();
    }
}
