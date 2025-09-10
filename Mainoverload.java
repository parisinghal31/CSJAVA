public class Mainoverload {
    public static void main(String[] args){
        System.out.println("Main with string args");
        main(10);
        main("Hello");
    }
    public static void main(int x){
        System.out.println("main with int:"+x);
    }
    public static void main(String s){
        System.out.println("main with string:"+s);
    }
}
