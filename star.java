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
            for(int j=i; j<=n; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int n=5;
        // hollowstar(n);
        triNum(n);
    }
}
