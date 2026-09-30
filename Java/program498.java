class program498
{
    public static void main(String A[])
    {
        String str = "Marvellous Infosystems";

        str = str.toLowerCase();

        int iVowels = 0;
        int iConsonants = 0;

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(Character.isLetter(ch))
            {
                if(ch == 'a' || ch == 'e' ||
                   ch == 'i' || ch == 'o' ||
                   ch == 'u')
                {
                    iVowels++;
                }
                else
                {
                    iConsonants++;
                }
            }
        }

        System.out.println("Vowels : " + iVowels);
        System.out.println("Consonants : " + iConsonants);
    }
}
