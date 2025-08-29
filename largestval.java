public class largestval {
    public static void sum(int number[]){
        int sum=0;
        for(int i=0; i<number.length; i++){
           
            sum+=number[i];
            
        }
        System.out.println(sum);
        

    }
    public static int getlargest(int number[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<number.length; i++){
            if(largest < number[i]){
                largest= number[i];
            }
             if(smallest>number[i]){
                smallest=number[i];
            }
            
        }
        System.out.println("the smallest array is "+ smallest);
        return largest;
    }
    public static void main(String args[]){
        int number[]={1,3,5,6,4};
        System.out.println(getlargest(number));
        sum(number);
    
    }
    

}
