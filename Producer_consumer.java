class Buffer{
    private int data;
    private boolean available=false;

    public synchronized void produce(int value){
        while(available){
            try{
                wait();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        data=value;
        available=true;
        System.out.println("Produced: "+value);
        notify();
    }
    public synchronized void consume(){
        while(!available){
            try{
                wait();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Consumed: "+data);
        available=false;
        notify();
    }
}
class Producer extends Thread{
    private Buffer buffer;
    Producer(Buffer b){
        this.buffer=b;
    }
    public void run(){
        for(int i=1;i<=5;i++){
            buffer.produce(i);
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class Consumer extends Thread{
    private Buffer buffer;
    Consumer(Buffer b){
        this.buffer=b;
    }
    public void run(){
        for(int i=1;i<=5;i++){
            buffer.consume();
            try{
                Thread.sleep(800);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class Producer_consumer {
    public static void main(String[] args){
        Buffer buffer=new Buffer();
        Producer producer=new Producer(buffer);
        Consumer consumer=new Consumer(buffer);
        producer.start();
        consumer.start();
    }
}
