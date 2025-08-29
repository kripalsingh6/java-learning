public class max_sum_array {
    public static void max_sum_subarray(int number[]){
        int currsum=0;
        int maxsum =Integer.MIN_VALUE;
        for(int i = 0;i<number.length;i++){
            int start=i;
            for(int j=i; j<number.length; j++){
                int end=j;
                currsum=0;
                for(int k=start; k<=end; k++){
                    currsum+=number[k];
                }
                System.out.println(currsum);
                    if(maxsum<currsum){
                        maxsum=currsum;
                    }
                
                
            }
        }
        System.out.println("maxsum is "+ maxsum);

    }
    public static void main(String[] args) {
        int number[]={-2,-1,6,2,4  };
        max_sum_subarray(number);

    }
    
}
