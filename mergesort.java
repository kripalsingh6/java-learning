public class mergesort {
    public static void merge(int arr[],int si, int mid, int ei){
        int i=si;//idx for 1st sorted parts
        int j=mid+1;// idx 2nd sorted parts
        int k=0;// idx for store temp arr
        int temp[]=new int[ei-si+1];
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] =arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        // for left over element of 1st sorted array
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        // for right over element of 2nd sorted array
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        // copy temp to original
        for(k=0,i=si; k<temp.length; k++,i++){
            arr[i]=temp[k];
        }

    }

     public static void mergesort(int arr[], int si,int ei){
        if(si>=ei){
            return ;
        }
            int mid =si+(ei-si)/2;
            mergesort(arr,si,mid);
            mergesort(arr,mid+1,ei);
            merge(arr, si, mid, ei);
        }
        public static void printarr(int arr[]){
            for(int i=0; i<arr.length; i++){
                System.out.println(arr[i]+" ");
            }
        }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        merge(arr, 0, 0, 0);
        mergesort(arr, 0, arr.length-1);
        printarr(arr);

    }
}
