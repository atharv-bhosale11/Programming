class Vehicle
{
    String strBrand = "Toyota";
}

class Car extends Vehicle
{
    String strModel = "Fortuner";

    void Display()
    {
        System.out.println("Brand : " + strBrand);
        System.out.println("Model : " + strModel);
    }
}

class program31
{
    public static void main(String A[])
    {
        Car cobj = new Car();

        cobj.Display();
    }
}
