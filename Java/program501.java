class program501
{
    public static void main(String A[])
    {
        String str = "ABC123";

        boolean upper = false;
        boolean lower = false;
        boolean digit = false;

        for(char ch : str.toCharArray())
        {
            if(Character.isUpperCase(ch))
            {
                upper = true;
            }
            else if(Character.isLowerCase(ch))
            {
                lower = true;
            }
            else if(Character.isDigit(ch))
            {
                digit = true;
            }
        }

        if(str.length() >= 8 &&
           upper && lower && digit)
        {
            System.out.println("Strong Password");
        }
        else
        {
            System.out.println("Weak Password");
        }
    }
}
