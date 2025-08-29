public class subarray {
    public static int subarray(int number[]){
        for(int i = 0; i<number.length; i++){
            int index= i;
            for(int j=0; j<number.length; j++){
                int index2= j;
                for(int k=index; k<index2; k++){
                    System.out.print(number[k]);
                }
                System.out.println();
            }
            
        }
        return -1;
    }
    public static void main(String[] args){
        int number[]={2,4,6,8,10,12};
        subarray(number);
        int n=number.length;
        int tp=(n)*(n-1)/2;
        System.out.println(tp);
    }
}
