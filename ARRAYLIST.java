import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ARRAYLIST {
    // public static void main(String[] args){
    //     ArrayList<Integer>list= new ArrayList<>();
    //     // add element 
    //     list.add(1);
    //     list.add(4);
    //     list.add(7);
    //     list.add(9);
        // int maxnum=Integer.MIN_VALUE;
        // int maxnumm=0;
        // for(int i=0; i<list.size(); i++){
        //     // int currnum=list.get(i);
        //     if(list.get(i)>maxnum){
        //     maxnum=list.get(i);
        // }
            
        // }
        // System.out.println(maxnum);
        // System.out.print(" ");

        // int temp=list.get(1);
        //   list.set(1 ,list.get(3));
        //   list.set(3,temp);
        //   System.out.print(list+" ");


    //     System.out.println(list);
    //    int element= list.get(2);
    //    System.out.println(element);

    //    list.remove(3);
    //    System.out.println(list);
    //REPLACE ELMENT
    // list.set(2, 10);
    // System.out.println(list);

    // System.out.println(list.size());
    // for(int i=list.size()-1; i>=0; i--){
    //     System.out.print(list.get(i)+" ");
    // }


    // System.out.println();
    public static int repeatnum()

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>mainlist=new ArrayList<>();
        ArrayList<Integer>list1=new ArrayList<>();
        // list1.add(1); list1.add(2); list1.add(3); list1.add(4); list1.add(5);
        // mainlist.add(list1);
        ArrayList<Integer>list2=new ArrayList<>();
        // list2.add(6); list2.add(7); list2.add(8); list2.add(9); list2.add(10);
        // mainlist.add(list2);

        ArrayList<Integer>list3=new ArrayList<>();
        // list3.add(11); list3.add(12); list3.add(13); list3.add(14); list3.add(15);
        // mainlist.add(list3);
        for(int i=1;i <=5; i++){
            list1.add(i);
            list2.add(i*2);
            list3.add(i*3);
        }
        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);
        System.out.println(mainlist);

        for(int i=0; i<mainlist.size(); i++){
            ArrayList<Integer>Currlist=mainlist.get(i);
            for(int j=0; j<Currlist.size(); j++){
                System.out.print(Currlist.get(j)+" ");
            }
            System.out.println();
        }
        // list.add(1);
        // list.add(3);
        // list.add(7);
        // list.add(9);
        // list.add(5);
        // list.add(4);
        // list.add(6);

        // System.out.println(list);
        // Collections.sort(list);
        // System.out.println(list);
        // Collections.sort(list,Collections.reverseOrder());
        // System.out.println(list);

    }

    }
    

