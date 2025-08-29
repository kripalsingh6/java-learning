import java.util.Scanner;

/*public class function {
    public static int average(int a, int b, int c){
        int avg=(a+b+c)/3;
        return avg;
    }
    public static int sum(int num1, int num2){
        int addition= num1+num2;
        return addition;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int num1= sc.nextInt();
        int num2 = sc.nextInt();
        

        int addition= sum(num1,num2);
        System.out.println("the addtion of two number "+addition);
        int avg = average(a,b,c);
        System.out.println("the sum of two number"+avg);

    }
}*/

/*public class function {

   
    
    public static void main(){
        Scanner sc= new Scanner(System.in);
        int m= sc.nextInt();
        boolean b=istrue(m);

        System.out.println(b);
    }
    public static boolean istrue(int n){
        if (n%2==0) {
            return true;
        }else{
            return false;
        }
}
}*/

public class function {
    public static int sum(int a , int b, int c){
        return a+b+c;

    }
    public static int sum(int a,int b){
        return a+b;

    }
    public static float sum(int a , int  b, int c, float d){
        return a+b+c+d;
    }
    public static boolean prime(int n){
        boolean prime=true;
        if(n%n==1){
            System.out.println("prime"); 
        }else{
            System.out.println("not prime");
        }
        return prime;
        
    }
    /*public static boolean isprime(int n){
        boolean isprime=true;
        for(int i=2; i<=n-1;i++){
            if(n%i==0){
                isprime=false;
                break;
            }
        }
        return isprime;
    }*/
    public static boolean isprime(int n){
        boolean isprime = true;
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return isprime;
    }
    /*public static void primerange(int n){
    
        for(int i = 1; i<=n; i++){
            if(isprime(i)){
                System.out.print(i);
            }
            System.out.println();
        }
    }*/
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       // int a = sc.nextInt();
        //int b = sc.nextInt();
        //int c = sc.nextInt();
        int n = sc.nextInt();
       
       // float b = sc.nextFloat();
        //float c = sc.nextFloat();
      /*   float d = sc.nextFloat();
        System.out.println(sum(a,b));
        System.out.println(sum(a,b,c));
        System.out.println(sum(a,b,c,d));*/
        for(int i = 1; i<=n; i++){
            if(isprime(i)){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println(isprime(n));
        
        
    }

}
