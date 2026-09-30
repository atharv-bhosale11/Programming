class program497
{
    public static void main(String A[])
    {
        String strMobile = "9876543210";

        if(strMobile.matches("[0-9]{10}"))
        {
            System.out.println("Valid Mobile Number");
        }
        else
        {
            System.out.println("Invalid Mobile Number");
        }
    }
}
