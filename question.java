public class question {
    
        /*public static  void maxSubArray(int[] nums) {
            int maxnum=Integer.MIN_VALUE;
            int currnum=0;
            for(int i=0; i<nums.length;i++){
               // currnum= currnum+nums[i];
                currnum=Math.max(nums[i],currnum+nums[i]);
               //if(currnum<0){
                //currnum=0;
               //}
               System.out.println(currnum);
                maxnum=Math.max(maxnum,currnum);
            }
            
            System.out.println(maxnum);
        }
            
        
        public static void main(String[] args){
           // int nums[]={-2,1,-3,4,-1,2,1,-5,4};
           //int nums[]={1};
           int nums[]={5,4,-1,7,8};
           //int nums[]={-2,1,4,-3};
            maxSubArray(nums);
            
    
        }*/

        /*public int twoSum(int nums [], int target) {
            int currsum=0;
            for(int i=1; i<=nums.length; i++){
                currsum +=nums[i];
                if(currsum>target){
                    currsum=target;
                }
                
                
            }
            
            return currsum;
        }*/
        /*public static int largest(int nums[]){
            int largest = Integer.MIN_VALUE;
            for(int i=0; i<nums.length;i++){
                largest=nums[i];
            }
            return largest;
        }

        public static void main(String[] args){
            int nums[]={2,7,11,15};
            //int target=9;
            System.out.println(largest(nums));
            
            
        }*/

        /*public static int trapedwater(int bars[]){
            int n=bars.length;
            int leftmax[]=new int [n];
            leftmax[0]=bars[0];
            for(int i=1; i<n; i++){
                leftmax[i]= Math.max(bars[i] , leftmax[i-1]);
            }
            int rightmax[]=new int [n];
            rightmax[n-1]=bars[n-1];
            for(int i=n-2; i>=0; i--){
                rightmax[i]=Math.max(bars[i],rightmax[i+1]);
            }
            int trapwater=0;
            for(int i=0; i<n; i++){
                int waterlevel =Math.min(rightmax[i],leftmax[i]);
                trapwater += waterlevel-bars[i];
            }
            return trapwater;
        }

        public static void main(String[] args) {
            int bars[]={0,1,0,2,1,0,1,3,2,1,2,1};
            System.out.println(trapedwater(bars));
        }*/
        /*public static void bubblesort(int nums[]){
            int n=nums.length;
            for(int turn=0;turn<n-1; turn++){
                for(int j=0; j<n-1-turn; j++){
                    if(nums[j]<nums[j+1]){
                        //nums[j]=nums[j+1];
                        int temp =nums[j];
                        nums[j]=nums[j+1];
                        nums[j+1]=temp; 

                    }
                }
            }
        }
        public static void selectionsort(int nums[]){
            int n = nums.length;
            for(int i=0; i<n; i++){
                int curr=i;
                for(int j=i+1; j<n;j++){
                    if(nums[curr]>nums[j]){
                        curr=j;
                    }
                }
                int temp=nums[curr];
                nums[curr]=nums[i];
                nums[i]=temp;

            }
        }
        public static void insertionsort(int nums[]){
            int n=nums.length;
            for(int i=1; i<n; i++){
                int curr=nums[i];
                int prev =i-1;
                while(prev>=0 && nums[prev]>curr){
                    nums[prev+1]=nums[prev];
                    prev--;
                }
                nums[prev+1]=curr;
                
            }
        }
        public static void print(int nums[]){
            for(int i=0; i<nums.length; i++){
                System.out.print(nums[i]);
            }
        }*/
        /*public static void checknum(int nums){
            
            if(nums%2==0){
                System.out.println("is even ");
            }
            else{
                System.out.println("is odd");
            }
        }*/

        /*public static void main(String[] args) {
           // int nums[]={3,6,2,1,8,7,4,5,3,1};
           //int nums[]={5,4,1,3,2};
           // bubblesort(nums);
           // selectionsort(nums);
           //insertionsort(nums);
            //print(nums);
            checknum(5);
            
        }
    
}*/


    public static int MaxProfit(int prices[]){
        int buyprice=Integer.MAX_VALUE;
        int n=prices.length;
        int maxprofit=0;
        for(int i=0; i<n; i++){
            if(buyprice<prices[i]){
            int profit=buyprice-prices[i];
            maxprofit=Math.max(profit,maxprofit); 
            }else{
            buyprice=prices[i];
            }
            
        }
        return maxprofit;
    }
    public static void decitobin(int decinum){
        int pow=0;
        int mynum =decinum;
        int binnum= 0;
        while(decinum>0){
            int remainder= decinum%2;
            binnum = binnum +(remainder*(int)Math.pow(10,pow));
            pow++;
            decinum = decinum/2;

        }
        System.out.println("decimal of "+mynum + "to "+ binnum);
    }
        public static void main(String[] args){
            int prices[]={7,1,5,3,6,4};
            decitobin(6);
            //System.out.println("Maximum Profit: " + MaxProfit(prices));
        }
        
    
    }

