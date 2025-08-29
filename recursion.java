public class recursion {
    // this is a regular method 
    public static void decrease(int n){
        for(int i=n; i>0; i--){
            System.out.println(i); 
        }
        
    }
    //recurison method
    public static void printdec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printdec(n-1);
    }
    public static void printinc(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printinc(n-1);
        System.out.println(n);
    }
    public static int factorial(int n){
        if(n==0){
            return 1;

        }
        int fun1 =factorial(n-1);
        int fun= n*fun1;
        return fun;
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int fn1=sum(n-1);
        int fn=n+fn1;
        return fn;
    }
    public static int fib(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }
        int fib1=fib(n-1);
        int fib2=fib(n-2);
        int fib=fib1+fib2;
        return fib;
    }
    public static boolean issorted(int i, int arr[]){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return issorted(i+1,arr);
    }
    public static int firstoccurance(int arr[],int key , int i){
        if(i==arr.length){
            return -1;
        }
        
        if(arr[i]==key){
            return i;
        }
        return firstoccurance(arr, key, i+1);
    }
    public static int lastoccurance(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        int isfound= lastoccurance(arr, key, i+1);
        if(arr[i]==key && isfound==-1 ){
            return i;
        }
        return isfound;
    }
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int xn1= power(x, n-1);
        int xn=x*xn1;
        return xn;
    }
    public static int optimized(int x, int n){
        if(n==0){
            return 1;
        }
        int halfval=optimized(x, n/2);
        int halfval2=halfval*halfval;
        // n is odd
        if(n%2!=0){
             halfval2= x*halfval2; 
        }
        return halfval2;
    }

    // imporatnt problem tiling problem
    public static int tilingproblem(int n){
        if(n==0 || n==1){
            return 1;
        }
        // for vertical
        int fnm1=tilingproblem(n-1);
        // for horizontal 
        int fnm2= tilingproblem(n-2);
        int totalways= fnm1+fnm2;
        return totalways;
    }
    // imp friend pairing problem 

    public static int friend_pair(int n){
        if(n==1 || n==2){
            return n;
        }
        // for single stand
        int fnm1=friend_pair(n-1);
        // stand in pair
        int fnm2=friend_pair(n-2);
        int fnm3=(n-1)*fnm2;
        int totalpair=fnm1+fnm3;
        return totalpair;
    }

    // binary ways

    public static void binarystring(int n, int lastplace, String str ){
        if(n==0){
            System.out.println(str);
             return;
        }
        binarystring(n-1, 0, str+"0");
        if(lastplace==0){
            binarystring(n-1, 1, str+"1");
        }
    }
    public static void search_number(int arr[],int i,int key){
        if(i==arr.length){
            return ;
        }
      
        if(arr[i]==key){
            System.out.println(i+" ");
        }
        search_number(arr, i+1, key);
    }
    public static void main(String[] args){
        //int n=10;
       // int arr[]={1,2,3,4};
        //System.out.println(issorted(0, arr));
        //int arr[]={8,3,6,9,5,10,2,5,3};
       // System.out.println(firstoccurance(arr, 5, 0));
        //System.out.println(lastoccurance(arr, 5, 0));
       // decrease(n);
        //printinc(n);
       // System.out.println(factorial(n));
       //System.out.println(sum(n));
       //System.out.println(fib(n));
       //System.out.println(power(2, 10));
      // System.out.println(optimized(2, 10));
      //System.out.println(tilingproblem(4));
      //System.out.println(friend_pair(5));
      //binarystring(3, 0, "");
      int arr[]={3,2,4,5,6,2,7,2,2};
      search_number(arr, 0, 2);
    }
}
