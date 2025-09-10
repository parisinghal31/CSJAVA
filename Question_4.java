import java.util.*;
public class Question_4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("Characters in String : "+str.length());
        
        String rev_str=new StringBuilder(str).reverse().toString();

        System.out.println("Reversed String : "+rev_str);

        if(str.equals(rev_str)){
            System.out.println("The String is a Palindrome :)");

        }
        else{
            System.out.println("The String is not a Palindrome :(");
        }
        sc.close();
    }

}
