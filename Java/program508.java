class program508
{
    public static void main(String A[])
    {
        Runnable task =
            () ->
            {
                for(int i = 1; i <= 5; i++)
                {
                    System.out.println(
                        "Thread Running : " + i);
                }
            };

        Thread t = new Thread(task);

        t.start();
    }
}
