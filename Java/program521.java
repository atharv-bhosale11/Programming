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

class program521
{
    public static void main(String A[])
    {
        try
        {
            MyThread mobj = new MyThread();

            mobj.start();

            mobj.join();

            System.out.println("Child Thread Completed");

            for(int i = 1; i <= 5; i++)
            { 
                System.out.println("Main Thread : " + i);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
