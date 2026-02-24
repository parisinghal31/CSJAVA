class Node{
    int data;
    Node next;

    Node(int data1, Node next1){      //constructor with next=next1
        this.data=data1;
        this.next=next1;
    }

    Node(int data1){                 //constructor with next=null
        this.data=data1;
        this.next=null;
    }
}
public class deleteTailOfLL {
    private static Node convertArrToLL(int[] arr){
        Node head=new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=mover.next;
        }
        return head;
    }

    private static void print(Node head){                //to print the linked list
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    private static Node deleteTail(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    public static void main(String[] args){
        int[] arr={2,5,6,8};
        Node head=convertArrToLL(arr);
        head=deleteTail(head);
        print(head);
    }
}
