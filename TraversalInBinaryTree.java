import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
}
class Pair{
    TreeNode node;
    int num;
    Pair(TreeNode node,int num){
        this.node=node;
        this.num=num;
    }
}

public class TraversalInBinaryTree {
   public void PreInPostTraversal(TreeNode root){
        Stack<Pair> st=new Stack<Pair>();
        st.push(new Pair(root,1));
        List<Integer> pre=new ArrayList<>();
        List<Integer> in=new ArrayList<>();
        List<Integer> post=new ArrayList<>();
        if(root==null){
            return;
        }
        while(!st.isEmpty()){
            Pair it=st.pop();
            if(it.num==1){
                pre.add(it.node.val);
                it.num++;
                st.push(it);
                if(it.node.left!=null){
                    st.push(new Pair(it.node.left,1));
                }
            }
            else if(it.num==2){
                in.add(it.node.val);
                it.num++;
                st.push(it);
                if(it.node.right!=null){
                    st.push(new Pair(it.node.right,1));
                }
            }
            else{
                post.add(it.node.val);
            }
        }
        System.out.println("PreOrder: "+pre);
        System.out.println("InOrder: "+in);
        System.out.println("PostOrder: "+post);
   }
   public static void main(String[] args){
    TraversalInBinaryTree obj=new TraversalInBinaryTree();
    TreeNode rootnode=new TreeNode(1);
    rootnode.left=new TreeNode(2);
    rootnode.right=new TreeNode(5);
    rootnode.left.left=new TreeNode(3);
    rootnode.left.right=new TreeNode(4);
    rootnode.right.left=new TreeNode(6);
    rootnode.right.right=new TreeNode(7);
    obj.PreInPostTraversal(rootnode);
   } 
}
