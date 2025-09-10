public class Handling {
    public static void main(String[] args)throws InterruptedException{
        taskone();
    }
    public static void taskone() throws InterruptedException {
        tasktwo();
    }
    public static void tasktwo() throws InterruptedException{
        Thread.sleep(1000);
    }

}
