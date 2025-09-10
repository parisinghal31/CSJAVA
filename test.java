class a{
    a(){
        System.out.println("a class constructor");
    }
}
class b extends a{
    b(){
        System.out.println("b class constructor");
    }
}

public class test {
public static void main(String[] args){
    b obj=new b();
}
}
