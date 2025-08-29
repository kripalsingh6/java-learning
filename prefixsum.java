public class prefixsum {
    public static void prefix(int number[]){
        int curr=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[] =new int[number.length];
        prefix[0]=number[0];
        for(int i=1;i<prefix.length; i++){
            prefix[i]=prefix[i-1]+number[i];
        }
        for(int i=0; i<number.length; i++){
            int start =i;
            for(int j=i; j<number.length; j++){
                int end=j;
            curr= start ==0 ? prefix[end]: prefix[end]-prefix[start-1];
            if(maxsum<curr){
                maxsum=curr;
                
            }
            System.out.println(curr);
            }
            
        }
        System.out.println(maxsum);
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        prefix(number);
    }
}
