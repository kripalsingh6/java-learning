public class max {
    public static void maxsum(int nums[]){
        int maxnum= Integer.MIN_VALUE;
        int currnum= 0;
        int n= nums.length;
        for(int i=0; i<n; i++){
            currnum=currnum+nums[i];
            if(currnum<0){
                currnum=0;
            }
            System.out.println(currnum);
            maxnum=Math.max(currnum,maxnum);
        }
        System.out.println(maxnum);

    }
    public static int trapedwater(int nums[]){
        int n=nums.length;
        int leftmax[]= new int[n];
         leftmax[0]= nums[0];
         for(int i=1; i<n; i++){
            leftmax[i]=Math.max(nums[i],leftmax[i-1]);
         }
         int rightmax[]=new int[n];
         rightmax[n-1]=nums[n-1];
         for(int i=n-2; i>=0;i--){
            rightmax[i]=Math.max(nums[i],rightmax[i+1]);
         }
         int trapwater=0;
         for(int i=0; i<n ; i++){
            int maxwater=Math.min(rightmax[i],leftmax[i]);
            trapwater+=maxwater-nums[i];
         }
         return trapwater;


        }
        public static void bubblesort(int nums[]){
            int n=nums.length;
            for(int i=0; i<n-1; i++){
                for(int j=0; j<n-1-i;j++){
                    if(nums[j+1]<nums[j]){
                        int temp =nums[j+1];
                        nums[j+1]=nums[j];
                        nums[j]=temp;
                    }
                }
            }
        }
        static public void selectionsort(int nums[]){
            int n=nums.length;
            for(int i=0 ; i<n-1; i++){
                int curr=i;
                for(int j=i+1;j<n; j++){
                    if(nums[curr]<nums[j]){
                        curr=j;
                    
                    }
                    int temp=nums[curr];
                    nums[curr]=nums[j];
                    nums[j]=temp;   
                }
            }

        }
        public static void insertionsort(int nums[]){
            int n= nums.length;
            for(int i = 1; i<n; i++){
                int curr=nums[i];
                int prev=i-1;
                while(prev>=0 && nums[prev]>curr){
                    nums[prev+1]=nums[prev];
                    prev--;
                }
                nums[prev+1]=curr;
            }
        }
        
        public static void countingsort(int nums[]){
            int largest=Integer.MIN_VALUE;
            for(int i=0; i<nums.length; i++){
                largest=Math.max(largest,nums[i]);
            }
            int count[]=new int[largest+1];
            for(int i=0; i<nums.length; i++){
                count[nums[i]]++;
            }
            int j=0;
            for(int i=0; i<count.length; i++){
                while(count[i]>0){
                    nums[j]=i;
                    j++;
                    count[i]--;

                }
            }
        }
        static public void print(int nums[]){
            int n=nums.length;
            for(int i=0; i<n; i++){
                System.out.print(nums[i]);
            }
            System.out.println();
        }
    public static void main(String[] args) {
        int nums[]= {5,0,1,4,3,6};
       // maxsum(nums);
       //int w= trapedwater(nums);
       //System.out.println(w);
       
       //bubblesort(nums);
      // selectionsort(nums);
      //insertionsort(nums);
      countingsort(nums); 
      print(nums);
       

    }
}
