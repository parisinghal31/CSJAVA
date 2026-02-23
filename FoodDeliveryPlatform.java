class Order extends Thread{
    private String customerName;
    private String foodItem;
    public Order(String customerName, String foodItem){
        this.customerName=customerName;
        this.foodItem=foodItem;
    }
    public void run(){
        System.out.println(customerName+" placed an order for "+foodItem);
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Order ready for "+customerName+" ("+foodItem+")");
    } 
}

public class FoodDeliveryPlatform {
    public static void main(String[] args){
        System.out.println("===Online Food Delivery Platform===");
        Order o1=new Order("Jeremiah","Pizza");
        Order o2=new Order("Elena","Burger");
        Order o3=new Order("Conrad","Dal Chawal");
        Order o4=new Order("Belly","Dosa");
        o1.start();
        o2.start();
        o3.start();
        o4.start();
        System.out.println("Main sysyem is free to take new orders...");
    }
}
