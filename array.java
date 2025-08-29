//import java.util.*;
public class array {

    public static void update(int marks[]){
        for(int i=0; i<=marks.length; i++){
            marks[i]=marks[i]+1;
            System.out.println(marks[i]);
            
        }
    }
        public static void main(String[] args){
        /*int marks[]= new int[50];
        
        Scanner sc = new Scanner(System.in); 

        marks[0] = sc.nextInt();
        marks[1]    = sc.nextInt();
        marks[2]=sc.nextInt();
        System.out.println("phyisc = "+ marks[0]);
        System.out.println("chem = "+marks[1]);
        System.out.println("math = "+ marks[2]);
        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println(percentage);

        int marks[]={90,92,96};
        int size=3;
       int phyics=  marks[0];
       System.out.println(phyics +" length oof array is "+ marks.length);*/

       int marks[]={90,95,98};
       update(marks);
       for(int i=0; i<=marks.length; i++){
        System.out.println(marks[i]+" ");
       }
        
       

        }
    
}
