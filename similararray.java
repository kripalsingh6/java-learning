public class similararray {
    /*public static boolean duplicate(int nums[]){
        int n = nums.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }

        }
        return false;
        
    }*/
    public static int searching(int nums[],int target){
        for(int i=0; i<=nums.length; i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        //int nums[]={1,2,4,1};
        //int nums[]={1,2,3,4,5};
        //boolean d=duplicate(nums);
        //System.out.println(d);
        int nums[]={4,5,6,7,0,1,2};
        
        int target=7;
        System.out.println(searching(nums, target));
        
    }
}
