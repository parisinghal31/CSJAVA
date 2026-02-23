import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class handy {
    public static void main(String[] args) {
        List l=new ArrayList<>();
        l.add(10);
        l.add("Pari");
        l.add(2.34);
        Iterator itr=l.iterator();
        while(itr.hasNext){
            System.out.println(itr.next);
        }
    } 
    





}
