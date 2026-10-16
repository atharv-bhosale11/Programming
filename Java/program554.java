class Vehicle
{
    void Start()
    {
        System.out.println("Vehicle is Starting");
    }
}

class Car extends Vehicle
{
    @Override
    void Start()
    {
        System.out.println("Car Starts Using Key");
    }
}

class Bike extends Vehicle
{
    @Override
    void Start()
    {
        System.out.println("Bike Starts Using Self Start");
    }
}

class program554
{
    public static void main(String A[])
    {
        Vehicle vobj;

        vobj = new Car();
        vobj.Start();

        vobj = new Bike();
        vobj.Start();
    }
}
