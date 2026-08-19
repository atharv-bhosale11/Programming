/*
Input   : India is my country I live in India 
Output  : Bharat is my Country I live in Bharat
*/

import java.util.*;

class program181
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String: ");
        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        String Tokens[] = str.split(" ");
        StringBuffer FinalStr = new StringBuffer();
        
        for(int i = 0; i < Tokens.length; i++)
        {
            if(Tokens[i].equals("India"))
            {
                FinalStr = FinalStr.append("Bharat"+" "); 
                continue;
            }
            FinalStr = FinalStr.append(Tokens[i]+" "); 
        }
        
        String Output = new String(FinalStr);
        Output = Output.trim();
        System.out.println("String Output : "+Output); 
    }
}
