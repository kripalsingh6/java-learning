public class binarysearch {
    /*public static int binarysea(int number[], int key){
        int start=0 ,  end=number.length-1;
        while(start<=end){
        int mid=(start+end)/2;
         if(number[mid]==key){
            return mid;
         }
         if(number[mid]<key){
            start = mid+1;
         } else{
            end=mid-1;
         }
         
        }
        return -1;

    }
    public static void main(String[] args) {
        int number[]={10,12,15,18,19,22};
        int key = 19;
        int k=binarysea(number, key);
        System.out.println(k);

    }*/

   /*  public static int binarysearch(int number[],int key){
        int start =0 , end=number.length-1;
        while(start<end){
            int mid = (start + end)/2;
            if(number[mid]==key){
                return mid;

            }
            if(number[mid]<key){
                start=mid++;
            }else{
                end=mid--;
            }
        }
        return -1;
    }
   
    
    public static void main(String[] args) {
        int number[]={2,4,6,8,10,12};
       int key=10;
        
        int k=binarysearch(number, key);
       
        System.out.println(k);
    }*/

    public static void sum(int number[]){
        
        for(int i=0; i<1;i++){
            int index=number[i];
            for(int j=4;j<5;j++){
                int sum=index+number[j];
                System.out.println(sum);
            }
            
        }
        
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10,12};
        sum(number);
    }

}
