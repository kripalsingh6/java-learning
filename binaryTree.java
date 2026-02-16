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
     public static int longestBalanced(int[] nums) {
        int Maxlength= 0;

        int n= nums.length;
        for(int i=0; i<n; i++){
              Map<Integer, Integer> even = new HashMap<>();
        Map<Integer, Integer> odd  = new HashMap<>();
            if(n-i<=Maxlength){
                break;
            }
            for(int j=i; j<n; j++){
               if (nums[j] % 2 == 0) {
                even.put(nums[j], even.getOrDefault(nums[j], 0) + 1);
            } else {
                odd.put(nums[j], odd.getOrDefault(nums[j], 0) + 1);
            }
                if(even.size()==odd.size()){
                    Maxlength= Math.max(Maxlength, j-i+1);
                }
            }
        }
        return Maxlength;
    }
    public static int power(int n){
        if(n<0){
           return 0;
        }
        
        int nums= power(n-1);
        return nums;
    }
    public static void subarray(int arr[]){
        int n = arr.length;

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {

                // Print subarray from start to end
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
    public static String sumStr(String a, String b){
         StringBuilder result = new StringBuilder();
        
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        
        while (i >= 0 || j >= 0 || carry > 0) {
            
            int sum = carry;
            
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            
            result.append(sum % 2);
            carry = sum / 2;
        }
        
        return result.reverse().toString();
    }


    public static int reverseBits(int n) {
        
        String binary = String.format("%32s", Integer.toBinaryString(n))
                            .replace(' ', '0');
        
        String reverse = new StringBuilder(binary).reverse().toString();

        int decimal= 0;
        int power= 0;
        for(int i=reverse.length()-1; i>=0; i--){
            int digit= reverse.charAt(i)-'0';
            decimal+= digit*Math.pow(2, power);
            power++;
        }
        return decimal;
    }
    public static void main(String[] args) {
        //  int nums[]={2,4,3,5};
        // System.out.println(longestBalanced(nums));
        //  subarray(nums);
        // String a= "10101";
        // String b= "1110";
        // System.out.println(sumStr(a, b));
        System.out.println(reverseBits(52135));

        // Node root = new Node(1);
        // root.right = new Node(2);
        // root.right.right = new Node(3);
        // root.right.right.right = new Node(4);

        // Node balancedRoot = BalancedSearch(root);
        // inorder(balancedRoot); // test
    }
}
