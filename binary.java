import java.util.Scanner;

public class binary {
    /*public static void bintodec(int binNum){
        int mynum= binNum;
        int decNum=0;
        int pow = 0;
        while (binNum>0) {
            int lastdigit= binNum%10;
            decNum=decNum + (lastdigit *(int) Math.pow(2,pow));
            pow++;
            binNum=binNum/10;

        }
        System.out.println("binNum to "+ mynum + "="+ decNum);


    }
    public static void main(String[] args) {
        bintodec(1001);
    }

    public static void decitobin(int deciNum){
        int binNum=0;
        int mynum= deciNum;
        int pow= 0;
        while(deciNum>0){
            int remainder= deciNum%2;
            binNum=binNum + (remainder* (int)Math.pow(10,pow));
            pow++;
            deciNum=deciNum/2;
        }
        System.out.println("decimal of "+ mynum +"="+ binNum);
    }

    public static void main(String[] args) {
        decitobin(7);
    }

    //to calculate the prime oor not prime number 
    public static boolean isprime(int n){
        boolean isprime=true;
        for(int i =2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
                
            }
        }
        return isprime;
    }
    public static void main(String[] args) {
        System.out.println(isprime(53));
    }

    // sum of integer 
    public static int sum(int n){
        int digit=0;
        while(n>0){
            int lastnumber=n%10;
            digit=+lastnumber;
          n/=10; 

        }
        return digit;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int digit = sc.nextInt();
        System.out.println(sum(digit));
    }*/

    //check a number is true or false with the help of boolean expression

    /*public static boolean iseven(int n){
        boolean isodd = false;
        if(n%2==0){
            return true;
        } 
        return isodd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(iseven(n));
    }

    public static boolean isprime(int n){
        boolean isprime = true;
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            
            }
        }
        return isprime;

    }
    public static int isfactorial(int n){
        int factorial=1;
        for(int i= 1; i<=n-1; i++){
             factorial= factorial*i;
        }
        return factorial;
    }
    public static void main(String[] args){
        int n= 50;
        System.out.println(isprime(n));
        System.out.println(isfactorial(8));
    }*/

    public static void bintodec(int binNum){
        int deciNum=0;
        int pow = 0;
        int mynum= binNum;
        while(binNum>0){
            int lastdigit= binNum%10;
            deciNum= deciNum+ (lastdigit* (int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("binary number ="+ mynum+"deci="+deciNum);
    }
    public static void main(String[] args) {
        int n=102;
        bintodec(n);
    }
}
