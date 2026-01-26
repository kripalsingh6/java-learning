import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class star {

    public static void hollowstar(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || j==1 || i==n || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void triNum(int n){
        for(int i = 1; i<=n; i++){
            for(int j=n-i; j<=n; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void hollowRect(int n){
        for(int i=1 ; i<=n; i++){
            for(int j=1; j<=n ; j++){
                if(i==1 || j==1 || j==n || i==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
     
    public static void hollowTri(int n){
        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                if(i==1 || j ==1 || j==n || i==j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static int kadane(int num[]){
        int maxnum= Integer.MIN_VALUE;
        int currnum=0;
        
        for(int i=0; i<num.length; i++){
            currnum=Math.max(num[i], currnum+num[i]);
             maxnum= Math.max(maxnum, currnum);
        }
        return maxnum;
    }

    public static void halftri(int n){
        for(int i=1; i<=n; i++){
            for(int j=n-i; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void fulltri(int n){
        for (int i = 1; i <= n; i++) {
            // Print spaces for left padding
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            // Move to next line
            System.out.println();
        }
    }
    public static void doubletri(int n){
        for (int i = 1; i <= n; i++) {
            // Print spaces for left padding
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            // Move to next line
            System.out.println();
        }

        for(int i=n; i>=1; i--){
            for(int j=n; j>=i; j--){
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
        }
        System.out.println();

    }
}

public static void square(int n){
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

public static void hollowsqu(int n){
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n; j++){
            if(i==1 || j==1 || i==n || j==n){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

public static void  rhombus(int n){
     for(int i=1; i<=n; i++){
      for(int s=1; s<=n-i; s++){
        System.out.print(" ");
      }
        for(int j=1; j<=n; j++){
            System.out.print("*");
        }
        
        System.out.println();
    }
}
public static void hollowrom(int n){
     for(int i=1; i<=n; i++){
      for(int s=1; s<=n-i; s++){
        System.out.print(" ");
      }
        for(int j=1; j<=n; j++){
            if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
        }
        
        System.out.println();
    }
}
public static void doublehollowrom(int n){
     for(int i=1; i<=n; i++){
      for(int s=1; s<=n-i; s++){
        System.out.print(" ");
      }
        for(int j=1; j<=n; j++){
            if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
        }
        
        System.out.println();
    }
    for(int i=1; i<=n; i++){
      for(int s=1; s<=n-i; s++){
        System.out.print(" ");
      }
        for(int j=1; j<=n; j++){
            if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
        }
        
        System.out.println();
    }
}
    public static int minDiferrence(int nums[],int k){
      if(k==1){
        return 0;
        }
        Arrays.sort(nums);
        int minDiff= Integer.MAX_VALUE;
      for(int i=0 ; i+k-1<nums.length; i++){
        int currnum= nums[i+k-1]-nums[i];
        minDiff= Math.min(minDiff, currnum);
      }
      return minDiff;
    };

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int minDiffer=Integer.MAX_VALUE;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=1; i<arr.length; i++){
            minDiffer= Math.min(minDiffer, arr[i]-arr[i-1]);
        };
        for(int i=1; i<arr.length; i++){
            if(arr[i]-arr[i-1]== minDiffer){
                result.add(Arrays.asList(arr[i - 1], arr[i]));
            }
        };
        return result;
       
        
    }

    public static void main(String args[]){
        int nums[]={4,2,1,3};
        int k=2;
        star obj = new star(); 
        // hollowstar(n);
        // triNum(n);
        // hollowRect(n);
        // hollowTri(n);
        // System.out.println(kadane(num));
        // doubletri(n);

        // square(n);
    //   rhombus(n);
    // doublehollowrom(n);
    System.out.println(obj.minimumAbsDifference(nums));
    }
}
