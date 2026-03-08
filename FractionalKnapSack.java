import java.util.*;
public class FractionalKnapSack {
    static class Item{
        int value;
        int weight;
        double ratio;
    
        Item(int value, int weight){
            this.value=value;
            this.weight=weight;
            this.ratio=(double)value/weight;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int capacity=sc.nextInt();
        Item[] arr=new Item[n];
        for(int i=0;i<arr.length;i++){
            int value=sc.nextInt();
            int weight=sc.nextInt();
            arr[i]=new Item(value,weight);
        }
        Arrays.sort(arr,(a,b)->Double.compare(b.ratio,a.ratio));
        double total=0.0;
        for(int i=0;i<arr.length;i++){
            if(capacity>=arr[i].weight){
                total+=arr[i].value;
                capacity-=arr[i].weight;
            }
            else{
                total+=arr[i].ratio*capacity;
                break;
            }
        }
        System.out.printf("%.6f\n",total);
    }
}
