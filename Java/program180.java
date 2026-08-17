/*
Input   : India is my country I live in India 
Output  : Bharat is my Country I live in Bharat
*/

import java.util.*;

class program180
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String: ");
        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        String Tokens[] = str.split(" ");
        
        int iCount = 0;

        for(int i = 0; i < Tokens.length; i++)
        {
            if(Tokens[i].equals("India"))
            {
                iCount++;
            }
        }
        System.out.println("Frequency of Word is: "+iCount); 
    }
}
