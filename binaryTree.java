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
    public static int singleNumber(int[] nums) {
        int result=0;
        for(int i=0; i<nums.length; i++){

            result= result ^ nums[i];
        }
        return result;
    }
      public static List<String> readBinaryWatch(int turnedOn) {
        List<String> result= new ArrayList<>();

        for(int hour=0; hour<12; hour++){
            for(int minute=0; minute<60; minute++){

                int totalcount= Integer.bitCount(hour)+ Integer.bitCount(minute);
                if(totalcount==turnedOn){
                    result.add(hour + ":" + String.format("%02d",minute));
                }
            }
        }
        return result;
    }
     public static boolean hasAlternatingBits(int n) {
        
        // String binary= "";
        // while(n>0){
        //     int remainder= n%2;
        //     binary= remainder+ binary;
        //     n=n/2;
        // }

        // for(int i=1; i<binary.length(); i++){
        //     if(binary.charAt(i) ==binary.charAt(i-1)){
        //         return false;
        //     }

        // }
        // return true;
        int prev = n % 2;   // get last digit (0 or 1)
        n = n / 2;          // divide by 2

        while(n > 0){
            int curr = n % 2;   // get next digit
            
            if(curr == prev){   // if two adjacent bits are same
                return false;
            }
            
            prev = curr;        // update previous
            n = n / 2;          // divide by 2 again
        }

        return true;
    }
     public static int countBinarySubstrings(String s) {
        int prev= 0; 
        int curr= 1;
        int result=0;
        
         for(int i=1; i<s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
               curr++;
            }else{
                result += Math.min(prev,curr);
                prev= curr;
                curr=1;
            }
        }
        result += Math.min(prev,curr);
        return result;
    }
    public static int value(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fact=n*value(n-1);
        return fact;
    }
    public static boolean getpath(Node root, int n , ArrayList<Node> path){

        if(root==null){
            return false;
        }
        path.add(root);
        if(root.data == n ){
            return true;
        }

        boolean foundleft= getpath(root.left, n, path);
        boolean foundright= getpath(root.right, n, path);

        if(foundleft || foundright){
            return true;
        }
          path.remove(path.size()-1);
        return false;
        
    }

    public static Node lca(Node root , int n1 , int n2){

        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2= new ArrayList<>();

        getpath(root, n1 , path1);
        getpath(root, n2, path2);
        int i=0;

        for(; i<path1.size() && i<path2.size(); i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }
        Node lca = path1.get(i-1);
        return lca;
        
    }
    public static Node lca2(Node root , int n1 , int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }
        Node leftlca= lca2(root.left, n1, n2);
        Node rightlca= lca2(root.right, n1, n2);

        if(leftlca == null){
            return rightlca;
        }
        if(rightlca == null){
            return leftlca;
        }
        return root;
    }
    public static int lcadis(Node root , int n){
        if(root==null){
            return -1;
        }
        if(root.data == n){
            return 0;

        }

        int leftdis=lcadis(root.left, n);
        int rightdis=lcadis(root.right, n);

       if(leftdis == -1 && rightdis == -1){
    return -1;
}
else if(leftdis == -1){
    return rightdis + 1;
}
else{
    return leftdis + 1;
}

    }
    public static int MiniDis(Node root , int n1 , int n2){
        Node lca = lca2(root, n1, n2);
        int dis1= lcadis(lca,n1);
        int dis2 = lcadis(lca , n2);
        return dis1 + dis2;
    }
    public static void main(String[] args) {
        //  int nums[]={2,4,2,4,3,3,5};
        //  System.out.println(singleNumber(nums));
        // String n="00110010";
        // System.out.println(countBinarySubstrings(n));
        // int n=5;
        // System.out.println(value(n));
        // System.out.println(longestBalanced(nums));
        //  subarray(nums);
        // String a= "10101";
        // String b= "1110";
        // System.out.println(sumStr(a, b));
        // System.out.println(reverseBits(52135));


         Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

       root.left.left = new Node(4);
        root.left.right = new Node(5);

       root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1=4;
        int n2=5;

        System.out.println( MiniDis(root, n1, n2));

        // Node balancedRoot = BalancedSearch(root);
        // inorder(balancedRoot); // test
    }
}
