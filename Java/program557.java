class Vehicle
{
    void Display()
    {
        System.out.println("This is a Vehicle");
    }
}

class Car extends Vehicle
{
    void Drive()
    {
        System.out.println("Driving a Car");
    }
}

class Bike extends Vehicle
{
    void Ride()
    {
        System.out.println("Riding a Bike");
    }
}

class program557
{
    public static void main(String A[])
    {
        Vehicle vobj = new Car();

        if(vobj instanceof Car)
        {
            System.out.println("Object belongs to Car");
        }

        if(vobj instanceof Vehicle)
        {
            System.out.println("Object belongs to Vehicle");
        }

        if(vobj instanceof Bike)
        {
            System.out.println("Object belongs to Bike");
        }
    }
}
