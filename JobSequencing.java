import java.util.*;
public class JobSequencing {
    static class Job{
        int id;
        int deadline;
        int profit;

        Job(int id,int deadline, int profit){
            this.id=id;
            this.deadline=deadline;
            this.profit=profit;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Job[] job=new Job[n];
        for(int i=0;i<n;i++){
            int id=sc.nextInt();
            int deadline=sc.nextInt();
            int profit=sc.nextInt();
            job[i]=new Job(id,deadline,profit);
        }
        Arrays.sort(job,(a,b)->b.profit-a.profit);
        int max=Integer.MIN_VALUE;
        for(Job jobs:job){
            max=Math.max(max,jobs.deadline);
        }
        int[] slots=new int[max+1];
        Arrays.fill(slots,-1);
        int count=0;
        int total=0;
        for(Job jobs:job){
            for(int j=jobs.deadline;j>0;j--){
                if(slots[j]==-1){
                    slots[j]=jobs.id;
                    count++;
                    total+=jobs.profit;
                    break;
                }
            }
        }
        sc.close();
        System.out.println(count+" "+total);
    }
}
