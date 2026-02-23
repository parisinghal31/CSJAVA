class MyThread extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
public class ThreadDemo1 {
    public static void main(String[] args)throws InterruptedException{
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        t1.setName("thread1");
        t2.setName("thread2");
        t1.start();
        t2.start();
        System.out.println("thread ends here");
    }
}
