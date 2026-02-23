@FunctionalInterface
interface A{
    void show(int x);
}

public class FuncInterface {
    public static void main(String[] args){
        A a1=(int x)-> System.out.println("hello "+x);
        a1.show(10);

    }

}
