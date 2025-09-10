import java.util.*;
public class Question_2{
    public static void main(String[] args){
        int count=0;
        int sum=0;
        for(int i=1;i<=100;i++){
            if(i%2!=0){
                count++;
                sum+=i;
            }
        }
        System.out.println(count);
        System.out.println(sum);
    }
}