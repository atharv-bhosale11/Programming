/*
Input   : my name is amit
Output  : ym eman si tima
*/

import java.util.*;

class StringX
{
    public String WordReverse(String str)
    {
        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        String Tokens[] = str.split(" ");
        
        StringBuffer sb = null;
        StringBuffer FinalStr = new StringBuffer();

        for(int i = 0; i < Tokens.length; i++)
        {
            sb = new StringBuffer(Tokens[i]);
            sb = sb.reverse();
            FinalStr = FinalStr.append(sb+" ");
        }
        String output = new String(FinalStr);

        output = output.trim();

        System.out.println(output);   

        return  output;
    }
}

class program178
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String: ");
        String str = sobj.nextLine();

        StringX strobj = new StringX();

        String sret = null;

        sret = strobj.WordReverse(str);
        
        System.out.println(sret);
    }
}
