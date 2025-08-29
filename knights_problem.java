public class knights_problem {
    public static boolean knights(int grid[][], int row, int col ,int expval ,int n){
        
       
        if(row<0 || col<0 || row >=n || col>= n || grid[row][col] != expval){
            return false;
        }
        if(expval == n*n-1){
            return true;
        }

        return knights(grid, row - 2, col + 1, expval + 1, n) ||
               knights(grid, row - 1, col + 2, expval + 1, n) ||
               knights(grid, row + 2, col + 1, expval + 1, n) ||
               knights(grid, row + 1, col + 2, expval + 1, n) ||
               knights(grid, row + 1, col - 2, expval + 1, n) ||
               knights(grid, row + 2, col - 1, expval + 1, n) ||
               knights(grid, row - 2, col - 1, expval + 1, n) ||
               knights(grid, row - 1, col - 2, expval + 1, n);


              

    }
    public static void main(String[] args){
        int n=3;
        int grid[][]={{0,1,2},
                     {7,8,3},
                    {6,5,4}
                };
       boolean result= knights(grid, 0, 0,0,n);
       System.out.println(result);
    }  
}
