public class diagonalsum {
    // method 1
    public static int diagonalsum(int matrix[][]){
        int sum=0;
        int maxnum =Integer.MIN_VALUE;
       /*  for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                // primary 
                if(i==j){
                    sum +=matrix[i][j];
                }else if(i+j==matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
        }*/
        for(int i=0; i<matrix.length; i++){
            sum+= matrix[i][i];
            if(i != matrix.length-1-i){
                sum+=matrix[i][matrix.length-1-i]; 
                
            }
            System.out.println(sum);
         
            maxnum=Math.max(maxnum,sum);
        }
       // System.out.println();
        return maxnum;
    }
    public static int sum(int matrix[][]){
        int sum=0;
        int maxnum= Integer.MIN_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                if(i==j){
                    sum+=matrix[i][j];
                }else if(i+j==matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
            System.out.print(sum);
            maxnum= Math.max(maxnum,sum);
        }
        return maxnum;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};
                   // diagonalsum(matrix);
                    sum(matrix);
                    System.out.println(diagonalsum(matrix));

    }
}
