class Node{
    int data;
    Node next;

    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}
public class insertionInLL {
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
    private static Node insertHead(Node head,int val){     //inserting new node at head
        Node temp=new Node(val,head);
        return temp;
    }
    private static Node insertAtTail(Node head,int val){   //inserting new node at tail
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new Node(val,null);
        return head;
    }
    private static Node insertAtposK(Node head,int val,int k){ //inserting new node at Kth position
        if(head==null){
            if(k==1){
                return new Node(val,null);
            }
            else{
                return null;
            }
        }
        if(k==1){
            return new Node(val,head);
        }
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            if(count==(k-1)){
                Node x=new Node(val,temp.next);
                temp.next=x;
                break;
            }
            temp=temp.next;
        }
        return head;
    }

    private static Node insertBeforeValK(Node head,int val,int k){
        if(head==null){
            return null;
        }
        if(head.data==k){
            return new Node(val,head);
        }
        Node temp=head;
        while(temp!=null){
            if(temp.next.data==k){
                Node x=new Node(val,temp.next);
                temp.next=x;
                break;
            }
            temp=temp.next;
        }
        return head;
    }
    public static void main(String[] args){
        int[] arr={2,5,6,8};
        Node head=convertArrToLL(arr);
        // head=insertHead(head, 12);                    //inserting new node at head
        // head=insertAtTail(head,12);                  //inserting new node at tail
        // head=insertAtposK(head,12,4);               //inserting new node at Kth position
        head=insertBeforeValK(head, 12, 6);
        print(head);
    }
}
