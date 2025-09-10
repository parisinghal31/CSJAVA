
class Emp{
private int empNo;
private String empName;
private int empBasic;

public Emp(int empNo,String empName,int empBasic){
    this.empNo=empNo;
    this.empName=empName;
    this.empBasic=empBasic;
}
public int getempNo(){
    return empNo;
}
public String getempName(){
    return empName;
}
public int getempBasic(){
    return empBasic;
}
}

public class Question_12 {
    public static void main(String[] args){
    Emp obj=new Emp(123,"pari",987655);
    System.out.println(obj.getempNo());
    System.out.println(obj.getempName());
    System.out.println(obj.getempBasic());
    

    }
}
