import java.util.*;
public class backtracking {
    // public static void backarr(int arr[],int i, int val){
    //     if(i==arr.length){
    //         return;
    //     }
    //     arr[i]=val;
    //     backarr(arr, i+1, val+1);
    //     arr[i]=arr[i]-2;

    // }
    // public static void printarr(int arr[]){
    //     for(int i=0;i<arr.length; i++){
    //         System.out.print(arr[i]);
    //     }
    // }
    // public static void main(String[] args) {
    //     int arr[]=new int[5];
    //     backarr(arr,0,1);
    //     printarr(arr);
    // }

    // public static void findsubsets(String str ,String ans,int i){
    //     //base case
    //     if(i==str.length()){
    //         System.out.println(ans);
    //         return;
    //     }

    //     // yes case
    //     findsubsets(str, ans+str.charAt(i), i+1);

    //     // no case
    //     findsubsets(str, ans, i+1);
    // }

    // public static void find_permutation(String str, String ans){
    //     // base case
    //     if(str.length()==0){
    //         System.out.println(ans);
    //         return;
    //     }

    //     // recurison 
    //     for(int i=0; i<str.length(); i++){
    //         char curr= str.charAt(i);
    //         // abcde=ab+de 'c is erase'
    //         String newstr= str.substring(0, i) +str.substring(i+1);
    //         find_permutation(newstr, ans+curr);
    //     }
    // }
//     public static boolean isSafe(char boardqueen[][],int row, int col){
//         //vertical
//         for(int i=row-1; i>=0; i--){
//             if(boardqueen[i][col]=='Q'){
//                 return false;
//             }
//         }
//         //right vertical
//         for(int i=row-1 , j=col+1; i>=0 && j<boardqueen.length; i--,j++ ){
//             if(boardqueen[i][j]=='Q'){
//                 return false;
//             }
//         }
//         //left vertical
//         for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){
//             if(boardqueen[i][j]=='Q'){
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void nqueen( char boardqueen[][] ,int row){
//         //base case
//         if(boardqueen.length==row){
//             printboard(boardqueen);
//             return;
//         }
//         //recursion
    
//         for(int j=0; j<boardqueen.length; j++){
//            if(isSafe(boardqueen, row, j)){

//             boardqueen[row][j]='Q';
//             nqueen(boardqueen,row+1);
//             boardqueen[row][j]='x';
//           }

//         }
//     }

//     public static void printboard(char boardqueen[][]){
//         System.out.println("-------- chess board------");
//         for(int i=0; i<boardqueen.length; i++){
//             for(int j=0; j<boardqueen.length; j++){
//                 System.out.print(boardqueen[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args){
//        // String str= "abc";
//         // findsubsets(str, " ", 0);
//         //find_permutation(str," ");
//         int n=4;
//         char boardqueen[][]= new char[n][n];
//         for(int i=0; i<n; i++){
//          for(int j=0; j<n; j++){
//            boardqueen[i][j]= 'x';
//          }
//         }
//         //printboard(boardqueen);
//         nqueen(boardqueen,0);
//        // isSafe(boardqueen, 0, 0);

//     }
        // public static boolean isSafe(char board[][],int row, int col){
        //     for(int i=row-1; i>=0; i--){
        //         if(board[i][col]=='Q'){
        //             return false;
        //         }
        //     }
        //     for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
        //         if(board[i][j]=='Q'){
        //             return false;
        //         }
        //     }
        //     for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
        //         if(board[i][j]=='Q'){
        //             return false;
        //         }
        //     }
        //     return true;
       // }
    //    public static void isqueen(char board[][] , int row){
    //     if(board.length==row){
    //         //printarr(board);
    //         count++; // TO CALCULATE THE COUNT OF BOARD FOR QUEENS 
    //         return;
    //     }
    //      for(int j=0; j<board.length; j++){
    //     if(isSafe(board, row, j)){ 
    //         board[row][j]='Q';
    //         isqueen(board, row+1);
    //         board[row][j]='x';
    //     }
    //     }
    //    }  

    //    public static void printarr(char board[][]){
    //     System.out.println("-------chess board--------");
    //     for(int i=0; i<board.length; i++){
    //         for(int j=0; j<board.length; j++){
    //             System.out.print(board[i][j]+" ");
    //         }
    //         System.out.println();
    //     }
    //    }

    //  static int count=0;

     public static int gridways(int i, int j ,int n, int m){
        // base case 
        if(i==n-1 && j==m-1){
            return 1;
        }else if(i==n || j==n ){
            return 0;
        }
        int f1=gridways(i, j+1, n, m);
        int f2=gridways(i+1, j, n, m);
        return f1+f2;

     }

     public static boolean isSafe(int sudokusol[][], int row, int col, int digit){
        // row 
        for(int i=0; i<=8; i++){
            if(sudokusol[i][col]==digit){
                return false;
            }
        }
        //col
        for(int j=0; j<=8; j++){
            if(sudokusol[row][j]==digit){
                return false;
            }
        }
        //self grid
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr; i<sr+3; i++){
            for(int j=sc; j<sc+3; j++){
                if(sudokusol[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
     }

     public static boolean sudoku(int sudokusol[][], int row,int col ){
        // base case
        if(row==9 && col==0){
            return true;
        }

        int nextrow=row, nextcol=col+1;
        if(col+1==9){
            nextrow=row+1;
            nextcol=0;
        }
        //recursion
        if(sudokusol[row][col] !=0){
            return sudoku(sudokusol, nextrow, nextcol);
        }
        for(int digit=1; digit<=9; digit++){
            if(isSafe(sudokusol, row, col, digit)){  
                sudokusol[row][col]=digit;
                if(sudoku(sudokusol, nextrow, nextcol)){
                    return true;
                }
                sudokusol[row][col]=0;

            }
        }
        return false;
     }
     public static void printsudo(int sudokusol[][]){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                System.out.print(sudokusol[i][j]+" ");
            }
            System.out.println();
        }
     }
    public static void main(String[] args) {
        // int n=4;
        // char board[][]=new char[n][n];
        // for(int i=0; i<n;i++){
        //     for(int j=0; j<n; j++){
        //         board[i][j]='x';
        //     }
        // }
        // isqueen(board,  0);
        // System.out.println("total number of nqueens in board "+ count);
        // int n=3,m=3;
        // System.out.println(gridways(0,0,n,m));
        int sudokusol[][]={{7,9,0,0,2,0,0,0,0},
                           {0,0,0,4,0,0,0,0,0},
                           {4,0,5,7,0,0,3,2,0},
                           {0,4,0,5,0,0,1,0,0},
                           {8,1,9,0,0,0,7,0,0},
                           {0,7,6,0,9,0,0,0,0},
                           {0,0,0,0,0,5,0,7,0},
                           {0,0,0,9,1,0,5,4,0},
                           {0,0,0,6,0,8,0,0,9}};

                        if(sudoku(sudokusol, 0, 0)){
                            System.out.println("solution exists");
                            printsudo(sudokusol);
                        }else{
                            System.out.println("solution not exist");
                        }

    }

 }
