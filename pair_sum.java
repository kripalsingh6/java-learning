import java.util.ArrayList;

public class pair_sum {
    // public static boolean sum(ArrayList<Integer>list, int target){

    //     for(int i=0; i<list.size(); i++){
    //         for(int j=i+1; j<list.size(); j++){
    //             if(list.get(i)+list.get(j)==target){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    public static boolean sum(ArrayList<Integer>list, int target){
        int lp=0;
        int rp=list.size()-1;

         
        while(lp<rp){
            if(list.get(lp)+list.get(rp)==target){
               return true;
              
            }else if(list.get(lp)+list.get(rp)<target){
                lp++;
            }else{
                rp--;
            }
            
        }

     return false;
    }

    public static boolean sum2(ArrayList<Integer>list,int target){
        int bp=-1;
        int n=list.size();
        for(int i=0; i<list.size(); i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }
       int lp=bp+1;
       int rp=bp;
       while (lp != rp) {
        if(list.get(rp)+list.get(lp)==target){
            return true;
        }else if(list.get(lp)+list.get(rp)<target){
            lp=(lp+1)%n;
        }else{
            rp=(n+rp-1)%n;
        }
       }
       return false;
    }

    public static void main(String[] args) {
         ArrayList<Integer>list=new ArrayList<>();
        // int target=20;
        // for(int i=1; i<=6; i++){
        //     list.add(i);
        // }
        // System.out.println(sum(list, target)); 

        list.add(3);
        list.add(2);
        list.add(4);
        // list.add(8);
        // list.add(9);
        // list.add(10);
        int target=6;
        System.out.println(sum(list, target));


    }
}
