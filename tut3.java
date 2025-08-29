import java.util.Scanner;

public class tut3 {
    public static int product(int a,int b){
        return a*b;
    }
    public static int difference(int a,int b){
        int diff= a-b;
        return diff;
    }
    /*public static int factorial(int n){
        int fact= (n)*(n-2)*(n-1);
        return fact;
    }*/
    public static int factorial(int n){
        int f=1;
        for(int i=1; i<=n; i++){
            f=f*i;
        }
        return f;
    }
    public static int binomial(int n ,int r){
        int a = factorial(n);
        int b= factorial(r);
        int c= factorial(n-r);

        int coefficient = (a)/(b*c);

        return coefficient ;
    }
    public static void main(String[] args) {
        /*int a=2;
        int b=4;
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int n = sc.nextInt();
        int c= product(a,b);
        int d =difference(a,b);
        int fact=factorial(n);
        int fact1=newfactorial(n);
        System.out.println("factorial of given value is ="+n+" " + fact1);
        System.out.println("factorial of given value is ="+n+" " + fact);
        System.out.println(c);
        System.out.println(d);*/
        int n= 5;
        int r= 2;
        int a = factorial(n);
        int b= factorial(r);
        int c= factorial(n-r);
        int bin= a/(b*c);
        System.out.println(bin);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        
      //  int coefficient = binomial(5,2);
        //System.out.println(coefficient);
        


    }
}
        
