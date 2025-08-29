public class array_linearsearch {
    /*public static int  linearsearch(int number[] , int key ){
        for(int i= 0; i<=number.length; i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args){
        int number[]={2,5,4,12,10,56,84,58};
        int key =10;
        int index = linearsearch(number, key);
        if(index==-1){
            System.out.println(" invalid value ");
        }else{
            System.out.println("key at index "+ index);
        }
    }*/

    public static int linearsearch(String menu[], String key1){
        for(int i=0; i<menu.length; i++){
            if(menu[i] == key1){
                return i;
            }
        }
        return -1;
    }
    public static int linearsearch2(String menu[], String key2){
        for(int i=0; i<menu.length; i++){
            if(menu[i] == key2){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        String menu[]={"samosa","vada","idli","gulabjamun","sandwich"};
        String key1= "idli";
        String key2="vada";
        System.out.println(linearsearch2(menu, key2));
        System.out.println(linearsearch(menu, key1));
        
        

    }

    
    
}
