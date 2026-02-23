import java.util.Stack;
class StackDemo2{
    static void stack_push(Stack<Integer> stack){
        for(int i=0;i<5;i++){
            stack.push(i);
            System.out.println(i);
        }
    }

    static void stack_pop(Stack<Integer>stack){
        System.out.println("Pop operation:");
        for(int i=0;i<5;i++){
            int y=stack.pop();
            System.out.println(y);
        }
    }

    static void stack_peek(Stack<Integer>stack){
        System.out.println("Peek operation: ");
        System.out.println(stack.peek());
        
    }

    static void stack_search(Stack<Integer>stack,int ele){
        
        for(int i=0;i<5;i++){
            
        }
    }
}

public class vector {
    public static void main(String[]args){
        StackDemo2 obj=new StackDemo2();
        obj.stack_push();
    }
}
