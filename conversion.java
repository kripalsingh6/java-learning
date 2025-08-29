public class conversion {
    public static void decitobin(int decinum ){
        int binNum=0;
        int pow =0;
        int mynum=decinum;
        while(decinum>0){
            int remainder = decinum%2;
            binNum= binNum + (remainder*(int)Math.pow(10,pow));
            pow++;
            decinum=decinum/2;

        }
        System.out.println(mynum + " is = "+ binNum);
    }
    public static void bintodeci(int binNum){
        int decinum=0;
        int pow=0;
        int mynum =binNum;
        while(binNum>0){
            int lastdigit = binNum%10;
            decinum =decinum + (lastdigit *(int) Math.pow(2, pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println(mynum + " is = " + decinum);
    }
    public static void main(String[] args){
        decitobin(15);
        bintodeci(1001);
        
    }
    
}
