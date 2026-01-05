import java.util.ArrayList;

public class arraylist_question {
    public static int maxtarget(ArrayList<Integer>list,int target1,int target2){
        int maxnum=Integer.MIN_VALUE;
        int currnum=0;
        for(int i=0; i<list.size(); i++){
            if(list.get(i)==target1 && list.get(i)==target2){
                currnum=list.get(i);
            }
        }
        maxnum=Math.max(maxnum, currnum);
        return maxnum;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(100);
        list.add(200);
        list.add(1);
        list.add(100);
        int target1=100;
       int  target2=1;
        System.out.println(maxtarget(list,target1,target2 ));


    }
}
