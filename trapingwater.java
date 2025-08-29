public class trapingwater {
    /*public static int trappedwater(int bars[]){
        //maxvalue of left bar
        int n=bars.length;
        int maxnum=Integer.MIN_VALUE;
        int leftmax[] = new int  [n];
        leftmax[0]=bars[0];
        for(int i=1; i<n; i++){
            leftmax[i]= Math.max(leftmax[i-1],bars[i]);
        }
        //maxvalue of right bars
        int rightmax[]=new int[n];
        rightmax[n-1]=bars[n-1];
        for(int i=n-2; i>=0; i--){
            rightmax[i]=Math.max(rightmax[i+1],bars[i]);
        }
        int trapwater=0;
        for(int i=0; i<n; i++){
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            trapwater+=waterlevel - bars[i];
        }
        return trapwater;
    }

    public static void main(String[] args) {
        int bars[]={4,2,0,6,1,3};
        System.out.println(trappedwater(bars));
    }*/

    public static int buytosell(int prices[]){
        int buyprice=Integer.MAX_VALUE;
        int n=prices.length;
        int profitsmax=0;
        for(int i=0; i<n; i++){
            if(prices[i]>buyprice){
                 int profits = prices[i]-buyprice;
                 profitsmax=Math.max(profits,profitsmax);
            }else{
                buyprice=prices[i];
            }
        }
        return profitsmax;
    }


    public static void main(String[] args) {
        int prices[]={7,1,4,2,6,8};
        System.out.println(buytosell(prices));
    }
}
