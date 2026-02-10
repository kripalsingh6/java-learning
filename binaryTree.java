import java.util.*;

import org.w3c.dom.Node;

public class binaryTree {
    static class Node {
      int data;
      Node left;
      Node right;
      
       Node (int data){
        this.data=data;
        this.left=null;
        this.right=null;
      }
        
    }

    static class InnerbinaryTree {
         static int idx=-1;
         public static Node Buildtree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode= new Node(nodes[idx]);
            newNode.left = Buildtree(nodes);
            newNode.right= Buildtree(nodes);
             return newNode;
         }
        
    }
    public static void preorder(Node root){
        if(root==null){
            return ;
        }
        System.out.println(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void levelOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q= new LinkedList();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if(currNode==null){
                System.out.println("null");
                if(q.isEmpty()){
                    break;
            }else{
                q.add(null);
            }
        }
        else{
            System.out.println(currNode.data);
            if(currNode.left!=null){
                q.add(currNode.left);
            }
            if(currNode.right !=null){
                q.add(currNode.right);
            }
        }
        
    }
}
 static ArrayList<Integer> inorderlist = new ArrayList<>();

    public static Node BalancedSearch(Node root) {
        inorderlist.clear();
        inorder(root);
        return BuildTree(0, inorderlist.size() - 1);
    }

    public static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        inorderlist.add(root.data);
        inorder(root.right);
    }

    public static Node BuildTree(int left, int right) {
        if (left > right) return null;

        int mid = left + (right - left) / 2;
        Node node = new Node(inorderlist.get(mid));

        node.left = BuildTree(left, mid - 1);
        node.right = BuildTree(mid + 1, right);

        return node;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.right = new Node(2);
        root.right.right = new Node(3);
        root.right.right.right = new Node(4);

        Node balancedRoot = BalancedSearch(root);
        inorder(balancedRoot); // test
    }
}
