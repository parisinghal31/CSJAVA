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

public class linkedlist {
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
    private static int checkIfPresent(Node head,int val){
        Node temp=head;
        while(temp!=null){
            if(temp.data==val){
                return 1;
            }
            temp=temp.next;
        }
        return 0;
    }
    public static void main(String[] args){
        int[] arr={2,5,6,8};

        //------------------------------------------------------------------------------------
        // Node y=new Node(arr[0]);            //creating new node
        // System.out.println(y.data);         //printing its value
        //------------------------------------------------------------------------------------

        // Node head=convertArrToLL(arr);
        // System.out.println(head.data);

        //------------------------------------------------------------------------------------

        // Node temp=head;
        // while(temp!=null){
        //     System.out.print(temp.data+" ");   //traversing
        //     temp=temp.next;
        // }

        //------------------------------------------------------------------------------------
        // int count=0;                        //length of LL
        // Node temp=head;
        // while(temp!=null){
        //     count++;   //traversing
        //     temp=temp.next;
        // }
        // System.out.println(count);

        //------------------------------------------------------------------------------------
        Node head=convertArrToLL(arr);
        System.out.print(checkIfPresent(head, 2));    //searching
    }
}
