import java.util.Scanner;

public class twodarray {
    public static void largest(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        int n = matrix.length , m= matrix .length;
        for(int i=0; i<n; i++){
            for(int j= 0; j<m; j++){
               if(largest<matrix[i][j]){
                largest =matrix[i][j];
               }
            }
    }
    System.out.println(largest);
}
public static void smallest(int matrix[][]){
    int smallest = Integer.MAX_VALUE;
    int n = matrix.length , m= matrix[0].length;
    for(int i=0; i<n; i++){
        for(int j= 0; j<m; j++){
           if(smallest>matrix[i][j]){
            smallest =matrix[i][j];
           }
        }
}
System.out.println(smallest);
}
    public static boolean value(int matrix[][] ,int key ){
        int n = matrix.length , m= matrix .length;
        for(int i=0; i<n; i++){
            for(int j= 0; j<m; j++){
               if(matrix[i][j]==key){
                System.out.print("found at cell (" + i +","+j+")");
                return true;
               }
            }
           
    }
    System.out.println("key not found ");
    return false;
    }
    /*public static void main(String[] args){
        int matrix[][]= new int[3][3];
        int key =5;
        int n = matrix.length , m= matrix .length;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j= 0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j= 0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }*/
        public static void main(String[] args){
            int matrix[][]=new int [4][5];
            int key = 6;
            int n=matrix.length ,  m= matrix[0].length;
            Scanner sc =new Scanner(System.in);
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    matrix[i][j]=sc.nextInt();
                }
            }
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }


    value(matrix, key);
   largest(matrix);
    smallest(matrix);
        
}
}
