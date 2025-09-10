interface Inter1{
    //marker interface->jiske andar koi field nhi h
    //agr only 1 method is there in interface->functional interface
    int x=112;
    void method1();
}
interface Inter2{
    int x=115;
     void method3();
}
    public class fin1 implements Inter1,Inter2{
        public static void main(String[] args) {
              System.out.println("Main entry point");
              System.out.println(Inter1.x);
              int x=113;
              System.out.println(x);
        }
        public void method1(){
            System.out.println("This is my method");
        }
         public void method3(){
            System.out.println("This is my method3");
        }
    }


