public class pair {
//     public static void printpair(int number[]){
//         for(int i=0; i<number.length; i++){
//             int curr=number[i];
//             for(int j=i+1; j<number.length; j++){
//                 System.out.print("("+ curr +","+number[j]+")");

// }     
//      System.out.println();   }
     
//     }
    
//     public static void main(String[] args) {
//         int number[]={2,4,6,8,10};
//         printpair(number);
//         int n = number.length;
//         int tp=(n)*(n-1)/2;
//         System.out.println("total number of pair is "+tp);
        
        
        
        
//     }


public static int arrayPairSum(int[] nums, int currnum, int currnum2) {
        int sum=0;
        for(int i=0; i<nums.length; i+=2){
        sum=Math.min(currnum,currnum2);
        sum += nums[i];

        }
        return sum;

    }


    public static int numspair(int nums[]){
            for(int i=0; i<nums.length; i++){
                int currnum=nums[i];
                for(int j=i+1; j<nums.length; j++){
                    int currnum2=nums[j];
              
                    return arrayPairSum(nums,currnum,currnum2);
                }
            }
            
    }
    
    public static void main(String[] args){
        int nums[]={1,4,3,2};
        System.out.print(numspair(nums));

    }
}
