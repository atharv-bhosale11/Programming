interface Shape
{
    void calculateArea();
}

class Circle implements Shape
{
    public void calculateArea()
    {
        double dRadius = 5;
        double dArea = Math.PI * dRadius * dRadius;

        System.out.println("Area : " + dArea);
    }
}

class program490
{
    public static void main(String A[])
    {
        Circle cobj = new Circle();

        cobj.calculateArea();
    }
}
