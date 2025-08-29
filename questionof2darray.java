import java.nio.file.Path;

public class questionof2darray {
    public static int sum(int matrix[][]){
        int sum=0;
        for(int i=0; i<matrix.length; i++){
           /*for(int j=0; j<matrix[0].length; j++){
            if(i==1){
                sum +=matrix[i][j];
            }*/
            sum +=matrix[1][i];

           }
           return sum;
        }
    public static void find(int matrix[][], int key){
        int sum=0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==key){
                    sum++;
                    //sum +=matrix[i][j];
                }
            }
        }
        System.out.println(sum);
    }
    public static void turns(int matrix[][]){
       // int col=0 ,row=0;
       int transpose[][]=new int[matrix[0].length][matrix.length];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                transpose[j][i]=matrix[i][j];
            }
            
        }
        printmatrix(transpose);
        
    }
    public static void printmatrix(int matrix[][]){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        
    }
    public static float pathdistance(String path){ 
        int x=0 , y=0;
        for(int i=0; i<path.length(); i++){
           char dir = path.charAt(i);
            if(dir=='w'){
                x--;
            }
            else if(dir == 'n'){
                y++;
            }else if(dir== 's'){
                y--;
            }else{
                x++;
            }

        }
        int x2=x*x;
            int y2=y*y;
            return (float)Math.sqrt(x2+y2);
    }
    public static int kadane(int nums[]){
        int maxnum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0; i<nums.length; i++){
             sum = sum + nums[i];
            maxnum= Math.max(maxnum, sum);
            System.out.println(sum);
        }
        return maxnum;
    }
    public static void main(String[] args) {
       // int matrix[][]={ {1,4,9},{11,4,3},{2,2,3} };
      //  System.out.println(sum(matrix));
      int nums[]={2,5,3,4,6,8};
      System.out.println(kadane(nums));
        //int matrix[][]={ {4,7,8},{8,8,7} };
       // turns(matrix);
        //String path="wneenesennn";
      //  System.out.println(pathdistance(path));
        //int key=7;
        //find(matrix, key);
    }
}
