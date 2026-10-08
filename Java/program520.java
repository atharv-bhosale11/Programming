class MyRunnable implements Runnable
{
    public void run()
    {
        for(int i = 1; i <= 5; i++)
        {
            System.out.println("Child Thread : " + i);
        }
    }
} 
 
class program520
{
    public static void main(String A[])
    {
        MyRunnable mobj = new MyRunnable();

        Thread tobj = new Thread(mobj);

        tobj.start();

        for(int i = 1; i <= 5; i++)
        {
            System.out.println("Main Thread : " + i);
        }
    }
}
