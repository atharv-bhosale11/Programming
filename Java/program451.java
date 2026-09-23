import java.util.*;

class program451
{
    public static void main(String A[])
    {
        String str = "{()}";

        Stack<Character> sobj = new Stack<Character>();

        boolean bFlag = true;

        for(char ch : str.toCharArray())
        {
            if(ch == '(' || ch == '{' || ch == '[')
            {
                sobj.push(ch);
            }
            else
            {
                if(sobj.isEmpty())
                {
                    bFlag = false;
                    break;
                }
                sobj.pop();
            }
        }

        System.out.println(bFlag && sobj.isEmpty());
    }
}
