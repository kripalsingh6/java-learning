public class searchsortedarray {
    public static boolean searchsortedarray(int array[][], int key){
        int row=0, col=array[0].length-1;
        
        while(row<array.length && col>=0){
            if(array[row][col]==key){
                System.out.print("key will found "+"("+ row +" "+col+")");
                return true;
            }
            else if(key<array[row][col]){
                col--;
            }
            else{
                row++;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        int array[][]={{10,20,30,40},
                         {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        int key =33;
        searchsortedarray(array, key);
    }
}
