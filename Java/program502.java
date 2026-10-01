class program502
{
    public static void main(String A[])
    {
        String str = "aaabbccccdd";

        String compressed = "";
 
        int count = 1;

        for(int i = 0; i < str.length()-1; i++)
        {
            if(str.charAt(i) == str.charAt(i+1))
            {
                count++;
            }
            else
            {
                compressed += str.charAt(i);
                compressed += count;
                count = 1;
            }
        }

        compressed += str.charAt(str.length()-1);
        compressed += count;

        System.out.println(compressed);
    }
}
