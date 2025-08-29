public class kadane {
    public static void neg_kadane(int number[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0; i<number.length; i++){
            cs =cs+number[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
            }
            System.out.println(ms);
        }
    

    public static void main(String[] args) {
        int number[]={-2,-3,-4,2,4,5,-1};
        neg_kadane(number);
    }
    
}
