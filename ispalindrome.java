public class ispalindrome {
    public static boolean ispalindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) !=str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static float shortestdistance(String str){
        int x=0 ,y=0;
        for(int i=0; i<str.length(); i++){
            char dir = str.charAt(i);
            if(dir=='s'){
                y--;
            }else if(dir=='n'){
                y++;
            }else if(dir=='w'){
                x--;
            }else{
                x++;
            }
        }
        int x2= x*x;
        int y2= y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static String subtring(String str , int si , int ei ){
        String subString="";
        for(int i=si; i<=ei; i++){
            subString += str.charAt(i);
        }
        return subString;
    }
    public static void largest(String fruit[]){
        String largest=fruit[0]; 
        for(int i=0; i<fruit.length; i++){
           if(largest.compareTo(fruit[i])<0){
            largest=fruit[i];
           }
        }
        System.out.println(largest);
    }
    public static void stringbuilder(String str){
        StringBuilder st =new StringBuilder("");
        for(char ch ='a';ch<'z'; ch++ ){
            st.append(ch);
        }
        System.out.println(st+" ");
    }
    public static String toUpperCase(String str ){
        StringBuilder st = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        st.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                st.append(str.charAt(i));
                i++;
                st.append(Character.toUpperCase(str.charAt(i)));
            }else{
                st.append(str.charAt(i));
            }
        }
        return st.toString();
    }
    public static String compression(String str){
        String newstr ="";

        for(int i=0; i<str.length(); i++){
         Integer count =1;
         while(i<str.length()-1 && str.charAt(i)== str.charAt(i+1)){
            count++;
            i++;
         }
         newstr += str.charAt(i);
         if(count>1){
            newstr += count.toString();
         }

        }
        return newstr;
    }
    public static void lowercase(String str){
        StringBuilder st=new StringBuilder("");
        char ch =Character.toLowerCase(str.charAt(0));
        st.append(ch);
        Integer count =0;
        String newstr="";
        for(int i=1; i<str.length(); i++){
            // ch =Character.toLowerCase(str.charAt(i));

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
                
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String str ="racecar";
      //  String str="wneenesennn";
        //String fruit[]={"apple","banana","mango"};
       //largest(fruit);
       // String str ="hello world ";
        //System.out.println(subtring(str, 0, 4));
        //stringbuilder(str);
       // String str="hi i am kripal singh";
       //String sb= toUpperCase(str);
       //System.out.println(sb);
       //String str= "aaabbccccdd";
      // System.out.println(compression(str));
     // lowercase(str);

        System.out.println(ispalindrome(str));
        //System.out.println(shortestdistance(str));
    }
    
}
