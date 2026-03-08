import java.util.*;

public class ActivitySelection {
    static class Activity{
        int start;
        int end;

        Activity(int start, int end){
            this.start=start;
            this.end=end;
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] start=new int[n];
        int[] end=new int[n];
        for(int i=0;i<n;i++){
            start[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            end[i]=sc.nextInt();
        }
        Activity[] act=new Activity[n];
        for(int i=0;i<act.length;i++){
            act[i]=new Activity(start[i],end[i]);
        }
        Arrays.sort(act,(a,b)-> a.end-b.end);
        int count=0;
        int lastEnd=-1;
        for(int i=0;i<n;i++){
            if(act[i].start>lastEnd){
                count++;
                lastEnd=act[i].end;
            }
        }
        sc.close();
        System.out.println(count);
    }
}
