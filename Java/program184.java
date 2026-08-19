import java.util.*;

class program184
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in); 

        System.out.println("Enter String: ");
        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        str = str.toLowerCase();

        char Arr[] = str.toCharArray();

        int Frequency[] = new int[26];

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                Frequency[(int)Arr[i] - 97]++;
            }
        }
        System.out.println("Frequency of Each letter is: ");

        for(int i = 0 ; i < Frequency.length; i++)
        {
            if(Frequency[i] > 0)
            {
                System.out.println((char)(i + 97)+ " : "+Frequency[i]);
            }
        }   
    }
}
