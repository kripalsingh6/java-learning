public class factorial {
    /*public static int factorial(int n){
        int fact=1;
        for(int i=1; i<=n; i++){
            fact=fact*i;
        }
        return fact;
    }*/
    public static int factorial(int n){
        int fact=1;
        for(int i=1; i<=n; i++){
            fact =fact*i;
        }
        return fact;
    }
    public static int upfactorial(int r){
        int fact=1;
        for(int i=1; i<=r; i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void binomial(int n, int r){
        int X=upfactorial(r);
        int Y=factorial(n);
        int z= (n-r);
        int binomial=Y/(X)*(z);
        System.out.println(binomial);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        
    }
    
}
