class node
{
    public int data;
    public node next;

    public node(int no)
    {
        this.data = no;
        this.next = null;
    }
}

class SinglyLL
{
    private node first;
    private int iCount;

    public SinglyLL()
    {
        this.first = null;
        this.iCount = 0;
    }

    public void InsertFirst(int iNo)
    {
        node newn = new node(iNo);

        newn.next = first;
        first = newn;
        
        iCount++;
    }

    public int Count()
    {
        return iCount;
    }

    public void Display()
    {
        node temp = null;
        temp = first;

        while(temp != null)
        {
            System.out.print("| " +temp.data+" | ->  ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public void InsertLast(int iNo)
    {
        node newn = new node(iNo);

        if(first == null)
        {
            first = newn;
        }
        else
        {
            node temp = first;

            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newn;
        }
        iCount++;
    }

    // Time Complexity : N + N / 2
    
    public int MiddleElement()
    {
        int iCount = Count();

        int iMiddle = iCount / 2;
        node temp = first;
        for(int i = 1; i <= iMiddle; i++)
        {
            temp = temp.next;
        }
        return temp.data;
    }

    public int MiddleElementX()
    {
        node fast = first;
        node slow = first;

        while(fast != null)         // Issue
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
    }
}   

class program305
{
    public static void main(String A[])
    {
        int iRet;
        SinglyLL sobj = new SinglyLL();

        sobj.InsertFirst(51);
        sobj.InsertFirst(21);
        sobj.InsertFirst(11);
        sobj.InsertLast(101);
        sobj.InsertLast(111);

        sobj.Display();

        iRet = sobj.MiddleElementX();
        System.out.println("Middle Element is   :"+iRet);
    }
}
