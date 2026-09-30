class program499
{
    public static void main(String A[])
    {
        String str = "Java Programming Language";

        String words[] = str.split(" "); 

        for(String word : words)
        {
            String rev = "";

            for(int i = word.length()-1; i >= 0; i--)
            {
                rev = rev + word.charAt(i);
            }

            System.out.print(rev + " ");
        }
    }
}
