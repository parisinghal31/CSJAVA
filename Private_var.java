
public class bankAccount {
    private double balance;
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }
        else{
            System.out.println();
        }
    }
    public void withdrawal(double amount){
        if(amount<0){
            System.out.println("Invalid withdrawal amount");
        }
    }
}
public class Private_var{
    public static void main(String[] args){

    }
}
