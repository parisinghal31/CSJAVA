abstract class turn{
    abstract void turnon();
    abstract void turnoff();
    
}
class tv extends turn{
    void turnon(){
        System.out.println("tv is turned on");
    }
    void turnoff(){
        System.out.println("tv is turned off");
    }
}
public class Abstract{
    public static void main(String args[]){
        turn obj=new tv();
        obj.turnon();
        obj.turnoff();
    }
}

