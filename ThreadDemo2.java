class MyThread2 implements Runnable{
    private String name;
    MyThread2(String name){
        this.name=name;
    }
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(name+"is running iteration:"+i);
            try{
                Thread.sleep(2000); 
            }
            catch(InterruptedException e){
                System.out.println(name+"was interrupted");
            }
        }
        System.out.println(name+"has finished execution");
    }
}

public class ThreadDemo2 {
    public static void main(String[] args){
        MyThread2 obj1=new MyThread2("thread1");
        MyThread2 obj2=new MyThread2("thread2");
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();
        System.out.println("main thread is finished");
    }
}
