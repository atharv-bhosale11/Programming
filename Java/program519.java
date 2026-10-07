class MyThread extends Thread
{
    public void run()
    {
        for(int i = 1; i <= 5; i++)
        {
            System.out.println("Child Thread : " + i);
        }
    }
}

class program519
{ 
    public static void main(String A[])
    {
        MyThread mobj = new MyThread();

        mobj.start(); 

        for(int i = 1; i <= 5; i++)
        {
            System.out.println("Main Thread : " + i);
        }
    }
}
