public class monotonic {
    public static boolean ismonotonic(int nums[]){

        boolean increasing=true;
        boolean decreasing=true;
        int k=nums.length-1;
        int i=1;
        int j=i-1;
        while(i<=k && j<= k ){
            if(nums[i]>=nums[j] ){
                
                increasing=false;
                
            }else{
               if(nums[i]<=nums[j] ){
                decreasing=false;
               }
            }
            i++;
            j++;
            
        }
        return increasing || decreasing;

    }
    public static int islonely(int nums[]){
        for(int i=0; i<nums.length; i++){
            if(nums[i]>nums[i]-1 && nums[i]<nums[i]+1){
                return nums[i];
            }
        }
        return 0;
    }
    public static void main(String[] args){
        // int nums[]={1,3,2};
        // System.out.println(ismonotonic(nums));
        int nums[]={10,6,5,8};
        System.out.println(islonely(nums));
    }
}
