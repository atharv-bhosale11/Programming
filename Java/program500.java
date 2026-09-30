import java.util.Arrays;

class program500
{
    public static void main(String A[])
    {
        String str1 = "listen";
        String str2 = "silent";

        char Arr1[] = str1.toCharArray();
        char Arr2[] = str2.toCharArray();

        Arrays.sort(Arr1);
        Arrays.sort(Arr2);

        if(Arrays.equals(Arr1, Arr2))
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("Not Anagram");
        }
    }
}
