import java.util.Scanner;
public class integernum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer:");
        if(sc.hasNextInt()){
            int i=sc.nextInt();
            System.out.println("you entered: "+i);
        }
        else{
            System.out.println("not an integer");
        }
        sc.close();
    }
}
