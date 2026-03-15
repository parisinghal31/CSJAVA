class Node{
    int data;
    Node next;
    Node back;

    Node(int data1, Node next1, Node back1){
        this.data=data1;
        this.next=next1;
        this.back=back1;
    }

    Node(int data1){
        this.data=data1;
        this.next=null;
        this.back=null;  
    }
}

public class DoublyLinkedList {
private static Node convertArrtoDLL(int[] arr){
    Node head=new Node(arr[0]);
    Node prev=head;
    for(int i=1;i<arr.length;i++){
        Node temp=new Node(arr[i],null,prev);
        prev.next=temp;
        prev=temp;
    }
    return head;
}

private static void print(Node head){
    while(head!=null){
        System.out.print(head.data+" ");
        head=head.next;
    }
}
private static Node deleteHead(Node head){
    if(head==null || head.next==null){
        return null;
    }
    Node prev=head;
    head=head.next;
    prev.next=null;
    head.back=null;
    return head;

}
private static Node deleteTail(Node head){
    if(head==null || head.next==null){
        return null;
    }
    Node temp=head;
    while(temp.next!=null){
        temp=temp.next;
    }
    Node newTail=temp.back;
    newTail.next=null;
    temp.back=null;
    return head;
}
private static Node removeKthElement(Node head,int k){
    Node temp=head;
    int count=0;
    while(temp!=null){
        count++;
        if(count==k){
            break;
        }
        temp=temp.next;
    }
    Node prev=temp.back;
    Node front=temp.next;
    if(prev==null && front==null){
        return null;
    }
    else if(prev==null){
        return deleteHead(head);
    }
    else if(front==null){
        return deleteTail(head);
    }
    else{
        prev.next=front;
        front.back=prev;
        temp.back=null;
        temp.next=front;
        return head;
    }
}
private static void deleteNode(Node temp){
    Node prev=temp.back;
    Node front=temp.next;
    if(front==null){
        prev.next=null;
        temp.back=null;
        return;
    }
    prev.next=front;
    front.back=prev;
    temp.back=null;
    temp.next=null;
}
private static Node insertbeforeHead(Node head,int val){
    Node newHead=new Node(val,head,null);
    head.back=newHead;
    return newHead;
}
private static Node insertBeforeTail(Node head,int val){
    if(head.next==null){
        return insertbeforeHead(head,val);
    }
    Node temp=head;
    while(temp.next!=null){
        temp=temp.next;
    }
    Node prev=temp.back;
    Node newTail=new Node(val,temp,prev);
    prev.next=newTail;
    temp.back=newTail;
    return head;
}
private static Node insertBeforeKthElement(Node head,int k,int val){
    if(k==1){
        return insertbeforeHead(head,val);
    }
    Node temp=head;
    int count=0;
    while(temp!=null){
        count++;
        if(count==k){
            break;
        }
        temp=temp.next;
    }
    Node prev=temp.back;
    Node newNode=new Node(val,temp,prev);
    prev.next=newNode;
    temp.back=newNode;
    return head;
}
private static void insertBeforeNode(Node node,int val){
    Node prev=node.back;
    Node newNode=new Node(val,node,prev);
    prev.next=newNode;
    node.back=newNode;
}
public static void main(String[] args){
    int[] arr={12,5,8,7};
    Node head=convertArrtoDLL(arr);
    //head=deleteHead(head);
    //head=deleteTail(head);
    //head=removeKthElement(head, 2);
    //deleteNode(head.next.next);   //deletes 8

    //head=insertbeforeHead(head,10);
    //head=insertBeforeTail(head,10);
    //head=insertBeforeKthElement(head,4,10);
    insertBeforeNode(head.next,100);
    print(head);
}
}
