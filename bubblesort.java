public class bubblesort {
    public static void bubblesort(int nums[]){
        int n= nums.length;
        for(int turn=0; turn<n-1; turn++){
            for(int j=0;j<n-1-turn;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
    public static void selectionsort(int nums[]){
        int n=nums.length;
        for(int i=0; i<n-1; i++){
            int minpos=i;
            for(int j=i+1; j<n; j++){
                if(nums[minpos]>nums[j]){
                    minpos=j;
                }
            }
            int temp= nums[minpos];
            nums[minpos]=nums[i];
            nums[i]=temp;
        }
    }
    
    public static void print(int nums[]){
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[]={4,2,5,3,1};
        // bubblesort(nums);
        selectionsort(nums);
        
        print(nums);
    }
}
