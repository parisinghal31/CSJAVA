import java.util.Scanner;
class Employee{
    private String name;
    private int id;
    private double salary;

    public void set(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public double getSalary(){
        return salary;
    }
}


public class Question_13 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Employee obj=new Employee();
        System.out.println("Enter employee name: ");
        String name=sc.nextLine();
        System.out.println("Enter employee id: ");
        int id=sc.nextInt();
        System.out.println("Enter employee salary: ");
        double salary=sc.nextDouble();

        obj.set(name,id,salary);

        System.out.println("Employee Details");
        System.out.println(obj.getName());
        System.out.println(obj.getId());
        System.out.println(obj.getSalary());
        
        sc.close();

    }
}
