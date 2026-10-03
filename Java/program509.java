interface Arithmetic
{
    int operation(int A,int B);
}

class program509
{ 
    public static void main(String A[])
    {
        Arithmetic Add = (x,y) -> x + y;

        Arithmetic Sub = (x,y) -> x - y;

        Arithmetic Mul = (x,y) -> x * y;

        System.out.println("Addition : "+ Add.operation(10,20));

        System.out.println("Subtraction : "+ Sub.operation(20,10));

        System.out.println("Multiplication : "+ Mul.operation(10,20));
    }
}
