package JdkProxyDemo;

public class CheckThead extends Thread{
    public  void run()
    {
        for(int i =0; i <10; i ++)
        {
            printMsg();
        }
    }

    private void printMsg()
    {
        Thread t = Thread.currentThread();
        String name =t.getName();
        System.out.println("name "+name);
    }

    public static void main(String[] args)
    {
        CheckThead ct =new CheckThead();
        ct.setName("Thread");
        System.out.println("before start, ct.isAlive()=" +ct.isAlive());
        for (int i = 0 ; i<10 ; i ++)
        {
            ct.printMsg();
        }
        System.out.println("the and of main (),ct.isAlive="+ct.isAlive());
    }
}
